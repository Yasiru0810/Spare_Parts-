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
public class Customer {
   private String ID;
   private String Name;
   private String Address;
   private String Contact;
   
   public Customer(){
   
    
    }
   public Customer( String ID,String Name,String Address,String Contact){
       this.ID = ID;
       this.Name = Name;
       this.Address = Address;
       this.Contact = Contact;
   }

    public Customer(String ID, String Name, String Contact, String UnitPrice, String Quenty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Customer(String ID, String Name, String Contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public String getContact(){
        return Contact;
    }
    public void setContact(String Contact){
        this.Contact = Contact;
    }
}
