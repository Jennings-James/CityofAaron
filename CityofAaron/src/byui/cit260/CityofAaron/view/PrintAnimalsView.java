/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import byui.cit260.CityofAaron.exceptions.*;
import byui.cit260.CityofAaron.control.GameControl;
import byui.cit260.CityofAaron.model.*;
import cityofaaron.CityofAaron;
import java.io.IOException;

/**
 *
 * @author jennings
 */
public class PrintAnimalsView extends ViewBase {

    public PrintAnimalsView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "This is the place to print the animals to a file";
    }

    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the file to save to");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        String file = animalReport();
        try {
            try {
                GameControl.printReport(file, filePath);
            } catch (GameControlExceptions ie) {
                ErrorView.display(filePath, "The file is incorrect.");
            }
        } catch (IOException ie) {
            ErrorView.display(filePath, "I/O error");
        }
        this.console.println("The file has been saved to " + filePath);
        return false;
    }

    public String animalReport() {
        String head = "Animals in the Sorehouse";
        String col = "Type                Age";
        String list = "";
        String report = "";
        Game game = CityofAaron.getCurrentGame();
        for (int i = 0; i < game.getAnimals().size(); i++) {
            list += game.getAnimals().get(i).getName() + "                 "
                    + game.getAnimals().get(i).getAge() + "\n";
        }
        report = (head + "\n" + col + "\n" + list);

        return report;

    }
}
