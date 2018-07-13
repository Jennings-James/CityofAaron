/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

import cityofaaron.CityofAaron;
import java.io.*;

/**
 *
 * @author jennings
 */
public class ErrorView {
    private static PrintWriter console = CityofAaron.getOutFile();
    private static PrintWriter log = CityofAaron.getLogFile();
    
    public static void display(String className, String errorMessage) {
        console.println(
            "\n---- ERROR ---------------------------------------------------"
            + "\n" + errorMessage
            + "\n-------------------------------------------------------------");
        log.printf("%n%n%n", className + " - " + errorMessage);
    }
}
