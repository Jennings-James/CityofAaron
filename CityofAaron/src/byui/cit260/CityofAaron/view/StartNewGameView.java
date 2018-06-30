/**
 *
 * @author bkemble
 */

package byui.cit260.CityofAaron.view;
import cityofaaron.CityofAaron;
import  byui.cit260.CityofAaron.model.Player;
import  byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.control.GameControl;
import  java.util.Scanner;

public class StartNewGameView extends ViewBase {
    
    
    /**
     * Constructor
     */
    public StartNewGameView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "A New Game Is About To Begin: \n";
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
        
        inputs[0] = getUserInput("Enter your name: if you're not up to the\n"
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
    @Override
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
		
		String name = inputs[0];
		createAndStartGame(name);
		
		// Return false to prevent loop.
        gameMenu();
        return false;
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
    
    
        private void createAndStartGame(String name){
         
        GameControl.creatNewGame(name);
        
        
       /* Player player = new Player();
        player.setName(playerName);
        
        //Game game = new Game();
        game.setThePlayer(player);
        
        CityofAaron.setCurrentGame(game);
       */
        
        System.out.println("Welcome to The City of Aaron: " 
                + CityofAaron.getCurrentGame().getThePlayer().getName() + "!\n");
      
    }
        private void gameMenu() {
            GameMenuView view = new GameMenuView();
            view.displayView();
        }
}
