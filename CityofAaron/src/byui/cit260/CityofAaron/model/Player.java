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
public class Player implements Serializable {

    private String name; //= "Fred";Fred is for testing 

    public Player() {
        // Empty constructor for JavaBeans
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player {player name= " + name
                + "}";
    }
}
