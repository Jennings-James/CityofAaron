/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;
import byui.cit260.CityofAaron.control.ManageCropsControl;
import java.util.Scanner;
import byui.cit260.CityofAaron.control.*;
import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.exceptions.*;
/**
 *
 * @author kemblesque
 */
public class PlantTheCropsView extends ViewBase {
    int acresPlanted = 0;
    public PlantTheCropsView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "How many acres do you want to plant";
    }
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Enter the number up to total acres owned");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
     @Override
    public boolean doAction(String[] inputs){
        int numAcres = Integer.parseInt(inputs[0]);
        int wheatStored = GameControl.game.getWheatStorage();
        int landOwned = GameControl.game.getAcresOwned();
        try{
        acresPlanted = ManageCropsControl.plantCrops(numAcres, wheatStored, landOwned);
        } catch (ManageCropsControlException ie) {
            System.out.println(ie.getMessage());
            return false;
        }
        GameControl.game.setAcresPlanted(acresPlanted);
        System.out.println("You have planted " + acresPlanted + "acres of wheat.");
        return false;
    }
}
   /* private static final Scanner keyboard = new Scanner(System.in);
    
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
            int acresReserved = ManageCropsControl.plantCrops(int numAcres, int wheatStored, int landOwned);
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
}*/
   

