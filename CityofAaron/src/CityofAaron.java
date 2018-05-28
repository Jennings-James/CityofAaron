/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.model.ItemType;
import byui.cit260.CityofAaron.model.Player;
import byui.cit260.CityofAaron.model.Storehouse;
import byui.cit260.CityofAaron.model.Map;
import byui.cit260.CityofAaron.model.InventoryItem;
import byui.cit260.CityofAaron.model.Animal;
import byui.cit260.CityofAaron.model.Condition;
import byui.cit260.CityofAaron.model.Provision;

/**
 *
 * @author jennings
 */
public class CityofAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        //code for testing the modle classes
        Game theGame = new Game();
        Player newPlayer = new Player();
        newPlayer.setName("Fred");
        InventoryItem newItem = new InventoryItem();
        newItem.setItemType(ItemType.Tool);
        newItem.setCondition(Condition.Good);
        newItem.setQuantity(25);
        Animal theAnimal = new Animal();
        theAnimal.setName("horse");
        theAnimal.setAge(12);
        Provision theProvision = new Provision();
        theProvision.setName("corn");
        theProvision.setPerishable(true);
            
        
        
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(150);
        theGame.setAcresOwned(1100);
        theGame.setWheatStorage(3500);
        theGame.setCurrentYear(2);
        
       
        System.out.println(newPlayer.toString() + " " 
                + theGame.toString() + " " 
                + newItem.toString() + " "
                + theAnimal.toString() + " "
                + theProvision.toString());
        
    }
    
    
}
