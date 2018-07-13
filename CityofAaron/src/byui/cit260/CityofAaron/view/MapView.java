/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.control.*;
import byui.cit260.CityofAaron.model.*;
import cityofaaron.CityofAaron;
import java.util.Arrays;

/**
 *
 * @author kemblesque
 */
public class MapView extends ViewBase {

    /*
    *Constuctor
     */
    public MapView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "The Map\n"
                + "-----------\n"
                + "|A|B|C|D|E|\n"
                + "-----------\n"
                + "|F|G|H|I|J|\n"
                + "-----------\n"
                + "|K|L|M|N|O|\n"
                + "-----------\n"
                + "|P|Q|R|S|T|\n"
                + "-----------\n"
                + "|U|V|W|X|Y|\n"
                + "-----------\n"
                + "select Z to exit";
    }

    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please choose where you would like to Go!");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                this.console.println(Map.theMap[0][0]);
                break;
            case "B":
                this.console.println(Map.theMap[0][1]);
                break;
            case "C":
                this.console.println(Map.theMap[0][2]);
                break;
            case "D":
                this.console.println(Map.theMap[0][3]);
                break;
            case "E":
                this.console.println(Map.theMap[0][4]);
                break;
            case "F":
                this.console.println(Map.theMap[1][0]);
                break;
            case "G":
                this.console.println(Map.theMap[1][1]);
                break;
            case "H":
                this.console.println(Map.theMap[1][2]);
                break;
            case "I":
                this.console.println(Map.theMap[1][3]);
                break;
            case "J":
                this.console.println(Map.theMap[1][4]);
                break;
            case "K":
                this.console.println(Map.theMap[2][0]);
                break;
            case "L":
                this.console.println(Map.theMap[2][1]);
                break;
            case "M":
                this.console.println(Map.theMap[2][2]);
                break;
            case "N":
                this.console.println(Map.theMap[2][3]);
                break;
            case "O":
                this.console.println(Map.theMap[2][4]);
                break;
            case "P":
                this.console.println(Map.theMap[3][0]);
                break;
            case "Q":
                this.console.println(Map.theMap[3][1]);
                break;
            case "R":
                this.console.println(Map.theMap[3][2]);
                break;
            case "S":
                this.console.println(Map.theMap[3][3]);
                break;
            case "T":
                this.console.println(Map.theMap[3][4]);
                break;
            case "U":
                this.console.println(Map.theMap[4][0]);
                break;
            case "V":
                this.console.println(Map.theMap[4][1]);
                break;
            case "W":
                this.console.println(Map.theMap[4][2]);
                break;
            case "X":
                this.console.println(Map.theMap[4][3]);
                break;
            case "Y":
                this.console.println(Map.theMap[4][4]);
            case "Z":
                gameMenu();
                break;
        }

        return true;
    }

    private void gameMenu() {
        GameMenuView view = new GameMenuView();
        view.displayView();
    }

}
