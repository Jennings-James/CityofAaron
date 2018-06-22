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
public class StartProgramView extends ViewBase {
    
   
    /**
     * Constructor
     */
    public StartProgramView(){
        super();         
    }
    
    @Override
    protected String getMessage() {
        return "Welcome to the city of Aaron. You have been summoned here by\n"
                + "the High Priest to assume your role as ruler of the city.\n"
                + "Your responsibility is to buy and sell land, determine how\n"
                + "much wheat to plant each year and how much to set aside to\n"
                + "feed your people. In addition, it will be your job to pay an\n"
                + "annual tithe on the wheat that is harvested. If you fail to\n"
                + "provide enough wheat for the people, people will starve,\n"
                + "some people will die, and your workforce will be diminished.\n"
                + "Plan carefully. And Oh, there is always a danger of rats\n"
                + "eating your wheat.";
    }
   
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // This view is not interactive. All it does is shows 
        //the game description. 
        
        return null;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        // There are noinputs for this view. We're just going to pause
        //for a couple of seconds, and then launch the MainMenuView.
        startMainMenuView();
        
        // return false so whoever called us doesn't call us again.
       
        return false;
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void startMainMenuView(){
        pause(2000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
        
    }
}

