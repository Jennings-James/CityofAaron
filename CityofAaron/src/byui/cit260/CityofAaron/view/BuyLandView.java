/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import java.util.Scanner;

/**
 *
 * @author pesin
 */

public class BuyLandView extends ViewBase {
    

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public BuyLandView() {

    }
    @Override
    protected String getMessage(){
        return "Main Menu\n"
               
                + "1 - Generate a random number between 17 and 27 for the price of an acre of land. Dispaly the price to the user"
                + "2 - How manu acres of new land do you want to buy?"
                + "3- Enter a number"
                + "4 - If the value is not positive enter value again"
                + "5 - If not enough wheat to purchase enter a value again"
                + "6 - If not enought people to take care 10 acres enter different number"
                + "7 - Subtract Number of acres purchased from the acres owned"
                + "8 - Left wheat from purchase"
                + "9 - left weat own"
                + "M - Return main Menu";
        
                
    }
 
    /**
     * Get the set of inputs from the user;
     * @return
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your choice");

        return inputs;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
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
            case "N":
                startNewGame();
                break;
            case "L":
                laodSaveGame();
                break;
            case "H":
                helpMenu();
                break;
            case "Q":
           RetrunMainMenu();
           break;
    }
             return true;
    }
    private void BuyLandView() {
       NewGameView view = new NewGameView();
       view.displayview();
       
  }

    private void toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void laodSaveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void helpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void RetrunMainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
