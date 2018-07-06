/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author jennings
 */
public class Game implements Serializable {
    
    

    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulation;
    private int acresOwned;
    private int wheatStorage;
    private int currentYear;
    private InventoryItem inventory;
    private ArrayList<Animal> animals;
    private int acresPlanted;
    private int wheatHarvested;
    private double tithePaid;
    
    public InventoryItem getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem inventory) {
        this.inventory = inventory;
    }
    public Game(){
        // Empty constructor for JavaBeans
    } 

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player theplayer) {
        this.thePlayer = theplayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map themap) {
        this.theMap = themap;
    }

    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }

    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }
    
    public int getCurrentPopulation() {
        return currentPopulation;
    }

    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatStorage() {
        return wheatStorage;
    }

    public void setWheatStorage(int wheatStorage) {
        this.wheatStorage = wheatStorage;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public int getWheatHarvested() {
        return wheatHarvested;
    }

    public void setWheatHarvested(int wheatHarvested) {
        this.wheatHarvested = wheatHarvested;
    }

    public double getTithePaid() {
        return tithePaid;
    }

    public void setTithePaid(double tithePaid) {
        this.tithePaid = tithePaid;
    }
   
    
    
   

    @Override
    public String toString() {
        return "Game{ theplayer " + thePlayer 
                + "themap=" + theMap
               + ", thestorehouse=" + theStorehouse 
               + ", currentPopulation=" + currentPopulation
               + ", acresOwned=" + acresOwned 
               + ", wheatStorage=" + wheatStorage  
               + ", currentYear=" + currentYear + '}';
    }
    
    
    
    
}
