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
public class HelpMenuView {
    

    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public HelpMenuView(){
        
        message = "Help Menu\n"
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
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
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
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        
        switch (inputs[0].trim().toString()) {
            case "1":
                System.out.println("The goals of the game are\n"
                        + "1st-Keep the people in the city feed.\n"
                        + "2nd-Manage the land and the crops\n"
                        + "    to help the city prosper.");
                break;
            case "2":
                System.out.println(" The city of Aaron is mentioned briefly in\n"
                        + "Alma 8:13 in the Book of Mormon.\n"
                        + "Now when the people had said this, and withstood all\n"
                        + "his words, and reviled him, and spit upon him, and\n"
                        + "caused that he should be cast out of their city, he\n"
                        + "departed thence and took his journey towards the city\n"
                        + "which was called Aaron");
                break;
            case "3":
                System.out.println("Return to the Main Menu and select View Map");
                break;
            case "4":
                System.out.println("After you start a game select Move to a new\n"
                        + " location from the Game Menu");
                break;
            case "5":
                System.out.println("After you start a game select Reports Menu\n"
                        + "from the Game Menu then select the item you wish to\n"
                        + "view from the Reports Menu");
                break;
            case "6":
                System.out.println("Good luck in the game");
                return false;
        }
  
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void startMainMenu(){
        MainMenuView view = new MainMenuView();
        view.displayView();
    }
}

