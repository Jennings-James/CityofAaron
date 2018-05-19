/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.description;
import java.io.row;
import java.io.column;


/**
 *
 * @author pesin
 */
public class map {
 private description thedescription;
 private row rowCount;
 private column columnCount;
 
 public map(){
     
 }

    public description getThedescription() {
        return thedescription;
    }

    public void setThedescription(description thedescription) {
        this.thedescription = thedescription;
    }

    public row getRowCount() {
        return rowCount;
    }

    public void setRowCount(row rowCount) {
        this.rowCount = rowCount;
    }

    public column getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(column columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public String toString() {
        return "map{" 
                + "thedescription=" + thedescription 
                + ", rowCount=" + rowCount 
                + ", columnCount=" + columnCount 
                + '}';
    }
 

}
