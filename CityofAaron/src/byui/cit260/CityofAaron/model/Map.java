/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;

/**
 *
 * @author jennings
 */
public class Map {
private description thedescription;
private row rowcount;
private column columncount;

public Map (){
    
}
    public description getThedescription() {
        return thedescription;
    }

    public void setThedescription(description thedescription) {
        this.thedescription = thedescription;
    }

    public row getRowcount() {
        return rowcount;
    }

    public void setRowcount(row rowcount) {
        this.rowcount = rowcount;
    }

    public column getColumncount() {
        return columncount;
    }

    public void setColumncount(column columncount) {
        this.columncount = columncount;
    }

    @Override
    public String toString() {
    return "Map {" 
    + "thedescription=" + thedescription 
    + ", rowcount=" + rowcount 
    + ", columncount=" + columncount 
    +  '}';
    }
   
}
