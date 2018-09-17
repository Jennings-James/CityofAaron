/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import java.util.Scanner;
import byui.cit260.CityofAaron.model.*;
import byui.cit260.CityofAaron.control.GameControl;
import cityofaaron.CityofAaron;

/**
 *
 * @author bkemble
 */
public class ReportsMenuView extends ViewBase {

    private static Game game;

    /**
     * Constructor
     */
    public ReportsMenuView() {
        super();

    }

    /**
     * The message that will be displayed by this view.
     *
     * @Return
     */
    @Override
    protected String getMessage() {
        return "Reports Menu\n"
                + "--------------------------------------\n"
                + "1 - View the authors of this game\n"
                + "2 - View the animals with ages in the Storehouse\n"
                + "3 - View the tools in the storehouse\n"
                + "4 - View the provisions in the storehouse\n"
                + "5 - Print the animals report.\n"
                + "6 - Return to the Game Menu.\n"
                + "-------------------------------------\n";
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

        inputs[0] = getUserInput("Please make a selection");

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
            case "1":
                viewAuthors();
                break;
            case "2":
                animalsInStorehouse();
                findOldestAnimal();
                break;
            case "3":
                toolsInStorehouse();
                break;
            case "4":
                provisionsInStorehouse();
                break;
            case "5":
                printAnimals();
                break;
            case "6": // return to main menu
                return false;
            default:
                this.console.println("\"" + inputs[0].trim() + "\" is not a valid choice.");
                this.console.println("Please enter a number between 1 and 5\n");
        }

        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    public void viewAuthors() {
        this.console.println("\nHow do I move to another location?\n"
                + "Will eventually show the authors of the game\n");
    }

    /* public void animalsInStorehouse() {
        GameControl.animalsInStorehouse();
        Animal oldestAnimal = GameControl.findOldestAnimal();
         this.console.println("The oldest animal in the Sotrehouse is  " + oldestAnimal);
    }*/
    public void toolsInStorehouse() {
        this.console.println("\nTools in storehouse:\n"
                + "Will eventually show the tools in the storehouse\n"
                + "And the usr will be able to save the report\n");
    }

    public void provisionsInStorehouse() {
        this.console
                .println("\nProvisions in storehouse:\n"
                        + "This will eventually show the provisions in the storehouse\n"
                        + "And the user will be able to save the report\n");
    }

    public Animal animalsInStorehouse() {
        Game game = CityofAaron.getCurrentGame();
        for (int i = 0; i < game.getAnimals().size(); i++) {
            this.console.println(game.getAnimals().get(i).getName() + "-"
                    + game.getAnimals().get(i).getAge());
        }
        return null;
    }

    public Animal findOldestAnimal() {
        Game game = CityofAaron.getCurrentGame();
        Animal oldest = game.getAnimals().get(0);
        for (Animal animal : game.getAnimals()) {
            if (animal.getAge() > oldest.getAge()) {
                oldest = animal;
            }
        }
        this.console.println("The oldest animals in the Sotrehouse are the " + oldest.getName());
        return oldest;
    }

    public void printAnimals() {
        PrintAnimalsView view = new PrintAnimalsView();
        view.displayView();
    }
}
