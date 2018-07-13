/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.control.ManageCropsControl;
import java.util.Scanner;
import byui.cit260.CityofAaron.exceptions.*;

/**
 *
 * @author pesin
 */
public class BuyLandView extends ViewBase {

    int price = ManageCropsControl.calculateLandPrice();
    int acresBought = 0;

    /**
     * Constructor
     */
    public BuyLandView() {
        super();
    }

    /**
     * The message that will be displayed by this view.
     *
     * @return
     */
    @Override
    protected String getMessage() {
        return "The value of land is " + price + " bushels per acre";

    }

    /**
     * Get the set of inputs from the user;
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("How many acres would you like to buy.");

        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {
        int acresToBuy = 0;

        try {
            acresToBuy = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "please enter a number.");
        }
        try {
            acresBought = ManageCropsControl.sellLand(price, acresToBuy);
        } catch (ManageCropsControlException ie) {
            ErrorView.display(this.getClass().getName(), ie.getMessage());
        }
        this.console.println("You have sold " + acresBought + "acres of your land.");
        return false;
    }

}
