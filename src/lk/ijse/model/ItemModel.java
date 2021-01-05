/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.model;

/**
 *
 * @author Yasiru Sachintha
 */
public class ItemModel {
    private String ItemCode;
    private String Name;
    
    public ItemModel(){
   
    }
    
    public ItemModel(String ItemCode, String Name) {
        this.ItemCode = ItemCode;
        this.Name = Name;
    }
    
    public String toString() {
        return "ItemModel{" + "ID=" + getItemCode() + ", Name=" + getName() + '}';
    }

    public String getItemCode() {
        return ItemCode;
    }
    
    public void setItemCode(){
        this.ItemCode = ItemCode;
    }
   
    public String getName() {
        return Name;
    }
    
    public void setName(){
        this.Name = Name;
    }
    
}
