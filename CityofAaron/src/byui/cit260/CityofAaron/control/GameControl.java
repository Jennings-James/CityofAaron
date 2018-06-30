/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.control;
import java.util.ArrayList;
import java.io.Serializable;
import cityofaaron.CityofAaron;
import byui.cit260.CityofAaron.model.*;
/**
 *
 * @author jennings
 */
public class GameControl implements Serializable {
    
    
    //Constructor
    public GameControl(){
        
    }
    public static void creatNewGame (String name) {
        //Created the game object.
        Game game = new Game();
        CityofAaron.setCurrentGame(game);
        //create the player object.
        Player thePlayer = new Player();
        thePlayer.setName(name);
        game.setThePlayer(thePlayer);
        Map theMap = new Map();
        game.setTheMap(theMap);
        
    }
        //createe the Storehouse object.
      public static void creatStorehouse() {
          Storehouse storehouse = new Storehouse();
         
        
          
      }  
        
    
    
    
    
    
    
    
}
