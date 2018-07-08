/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.exceptions;

/**
 *
 * @author jennings
 */
public class ManageCropsControlException extends Exception {

    public ManageCropsControlException() {
    }

    public ManageCropsControlException(String message) {
        super(message);
    }

    public ManageCropsControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManageCropsControlException(Throwable cause) {
        super(cause);
    }

    public ManageCropsControlException(String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writeableStackTrace) {
        super(message, cause, enableSuppression, writeableStackTrace);
    }

}
