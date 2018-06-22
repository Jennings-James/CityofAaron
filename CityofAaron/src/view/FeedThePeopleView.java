
package view;

import java.util.Scanner;




/**
 *
 * @author pesin
 */
public class FeedThePeopleView {

}
/**
 * The message that will be displayed by this view.
 */
   
    /**
     * Constructor
     */
    public FeedThePeopleView() {
        
        message = "Feed The People\n"
                + "---------------------\n"
                 + "V - View list of food\n"
                + "C - View price\n"
                + "P - How many people\n"
                + "T - Total Cost to buy Food\n"
                + "H - Help\n"
                + "Q - Quit\n"
                + "R-Return To The  Main Menu\n";
}
/**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
       
        
        System.out.println();
        System.out.println("How much do feed the people: " 
                + CityofAaron.getCurrentGame().getThePlayer().getName() + "!\n");
      
}