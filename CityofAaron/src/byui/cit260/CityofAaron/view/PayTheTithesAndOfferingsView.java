/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.control.*;
import java.util.Scanner;
import byui.cit260.CityofAaron.exceptions.ManageCropsControlException;
import byui.cit260.CityofAaron.model.Game;

/**
 *
 * @author jennings
 */
public class PayTheTithesAndOfferingsView extends ViewBase {

    double tithe = 0;

    /*
     * Constructor
     */
    public PayTheTithesAndOfferingsView() {
        super();

    }

    @Override
    protected String getMessage() {
        return "The commandment of God is to pay 10% of your income each yaer\n"
                + "Youe may choose to what extent you follow Gods law.\n"
                + "Please decide what percentage you want to pay from 0-100.\n"
                + "The scriptures say when you pay an honest tith the Lord will\n"
                + "open the windows of heaven and pore out blessing upon you.";
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

        inputs[0] = getUserInput("Pease enter the precent you wish to pay as a\n"
                + "whole number.(i.e. 10 = 10%)");

        // Repeat for each input you need, putting it into its proper slot in the array.
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
        int wheatHarvested = GameControl.game.getWheatHarvested();
        double percent = 0;
        try {
            percent = Integer.parseInt(inputs[0]);

        } catch (NumberFormatException nfe) {
            System.out.println("please enter a number.");
        }
        try {
            tithe = ManageCropsControl.payTheTithesAndOfferings(percent, wheatHarvested);
        } catch (ManageCropsControlException ie) {
            System.out.println(ie.getMessage());
            return false;
        }
        /*int newTithe = (int) tithe;*/
        GameControl.game.setTithePaid(tithe);
        System.out.println("You have paid " + tithe + " bushels of wheat in tihing.");
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean someActionHandler() {
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.

        return true;
    }

}
