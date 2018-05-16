/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.model.Player;
import byui.cit260.CityofAaron.model.Storehouse;
import byui.cit260.CityofAaron.model.Map;

/**
 *
 * @author jennings
 */
public class CityofAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(150);
        theGame.setAcresOwned(1100);
        theGame.setWheatStorage(3500);
        theGame.setCurrentYear(2);
       
        System.out.println(theGame.toString());
    }
    
}
