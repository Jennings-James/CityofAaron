/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;

/**
 *
 * @author jennings
 */
public enum Condition {
    
    conList1("Good", "Fair", "Poor"),
    conList2("Fair", "Poor", "Good"),
    conList3("Poor", "Good", "Fair");
    
    private String con1;
    private String con2;
    private String con3;

    Condition(String con1, String con2, String con3){
        this.con1 = con1;
        this.con2 = con2;
        this.con3 = con3;
    }

    public String getCon1() {
        return con1;
    }

    public String getCon2() {
        return con2;
    }

    public String getCon3() {
        return con3;
    }

    @Override
    public String toString() {
        return "Condition{" + "con1=" + con1 
                + ", con2=" + con2 
                + ", con3=" + con3 
                + '}';
    }
    
    
    
}
