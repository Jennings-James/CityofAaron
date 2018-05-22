/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;

import java.io.Serializable;

/**
 *
 * @author jennings
 */
public class Map implements Serializable {
private String locaiton;
private Point currentLocaiton;


public Map (){
    
}

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
    
    
    
}
