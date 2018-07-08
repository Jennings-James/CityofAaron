/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.control;

import byui.cit260.CityofAaron.model.*;
import java.util.Arrays;

/**
 *
 * @author jennings
 */
public class MapControl {

    public MapControl() {

    }

    public static void CreateMap() {

        Map themap = new Map();
        Game game = new Game();
        game.setTheMap(themap);
    }

}
