/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.control;

import java.util.ArrayList;
import java.io.*;
import cityofaaron.CityofAaron;
import byui.cit260.CityofAaron.model.*;
import byui.cit260.CityofAaron.exceptions.*;
import byui.cit260.CityofAaron.view.ErrorView;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jennings
 */
public class GameControl implements Serializable {

    //Constructor
    public GameControl() {

    }
    public static Game game = CityofAaron.getCurrentGame();

    public static void creatNewGame(String name) {
        Game game = CityofAaron.getCurrentGame();
        //Created the game object.
        game = new Game();
        CityofAaron.setCurrentGame(game);
        //create the player object.
        Player thePlayer = new Player();
        thePlayer.setName(name);
        game.setThePlayer(thePlayer);
        Map theMap = new Map();
        game.setTheMap(theMap);
        game.setWheatStorage(2000);
        game.setAcresOwned(100);
        game.setWheatHarvested(2000);
        //createe the Storehouse object.
        Storehouse storehouse = new Storehouse();
        creatAnimalsList();
    }

    public static void creatAnimalsList() {
        Game game = CityofAaron.getCurrentGame();
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal("chikens", 5));
        animals.add(new Animal("pigs", 2));
        animals.add(new Animal("horses", 10));
        animals.add(new Animal("lamas", 12));
        animals.add(new Animal("cows", 7));

        game.setAnimals(animals);
    }

   public static void saveGame(Game game, String filePath) 
       throws GameControlExceptions, IOException {
       if (game == null) {
           throw new GameControlExceptions("There has been an error saving the Game");
       }
       if (filePath == null) {
           throw new GameControlExceptions("There has been an error please enter a file."); 
       }
       try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
           out.writeObject(game);
       }
       catch (IOException ex) {
           throw new IOException();
       }
   }

   public static Game getGame(String filePath)
       throws GameControlExceptions, IOException {
       if (filePath == null) {
           throw new GameControlExceptions("There has been an error please enter a file."); 
       }
       try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
           Game game = (Game) in.readObject();
           CityofAaron.setCurrentGame(game);
       }catch (IOException ex) {
           throw new IOException();
   }    catch (ClassNotFoundException ex) {
            ErrorView.display(filePath, "Class not found error");
        }
   
       return game;
   }
}
