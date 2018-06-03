
package byui.cit260.CityofAaron.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import byui.cit260.CityofAaron.control.RandomMock;
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
    private static int getNeededRandomMockValue(int desiredRangeValue, int rangeMinimumValue) {
        return desiredRangeValue - rangeMinimumValue;
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
        int randomMockValue = getNeededRandomMockValue(3, 2);
        RandomMock fakeRandom = new RandomMock(randomMockValue);
        ManageCropsControl.setRandomGenerator(fakeRandom);
        
        int result = ManageCropsControl.calcCropHarvest(10,100);
        assertEquals(300, result);
    }
    
    @Test
    public void testCase2() {
        int randomMockValue = getNeededRandomMockValue(1, 1);
        RandomMock fakeRandom = new RandomMock(randomMockValue);
        ManageCropsControl.setRandomGenerator(fakeRandom);
        
        int result = ManageCropsControl.calcCropHarvest(6,100);
        assertEquals(100, result);
    }
    
    @Test
    public void testCase3() {
        int randomMockValue = getNeededRandomMockValue(4, 2);
        RandomMock fakeRandom = new RandomMock(randomMockValue);
        ManageCropsControl.setRandomGenerator(fakeRandom);
        
        int result = ManageCropsControl.calcCropHarvest(15,100);
        assertEquals(400, result);
    }
    
    @Test
    public void testCase4() {
        int randomMockValue = getNeededRandomMockValue(2, 1);
        RandomMock fakeRandom = new RandomMock(randomMockValue);
        ManageCropsControl.setRandomGenerator(fakeRandom);
        
        int result = ManageCropsControl.calcCropHarvest(0,100);
        assertEquals(200, result);
    }
    
    @Test
    public void testCase5() {
        int randomMockValue = getNeededRandomMockValue(5, 2);
        RandomMock fakeRandom = new RandomMock(randomMockValue);
        ManageCropsControl.setRandomGenerator(fakeRandom);
        
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

    /*
    *Start of James Jennings individual assignment.
     * Test of plantCrops method, of class ManageCropsControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        int numAcres = 0;
        int wheatStored = 0;
        int landOwned = 0;
        int expResult = 0;
        int result = ManageCropsControl.plantCrops(numAcres, wheatStored, landOwned);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCase8() {
        int result = ManageCropsControl.plantCrops(100,2000,200);
        assertEquals(50, result);
    }
    @Test
    public void testCase9() {
        int result = ManageCropsControl.plantCrops(-100,2000,200);
        assertEquals(-1, result);
    }
    /*@Test  This test will not run because 25.7 is not an int so it does not compile.
    public void testCase10() {
        int result = ManageCropsControl.plantCrops(25.7,1500,150);
        assertEquals(-1, result);
    }
    */
    @Test
    public void testCase11() {
        int result = ManageCropsControl.plantCrops(1000,2000,800);
        assertEquals(-1, result);
    }
    @Test
    public void testCase12() {
        int result = ManageCropsControl.plantCrops(2000,300,2000);
        assertEquals(-1, result);
    }
    
    
    
    
}
