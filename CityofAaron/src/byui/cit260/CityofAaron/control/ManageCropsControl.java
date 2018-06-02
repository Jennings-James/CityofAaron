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
/**
 *
 * @author jennings
 */
public class ManageCropsControl {
    /*Random number generator outputs a random between the 2 ints passed to it*/
    private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
    }
    /*Calculation for crop harvest*/
    public static int calcCropHarvest (int tithing, int acresPlanted) {
        int yieldPerAcre = 0;
        int wheatHarvested;
        if (tithing < 0 || tithing > 100) { //check for valid tithing
            return -1;
        }
        if (tithing < 8) {
            yieldPerAcre = getRandomNumberInRange(1,3);
        }
        if (tithing > 7 && tithing < 12) {
            yieldPerAcre = getRandomNumberInRange(2,4);
        }
        if (tithing > 12) {
            yieldPerAcre = getRandomNumberInRange(2,5);
        }
        wheatHarvested = yieldPerAcre * acresPlanted;
        return wheatHarvested;
    }

/*  Start James Jennings individual assignment.
*calculateLandPlanted (numAcres: int, wheatStored: int, landOwned: int) returns an int
*if numAcres is less than 0 then return -1
*if numAcres is not an int return -1 (should this be a question? The var
*numAcres will be declared as int, so it cannot be anything else)
*if numAcres is > landOwned return -1
*if numAcres / 2 is > wheatStored return -1
*return (numAcres / 2) as wheat used
*end
*/

    public static int plantCrops (int numAcres, int wheatStored, int landOwned) {
        if (numAcres < 0) {
            return -1;
        }
        if (numAcres > landOwned) {
            return -1;
        }
        if ((numAcres / 2) > wheatStored) {
            return -1;
        }
        else return numAcres / 2;
    }
}