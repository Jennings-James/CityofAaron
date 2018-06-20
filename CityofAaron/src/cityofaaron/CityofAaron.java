package cityofaaron;

import byui.cit260.CityofAaron.view.View;
import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.view.StartProgramView;

/**
 *
 * @author jennings
 */
public class CityofAaron {

    //this is the place to store the current Game object in the main class.
    public static Game currentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game game) {
        currentGame = game;
    }
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        View startProgramView = new StartProgramView();
        startProgramView.displayView();
    
      
    }
    
    
}
