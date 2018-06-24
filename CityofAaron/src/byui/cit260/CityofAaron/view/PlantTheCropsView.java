/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;
import byui.cit260.CityofAaron.control.ManageCropsControl;
import java.util.Scanner;

/**
 *
 * @author kemblesque
 */
public class PlantTheCropsView extends ViewBase {
    
    private static final Scanner keyboard = new Scanner(System.in);
    
     @Override
    public void displayView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 public PlantTheCropsView(){
    {
       //Prompt the user to enter the number of acres of land to plant with wheat
        System.out.println("How many acres of land would you like to plant? ");
        
        //Get the user's input and save it
        int numAcres;
        numAcres = keyboard.nextInt();
        
        //Call the plantCrops() method in the control layer to set aside land for planting
            int acresReserved = ManageCropsControl.plantCrops(numAcres);
        System.out.print("Acres of land to be planted: "  +acresReserved);    
    }
}

    @Override
    protected String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String[] getInputs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   

