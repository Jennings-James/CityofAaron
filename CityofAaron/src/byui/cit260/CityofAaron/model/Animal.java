/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.CityofAaron.model;

import java.io.Serializable;
/**
 *
 * @author jennings
 */
public class Animal {
    
    private String name;
    private int age;
    
    
    public Animal(){
        // Empty constructor for JavaBeans
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Animal { Name= " + name 
                + " Age= " + age 
                + "}";
    }
}
