/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.control.ManageCropsControl;
import byui.cit260.CityofAaron.model.Game;
import java.util.Scanner;
import byui.cit260.CityofAaron.exceptions.*;

/**
 *
 * @author bkemble
 */
public class SellLandView extends ViewBase {

    int price = ManageCropsControl.calculateLandPrice();
    int acresSold = 0;

    public SellLandView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "The value of land is " + price + " bushels per acre.";
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

        inputs[0] = getUserInput("How much land would you like to sell? ");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        int acresToSell = 0;
        try {
            acresToSell = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "Please enter a number");
        }
        try {

            acresSold = ManageCropsControl.sellLand(price, acresToSell);
        } catch (ManageCropsControlException ie) {
            ErrorView.display(this.getClass().getName(), ie.getMessage());
        }
         this.console.println("You have sold " + acresSold + "acres of your land.");
        return false;
    }
}
