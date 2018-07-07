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
        CityofAaron.currentGame = game;
    }
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        View startProgramView = new StartProgramView();
        startProgramView.displayView();
        }
        catch (Throwable exc) {
            System.out.println("The program has encountered\n"
                    + " an error and will now exit.");
        }
        finally {
            printStackTrace();  
        }
    }    
        
    public static Throwable printStackTrace() {
       // Not sure how to get the stack trace to print?
       /* System.out.println(printStackTrace());*/
        
        return null;
        }
      
    
    
    
}
