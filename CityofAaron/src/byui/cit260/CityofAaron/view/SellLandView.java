/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;
import byui.cit260.CityofAaron.control.ManageCropsControl;
import byui.cit260.CityofAaron.model.Game;
import java.util.Scanner;

/**
 *
 * @author bkemble
 */
public class SellLandView extends ViewBase {

    private static final Scanner keyboard = new Scanner(System.in);
    private static Game game;
    
    @Override
    public void displayView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public SellLandView() {
        // get the cost of land for this round
        int price = ManageCropsControl.calculateLandPrice();
        
        // Prompt user to enter the number of acres to sell
        System.out.format("The value of land is ",price);
        System.out.print("How many acres of land would you like to sell? ");
        
        // Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        
        // Call the sellLand() method in the control layer to sell the land
        ManageCropsControl.sellLand(price, toSell, game);
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