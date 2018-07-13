package cityofaaron;

import byui.cit260.CityofAaron.view.View;
import byui.cit260.CityofAaron.model.Game;
import byui.cit260.CityofAaron.view.StartProgramView;
import byui.cit260.CityofAaron.exceptions.ManageCropsControlException;
import java.util.logging.Logger;
import java.io.*;

/**
 *
 * @author jennings
 */
public class CityofAaron {

    //this is the place to store the current Game object in the main class.
    public static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static void setCurrentGame(Game game) {
        CityofAaron.currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            CityofAaron.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            CityofAaron.outFile
                    = new PrintWriter(System.out, true);

            CityofAaron.logFile
                    = new PrintWriter("logFile.txt");

            View startProgramView = new StartProgramView();
            startProgramView.displayView();
        } catch (Throwable exc) {
            System.out.println("The program has encountered\n"
                    + " an error and will now exit.");
            exc.printStackTrace();;

        } finally {

            try {
                if (CityofAaron.inFile != null) {
                    CityofAaron.inFile.close();
                }

                if (CityofAaron.outFile != null) {
                    CityofAaron.outFile.close();
                }
                if (CityofAaron.logFile != null) {
                    CityofAaron.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing Files");
                return;
            }
        }
    }

    public static Throwable printStackTrace() {

        // Not sure how to get the stack trace to print?
        //return System.out.println(exc.getMessage() + exc.printStackTrace());
        return null;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityofAaron.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityofAaron.outFile = outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityofAaron.logFile = logFile;
    }

}
