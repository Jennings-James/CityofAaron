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
public class GameMenuView extends ViewBase {

    /**
     *  Constructor
     */
  @Override
          protected String getMessage(){
          return "Main Menu\n"
                + "------------\n"
                + "V - View Map\n"
                + "N - Move to new location\n"
                + "M - Manage Crops\n"
                + "L - Live the Year\n"
                + "R - Reports Menu\n"
                + "S - Save Gmme\n"
                + "R - Return to the Main Menu\n";
    }
    @Override 
    public String[] getInputs() {
      String[] inputs = null;

        // This view is not interactive. All it does is shows 
        //the game description. 
        return inputs;
    }
    
    @Override
      public boolean doAction(String[] inputs){
        
        switch (inputs[0].trim().toUpperCase()) {
            case "S":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "H":
                HelpMenu();
                break;
            case "Q":
                System.out.println("How much does it cost to feed the people");
                return false;
        }
        return true;
      }
        
       


   
    private void startNewGame() {
        //Pause for a couple of seconds.
       StartNewGameView view = new StartNewGameView();
       view.displayView();
    }
    private void loadSavedGame() {
        System.out.println("Message");


    }

    private void HelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
