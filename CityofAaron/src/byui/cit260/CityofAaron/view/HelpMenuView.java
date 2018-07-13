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
public class HelpMenuView extends ViewBase {

    /**
     * Constructor
     */
    public HelpMenuView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Help Menu\n"
                + "---------\n"
                + "1-What are the goals of the game?\n"
                + "2-Where is the city of Aaron?\n"
                + "3-Howdo I view the map\n"
                + "4-How do I move to another location?\n"
                + "5-How do I display a list of animals,\n"
                + "  provisions and tools in the city of Aaron?\n"
                + "6-Back to Main Menu";
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

        inputs[0] = getUserInput("Enter the number for help.");

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

        switch (inputs[0].trim()) {
            case "1":
                this.console.println("The goals of the game are\n"
                        + "1st-Keep the people in the city feed.\n"
                        + "2nd-Manage the land and the crops\n"
                        + "    to help the city prosper.");
                break;
            case "2":
                this.console.println(" The city of Aaron is mentioned briefly in\n"
                        + "Alma 8:13 in the Book of Mormon.\n"
                        + "Now when the people had said this, and withstood all\n"
                        + "his words, and reviled him, and spit upon him, and\n"
                        + "caused that he should be cast out of their city, he\n"
                        + "departed thence and took his journey towards the city\n"
                        + "which was called Aaron");
                break;
            case "3":
                this.console.println("Return to the Main Menu and select View Map");
                break;
            case "4":
                this.console.println("After you start a game select Move to a new\n"
                        + " location from the Game Menu");
                break;
            case "5":
                this.console.println("After you start a game select Reports Menu\n"
                        + "from the Game Menu then select the item you wish to\n"
                        + "view from the Reports Menu");
                break;
            case "6":
                this.console.println("Good luck in the game");
                return false;
        }

        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void startMainMenu() {
        MainMenuView view = new MainMenuView();
        view.displayView();
    }
}
