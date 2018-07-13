/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.control.ManageCropsControl;
import java.util.Scanner;
import byui.cit260.CityofAaron.control.*;
import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.exceptions.*;

/**
 *
 * @author kemblesque
 */
public class PlantTheCropsView extends ViewBase {

    int acresPlanted = 0;

    public PlantTheCropsView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "How many acres do you want to plant";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Enter the number up to total acres owned");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        int numAcres = 0;
        try {
            numAcres = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "please enter a number.");
        }
        int landOwned = GameControl.game.getAcresOwned();
        int wheatStored = GameControl.game.getWheatStorage();

        try {
            acresPlanted = ManageCropsControl.plantCrops(numAcres, wheatStored, landOwned);
        } catch (ManageCropsControlException ie) {
            ErrorView.display(this.getClass().getName(), ie.getMessage());
            return false;
        }
        GameControl.game.setAcresPlanted(acresPlanted);
        this.console.println("You have planted " + acresPlanted + "acres of wheat.");
        return false;
    }
}
