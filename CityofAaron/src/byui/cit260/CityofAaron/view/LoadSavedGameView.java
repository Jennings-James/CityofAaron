/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

/**
 *
 * @author jennings
 */
public class LoadSavedGameView extends ViewBase {
    
    /*
    *Constructor
    */
    public LoadSavedGameView() {
        super();
    }
    @Override
    protected String getMessage() {
        return "To load a saved Game you must know the exact file location in\n"
                + "which it is saved.";
    }
    
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Please enter the file location.");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    
    /*
    *This will be coded to find the saved data andload it.
    */
    @Override
    public boolean doAction(String[] inputs){
        System.out.println("The load saved game is coming soon");
        
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
