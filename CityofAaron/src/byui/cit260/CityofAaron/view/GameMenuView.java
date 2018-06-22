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
                + "S - Start Menu"
                + "L - Load Game\n"
                + "H - Help menu\n"
                + "Q - Quit\n";
    }
    @Override 
    public String[] getInputs() {
      String[] inputs = null;

        // This view is not interactive. All it does is shows 
        //the game description. 
        return inputs;
    }
    

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
        
       

    /**
     * Control this view's display/prompt/action loop until the user chooses and
     * action that causes this view to close.
     */
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {
            boolean message = false;

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
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
