/*  Start Team assingment
*harvestTheCrops (tithing: int, acerPlanted: int) returns an int
*if tithing is < 0 or tithing is >100 return -1
*if tithing is < 8 create random generated number between 1 and 3
*if tithing is > 8 and < 12 create random generated number between 2 and 4
*if tithing is >12 create random generated number between 2 and 5
*int yieldPerAcre =  random number 
*int wheatHarvested =  yieldPerAcre  *  acrePlanted
*end
 */
package byui.cit260.CityofAaron.control;

import byui.cit260.CityofAaron.model.Game;
import java.util.Random;
import byui.cit260.CityofAaron.exceptions.ManageCropsControlException;
import cityofaaron.CityofAaron;

/**
 *
 * @author jennings
 */
public class ManageCropsControl {

    /*Random number generator outputs a random between the 2 ints passed to it*/
    private static Random randomGenerator = new Random();

    protected static void setRandomGenerator(Random testRandom) {
        randomGenerator = testRandom;
    }

    private static int getRandomNumberInRange(int min, int max) {
        //Random r = new Random();
        //return r.nextInt((max - min) + 1) + min;
        return randomGenerator.nextInt((max - min) + 1) + min;
    }

    /*Calculation for crop harvest*/
    public static int calcCropHarvest(int tithing, int acresPlanted)
            throws ManageCropsControlException {
        int yieldPerAcre = 0;
        int wheatHarvested;
        if (tithing < 0 || tithing > 100) { //check for valid tithing
            throw new ManageCropsControlException("The tithing needs to be between 0 and 100");
        }
        if (tithing < 8) {
            yieldPerAcre = getRandomNumberInRange(1, 3);
        }
        if (tithing > 7 && tithing <= 12) {
            yieldPerAcre = getRandomNumberInRange(2, 4);
        }
        if (tithing > 12) {
            yieldPerAcre = getRandomNumberInRange(2, 5);
        }
        wheatHarvested = yieldPerAcre * acresPlanted;
        return wheatHarvested;
    }

    /* Start Beau Kembles Individual assignment. 
* calculateSellLand 
* if acresToSell < 0 return error message
* if acresOwned < acresToSell return error message
* if price > wheatStored return error message
* newWheat = acresToSell * randomGeneratedNumber
* setAcresOwned = getAcresOwned - acresToSell
* setWheatInStorrage = getWheatInStorage + newWheat
     */
    public static int calculateLandPrice() {
        //calculate a random price of land between 17 and 27
        //return: price of land 
        int landPrice = getRandomNumberInRange(17, 27);
        return landPrice;
    }

    public static int sellLand(int landPrice, int acresToSell)
            throws ManageCropsControlException {
        Game game = CityofAaron.getCurrentGame();
        //if acresToSell < 0 return -1
        if (acresToSell < 0) {
            throw new ManageCropsControlException("Must be a positive amount");
        }

        //if acresToSell > acresOwned, return -1
        int acresOwned = game.getAcresOwned();
        if (acresToSell > acresOwned) {
            throw new ManageCropsControlException("You cannot sell more then you own");
        }

        //acresOwned = acresOwned - acresToSell
        acresOwned = acresOwned - acresToSell;
        game.setAcresOwned(acresOwned);

        //wheatStorage = wheatStorage + acresToSell * landPrice
        int wheatStorage = game.getWheatStorage();
        wheatStorage = wheatStorage + (acresToSell * landPrice);
        game.setWheatStorage(wheatStorage);

        //return acresOwned    
        return acresOwned;

    }

    public static int buyLand(int landPrice, int acresToBuy)
            throws ManageCropsControlException {
        Game game = CityofAaron.getCurrentGame();
        if (acresToBuy < 0) {
            throw new ManageCropsControlException("Must be a positive amount");
        }
        int acresOwned = game.getAcresOwned();
        int wheat = game.getWheatStorage();
        if (acresToBuy * landPrice > wheat) {
            throw new ManageCropsControlException("You do not have enough wheat");
        }
        acresOwned = acresOwned + acresToBuy;
        game.setAcresOwned(acresOwned);

        int wheatStorage = game.getWheatStorage();
        wheatStorage = wheatStorage - (acresToBuy * landPrice);
        game.setWheatStorage(wheatStorage);

        return acresOwned;
    }

    public static int plantCrops(int numAcres, int wheatStored, int landOwned)
            throws ManageCropsControlException {
        Game game = CityofAaron.getCurrentGame();
        if (numAcres < 0) {
            throw new ManageCropsControlException("Enter a positive number");
        }
        if (numAcres > landOwned) {
            throw new ManageCropsControlException("You cannot plant more land then you own");
        }
        if ((numAcres / 2) > wheatStored) {
            throw new ManageCropsControlException("You do not have enough wheat for that");
        } else {
            game.setWheatStorage(wheatStored - (numAcres / 2));
        }
        return numAcres;

    }

    public static double payTheTithesAndOfferings(double percentToPay, int wheatHarvested)
            throws ManageCropsControlException {
        Game game = CityofAaron.getCurrentGame();
        if (percentToPay < 0 || percentToPay > 100) {
            throw new ManageCropsControlException("Your tithing must between 0 and 100");
        }
        double tithe = (percentToPay / 100) * wheatHarvested;
        int newTithe = (int) Math.round(tithe);
        game.setWheatStorage(wheatHarvested - newTithe + GameControl.game.getWheatStorage());

        return tithe;
    }

    private static double getRandomNumberInRange(double min, double max) {
        //Random r = new Random();
        //return r.nextInt((max - min) + 1) + min;
        return randomGenerator.nextInt((int) ((max - min) + 0x1)) + min;
    }

    public double calculateWheatEatenByRats(double tithing, int eatenByRats) {
        Game game = CityofAaron.getCurrentGame();
        //calculate a random number between 1 and 100
        //if less than 30 some wheat will be eaten by rats
        int wheatStorage = game.getWheatStorage();
        int ratsChance = getRandomNumberInRange(1, 100);
        if (ratsChance < 30) {
            //If T&O 8-12% random value between 3-7% of wheatStorage eaten by rats 
            if (tithing > 0.07 && tithing < 0.12) {
                eatenByRats = (int) getRandomNumberInRange(0.03, 0.07);
            } //If T&O < 8% random value between 6-10% of wheatStorage eaten by rats
            else if (tithing < 0.08) {
                eatenByRats = (int) getRandomNumberInRange(0.06, 0.1);
            } //If T&O > 12% random value between 3-5% of wheatStorage eaten by rats 
            else if (tithing > 0.12) {
                eatenByRats = (int) getRandomNumberInRange(0.03, 0.05);
            } //if random number > 30
            else {
                eatenByRats = 0;
            }
        }

        wheatStorage = wheatStorage - (eatenByRats * wheatStorage);
        return wheatStorage;
    }

    public static int feedThePeople(int currentPopulation, int wheatStorage, int bushelsToFeed) {
        Game game = CityofAaron.getCurrentGame();
        int bushelsNeeded = currentPopulation * 20;
        int peopleStarved = 0;
        if (bushelsToFeed > wheatStorage) {
            return -1;
        }
        if (bushelsToFeed < 0) {
            return -1;
        }
        if (bushelsToFeed > bushelsNeeded) {
            return currentPopulation;
        }
        if (bushelsToFeed < bushelsNeeded) {
            peopleStarved = (bushelsNeeded - bushelsToFeed) / 20;
            return peopleStarved;
        }
        game.setCurrentPopulation(currentPopulation - peopleStarved);
        System.out.println(peopleStarved + " people starved");
        return -1;
    }
}
