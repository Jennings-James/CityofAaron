/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.view;

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
protected String message;
   
    /**
     * Constructor
     */
    public class FeedThePeopleView() {
        
        message = "Feed The People\n"
                + "---------------------\n"
                + "H-How much does it cost\n"
                + "P-How many people\n"
                + "Buy Food\n"
                + "F-Feed The People\n"
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
        