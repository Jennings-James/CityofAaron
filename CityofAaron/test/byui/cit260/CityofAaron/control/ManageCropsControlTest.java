
package byui.cit260.CityofAaron.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jennings
 */
public class ManageCropsControlTest {
    
    public ManageCropsControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of calcCropHarvest method, of class ManageCropsControl.
     */
    @Test
    public void testCalcCropHarvest() {
        System.out.println("calcCropHarvest");
        int tithing = 0;
        int acresPlanted = 0;
        int expResult = 0;
        int result = ManageCropsControl.calcCropHarvest(tithing, acresPlanted);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCase1() {
        int result = ManageCropsControl.calcCropHarvest(10,100);
        assertEquals(300, result);
    }
    
    @Test
    public void testCase2() {
        int result = ManageCropsControl.calcCropHarvest(6,100);
        assertEquals(100, result);
    }
    
    @Test
    public void testCase3() {
        int result = ManageCropsControl.calcCropHarvest(15,100);
        assertEquals(400, result);
    }
    
    @Test
    public void testCase4() {
        int result = ManageCropsControl.calcCropHarvest(0,100);
        assertEquals(200, result);
    }
    
    @Test
    public void testCase5() {
        int result = ManageCropsControl.calcCropHarvest(100,100);
        assertEquals(500, result);
    }
    
    @Test
    public void testCase6() {
        int result = ManageCropsControl.calcCropHarvest(-10,100);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase7() {
        int result = ManageCropsControl.calcCropHarvest(110,100);
        assertEquals(-1, result);
    }
}
