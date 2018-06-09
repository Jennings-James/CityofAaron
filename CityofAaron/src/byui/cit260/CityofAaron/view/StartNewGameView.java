/**
 *
 * @author bkemble
 */

package byui.cit260.CityofAaron.view;
import cityofaaron.CityofAaron;
import  byui.cit260.CityofAaron.model.Player;
import  byui.cit260.CityofAaron.model.Game;
import  java.util.Scanner;

public class StartNewGameView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    

    /**
     * Constructor
     */
    public StartNewGameView(){
        
     message = "A New Game Is About To Begin: \n";
     
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
        
        inputs[0] = getUserInput("Enter your name: if you're not upto the\n"
                + "challange press enter to return to the Main Menu:", true);
        
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
        // There is only one action here; Initialize the Game and
        // set it in the main CityofAaron class. 
        
        // If the player presses enter error. 
        // error will return to Main Menu.
        
      if (inputs[0] == null || inputs[0].equals("")) {
			System.out.println("Better to never try than to fail.\n"
                                + "Removing you to the Main Menu: ");
			return false;
		}
		
		String playerName = inputs[0];
		createAndStartGame(playerName);
		
		// Return false to prevent loop.
        return false;
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
    
    
    private boolean someActionHandler(){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        
        return true;
    }
    
    //
        private void createAndStartGame(String playerName){
        // Will work eventually 
        // Game game = GameControl.creatNewGame(playerName)
        
        
        Player player = new Player();
        player.setName(playerName);
        
        Game game = new Game();
        game.setThePlayer(player);
        
        CityofAaron.setCurrentGame(game);
       
        
        System.out.println();
        System.out.println("Welcome to The City of Aaron: " 
                + CityofAaron.getCurrentGame().getThePlayer().getName() + "!\n");
      
    }
}
