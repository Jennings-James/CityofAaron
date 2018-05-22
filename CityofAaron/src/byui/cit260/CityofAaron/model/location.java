/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;

import java.io.Serializable;

/**
 *
 * @author pesin
 */
public class location implements Serializable {
  
 private String name;
 private String mapSymbol;
 private String description;
 private String gameTips;

 public location (){
  
     
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameTips() {
        return gameTips;
    }

    public void setGameTips(String gameTips) {
        this.gameTips = gameTips;
    }

    @Override
    public String toString() {
        return "location{" + "name=" + name + ", mapSymbol=" + mapSymbol + ", description=" + description + ", gameTips=" + gameTips + '}';
    }
    
}
