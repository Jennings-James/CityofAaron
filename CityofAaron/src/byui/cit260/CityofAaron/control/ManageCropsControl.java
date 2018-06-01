/*harvestTheCrops (tithing: int, acerPlanted: int) returns an int
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
    private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
    }
    
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
}
