package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayView();
    
      
    }
    
    
}
