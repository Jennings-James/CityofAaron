/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;
import java.util.Scanner;
import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.control.GameControl;
/**
 *
 * @author bkemble
 */
public class ReportsMenuView extends ViewBase {
    private static Game game;
    /**
     * Constructor
     */
    public ReportsMenuView(){
        super();
        
    }
    /**
     * The message that will be displayed by this view.
     *@Return
     */
    @Override
    protected String getMessage() {
        return  "Reports Menu\n"
                + "--------------------------------------\n"
                + "1 - View the authors of this game\n"
                + "2 - View the animals with ages in the Storehouse\n"
                + "3 - View the tools in the storehouse\n"
                + "4 - View the provisions in the storehouse\n"
                + "/n"
                + "5 - Return to the Game Menu.\n"
                + "-------------------------------------\n";
    }           
    /**
     * Get the set of inputs from the user.
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
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        switch (inputs[0].trim().toUpperCase() ){
            case "1":
                viewAuthors();
                break;
            case "2":
                animalsInStorehouse();
                break;
            case "3":
                toolsInStorehouse();
                break;
            case "4":
                provisionsInStorehouse();
                break;
            case "5": // return to main menu
                return false;
            default : 
                System.out.println("\"" + inputs[0].trim() + "\" is not a valid choice.");
                System.out.println("Please enter a number between 1 and 5\n");
        }
             
        return true;
    }
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    public void viewAuthors(){
        System.out.println("\nHow do I move to another location?\n"
                + "Will eventually show the authors of the game\n");
    }
   
     public void animalsInStorehouse(){
        GameControl.animalsInStorehouse();
     }    

    
    public void toolsInStorehouse(){
        System.out.println ("\nTools in storehouse:\n"
                + "Will eventually show the tools in the storehouse\n"
                + "And the usr will be able to save the report\n");
    }
    
    public void provisionsInStorehouse(){
        System.out.println("\nProvisions in storehouse:\n"
                + "This will eventually show the provisions in the storehouse\n"
                + "And the user will be able to save the report\n");
    }
   
        
}
    

