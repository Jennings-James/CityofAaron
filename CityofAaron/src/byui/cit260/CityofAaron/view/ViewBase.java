/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import cityofaaron.CityofAaron;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author jennings
 */
public abstract class ViewBase implements View {

   
    protected final BufferedReader keyboard = CityofAaron.getInFile();
    protected final PrintWriter console = CityofAaron.getOutFile();
    
    /*
    Constructoe
     */
    public ViewBase() {
    }

    /*
    *Get the views content.
    *@return
     */
    protected abstract String getMessage();

    /*
    *Get the set of inputs from the user.
     */
    protected abstract String[] getInputs();

    /*
    *Perform the action indicated by the user's inputs.
    *
    *@param inputs
    *@return true if the view should repeat itself, and false if the view should
    *exit and return to the previous view.
     */
    public abstract boolean doAction(String[] inputs);


    /*
    *Control this view's display/prompt/action loop until the use chooses an
    *action that causes this view to close.
     */
    @Override
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            //get the message to display.
            //only print if it is non-null.
            String message = getMessage();
            if (message != null) {
                 this.console.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a
     * return key)
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        Scanner keyboard = new Scanner(this.keyboard);
        String input = "";
        boolean inputReceived = false;

        while (inputReceived == false) {

             this.console.println(prompt);
            input = keyboard.nextLine();

            // Make sure we avoid a null-pointer error.
            if (input == null) {
                input = "";
            }

            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();

            if (input.equals("") == false || allowEmpty == true) {
                inputReceived = true;
            }
        }

        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    /*
    *Pause the program for the specified number of milliseconds.
     */
    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            // do nothing
        }
    }
}
