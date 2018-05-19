/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;




/**
 *
 * @author pesin
 */
public class Location {
 private Number gridNumber;
 private visit  thevisit;
 private amount amountletf;
 private description thedescription;

 public Location(){
 }

    public Number getGridNumber() {
        return gridNumber;
    }

    public void setGridNumber(Number gridNumber) {
        this.gridNumber = gridNumber;
    }

    public visit getThevisit() {
        return thevisit;
    }

    public void setThevisit(visit thevisit) {
        this.thevisit = thevisit;
    }

    public amount getAmountletf() {
        return amountletf;
    }

    public void setAmountletf(amount amountletf) {
        this.amountletf = amountletf;
    }

    public description getThediscription() {
        return thediscription;
    }

    public void setThediscription(description thediscription) {
        this.thediscription = thediscription;
    }

    @Override
    public String toString() {
        return "Location{" 
               + "gridNumber=" + gridNumber 
                + ", thevisit=" + thevisit 
                + ", amountletf=" + amountletf 
                + ", thedescription=" + thedescription 
                + '}';
    }
 
 
}
