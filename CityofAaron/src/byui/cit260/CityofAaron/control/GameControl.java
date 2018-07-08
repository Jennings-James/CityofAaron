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
    public GameControl() {

    }
    public static Game game;

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

    public static void animalsInStorehouse() {
        Game game = CityofAaron.getCurrentGame();
        System.out.println("Current Animals:\n");
        for (int i = 0; i < game.getAnimals().size(); i++) {
            System.out.println(game.getAnimals().get(i).getName() + "-"
                    + game.getAnimals().get(i).getAge());
        }

    }

    public static Animal findOldestAnimal() {
        Game game = CityofAaron.getCurrentGame();
        Animal oldest = game.getAnimals().get(0);
        for (Animal animal : game.getAnimals()) {
            if (animal.getAge() > oldest.getAge()) {
                oldest = animal;
            }
        }
        return oldest;
    }

}
