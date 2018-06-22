/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pesin
 */
public class FeedThePeopleViewTest {
    
    public FeedThePeopleViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class FeedThePeopleView.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        FeedThePeopleView instance = new FeedThePeopleView();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputs method, of class FeedThePeopleView.
     */
    @Test
    public void testGetInputs() {
        System.out.println("getInputs");
        FeedThePeopleView instance = new FeedThePeopleView();
        String[] expResult = null;
        String[] result = instance.getInputs();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class FeedThePeopleView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String[] inputs = null;
        FeedThePeopleView instance = new FeedThePeopleView();
        boolean expResult = false;
        boolean result = instance.doAction(inputs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayView method, of class FeedThePeopleView.
     */
    @Test
    public void testDisplayView() {
        System.out.println("displayView");
        FeedThePeopleView instance = new FeedThePeopleView();
        instance.displayView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
