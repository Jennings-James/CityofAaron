/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;
import byui.cit260.CityofAaron.control.*;
import java.io.Serializable;
import java.util.Arrays;
/**
 *
 * @author jennings
 */
public class Map implements Serializable {
    
    
    public Map() {
        
    }
    public static String theMap[][] = {
        { "Undeveloped Land", "Undeveloped Land", "Wheat Fields", "Wheat Fields", "Wheat Fields" },
        { "Undeveloped Land", "Undeveloped Land", "Wheat Fields", "Wheat Fields", "Wheat Fields" },
        { "The River", "The Village", "The Village", "The Granary", "The Storehouse" },
        {  "Lamanites Border", "The RIver", "The Village", "The Temple", "The Ruler's Court" },
        { "Lamanites Border", "Lamanites Border", "The River", "Undeveloped Land", "Undeveloped Land" },
        { "F", "Undeveloped Land"},
        { "G", "Undeveloped Land"},
        { "H", "Wheat Fields" },
        { "I", "Wheat Fields" },
        { "J", "Wheat Fields" },
        { "K", "The River" },
        { "L", "The Village" },
        { "M", "The Village" },
        { "N", "The Granary" },
        { "O", "The Storehouse" },
        { "P", "Lamanites Border" },
        { "Q", "The RIver" },
        { "R", "The Village" },
        { "S", "The Temple" },
        { "T", "The Ruler's Court" },
        { "U", "Lamanites Border" },
        { "V", "Lamanites Border" },
        { "W", "The River" },
        { "X", "Undeveloped Land" },
        { "Y", "Undeveloped Land" },
        
    };

     

        
    
            
            
            
            
            
private Point currentLocaiton;
    
/*
    public String getLocaiton() {
        return locaiton;
    }

    public void setLocaiton(String locaiton) {
        this.locaiton = locaiton;
    }

    public Point getCurrentLocaiton() {
        return currentLocaiton;
    }

    public void setCurrentLocaiton(Point currentLocaiton) {
        this.currentLocaiton = currentLocaiton;
    }

    @Override
    public String toString() {
        return "Map{" 
                + "locaiton=" + locaiton + ", currentLocaiton=" + currentLocaiton + '}';
    }
    */

    }
    
    

