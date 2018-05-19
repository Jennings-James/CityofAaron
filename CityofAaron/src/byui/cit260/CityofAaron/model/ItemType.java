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
public enum ItemType {
    
    itemList1("cows", "saw", "corn"),
    itemList2("sheep", "hammer", "apples"),
    itemList3("horses", "pick", "water");
    
    
    private String animal;
    private String tool;
    private String provision;

    ItemType(String animal, String tool, String provision) {
        this.animal = animal;
        this.tool = tool;
        this.provision = provision;
    }
    
    public String getAnimal() {
        return animal;
    }
    
    public String getTool() {
        return tool;
    }
    
    public String getProvision() {
        return provision;
    }

    @Override
    public String toString() {
        return "ItemType{" + "animal=" + animal 
               + ", tool=" + tool 
               + ", provision=" + provision 
               + '}';
    }
    
    
}
