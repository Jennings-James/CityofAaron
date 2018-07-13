/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.control.*;

public class FeedThePeopleView extends ViewBase {

    //Constructor
    public FeedThePeopleView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Your people are hungry and will starve if you do not give\n"
                + "them enough to eat";
    }

    @Override
    protected String[] getInputs() {
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("How many bushels do you want to feed the people?", true);

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        int currentPopulation = GameControl.game.getCurrentPopulation();
        int wheatStorage = GameControl.game.getWheatStorage();
        int bushelsToFeed = 0;
        int feedPeople = 0;
        try {
            bushelsToFeed = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "please enter a number.");
        }

        feedPeople = ManageCropsControl.feedThePeople(currentPopulation, wheatStorage, bushelsToFeed);
        if (feedPeople == currentPopulation) {
             this.console.println("Congradulations no one starved");
            GameControl.game.setWheatStorage(wheatStorage - bushelsToFeed);
        } else {
            GameControl.game.setWheatStorage(wheatStorage - bushelsToFeed);
        }
        return false;

    }

}
