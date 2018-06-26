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
                + "Q - Quit to the Main Menu\n";
    }
    @Override 
    public String[] getInputs() {
      // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Please choose your fate!");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    @Override
      public boolean doAction(String[] inputs){
        
        switch (inputs[0].trim().toUpperCase()) {
            case "V":
                viewMap();
                break;
            case "N":
                moveLocation();
                break;
            case "M":
                manageCrops();
                break;
            case "L":
                liveYear();
                break;
            case "R":
                reportsMenu();
                break;
            case "S":
                saveGame();
                break;
            case "Q":
                System.out.println("Returning you to the Main menu");
                return false;
        }
        return true;
      }
        
      private void viewMap(){
          MapView view = new MapView();
          view.displayView();
      }
      private void moveLocation() {
          System.out.println("coming soon");
      }
      private void manageCrops() {
          ManageCropsMenuView view = new ManageCropsMenuView();
          view.displayView();
      }
      private void liveYear() {
          System.out.println("you will live shortly");
      }
      private void reportsMenu() {
          ReportsMenuView view = new ReportsMenuView();
          view.displayView();
      }
      private void saveGame() {
          System.out.println("No saving yet");
      }
}
