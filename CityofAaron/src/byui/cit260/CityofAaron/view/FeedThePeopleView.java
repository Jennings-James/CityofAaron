
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

/**
 *
 * @author pesin
 */

public class FeedThePeopleView extends ViewBase {

    /**
     * Constructor
     */
    public FeedThePeopleView() {
        super();
    }

    /**
     *
     * @return
     */
   @Override
    protected String getMessage() {
        return "Main Menu\n"
                + "---------------------\n"
                + "V - View list of food\n"
                + "C - View price\n"
                + "P - How many people\n"
                + "T - Total Cost to buy Food\n"
                + "H - Help\n"
                + "Q - Quit\n";

    }


@Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your choice");
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input. Perform the action
     * indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "P":
                howmanypeople();
                break;
            case "T":
                TotalCost();
                break;
            case "F":
                feedThePeople();
                break;
            case "R":
                return false;

        }
        return true;
    }

    private void TotalCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void howmanypeople() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void feedThePeople() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}