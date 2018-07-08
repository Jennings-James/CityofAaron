/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import java.util.Scanner;

/**
 *
 * @author jennings
 */
public class ManageCropsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ManageCropsMenuView() {
        super();

    }

    @Override
    protected String getMessage() {
        return "Manage The Crops Menu\n"
                + "---------------------\n"
                + "B-Buy Land\n"
                + "S-Sell Land\n"
                + "F-Feed The People\n"
                + "P-Plant Crops\n"
                + "T-Pay The Tithes And Offerings\n"
                + "R-Return To The Game Menu\n";
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

        inputs[0] = getUserInput("Plese choose a menu option.");

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

        switch (inputs[0].trim().toUpperCase()) {
            case "B":
                buyLand();
                break;
            case "S":
                sellLand();
                break;
            case "F":
                feedThePeople();
                break;
            case "P":
                plantCrops();
                break;
            case "T":
                payTheTithesAndOfferings();
                break;
            case "R":
                return false;

        }

        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void buyLand() {
        BuyLandView view = new BuyLandView();
        view.displayView();
    }

    private void sellLand() {
        SellLandView view = new SellLandView();
        view.displayView();
    }

    private void feedThePeople() {
        FeedThePeopleView view = new FeedThePeopleView();
        view.displayView();

    }

    private void plantCrops() {
        PlantTheCropsView view = new PlantTheCropsView() {
        };
        view.displayView();

    }

    private void payTheTithesAndOfferings() {
        PayTheTithesAndOfferingsView view = new PayTheTithesAndOfferingsView();
        view.displayView();
    }

    private void startMainMenu() {
        MainMenuView view = new MainMenuView();
        view.displayView();
    }

}
