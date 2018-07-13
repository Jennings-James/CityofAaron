package byui.cit260.CityofAaron.view;

import java.util.Scanner;

/**
 *
 * @author pesin
 */
public class MainMenuView extends ViewBase {

    /*
    *Constuctor
     */
    public MainMenuView() {
        super();

    }

    @Override
    protected String getMessage() {
        return "Main Menu\n"
                + "-----------\n"
                + "N - Start New Game\n"
                + "L - Load Saved Game\n"
                + "H - Help Menu\n"
                + "E - Exit\n";
    }

    /*
    *Get the inputs fromthe user.
    *@return
     */
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please choose your fate!");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "N":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "H":
                helpMenu();
                break;
            case "E":
                this.console.println("Nice to meet you. Come again");
                return false;
        }

        return true;
    }

    private void startNewGame() {
        StartNewGameView view = new StartNewGameView();
        view.displayView();
    }

    private void helpMenu() {
        HelpMenuView view = new HelpMenuView();
        view.displayView();
    }

    private void loadSavedGame() {
        LoadSavedGameView view = new LoadSavedGameView();
        view.displayView();
    }

}
