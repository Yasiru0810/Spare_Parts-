/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.model.Customer;
import lk.ijse.pos.DB.DBConnection;

/**
 *
 * @author Yasiru Sachintha
 */
public class CustomerController {
    public static boolean addCustomer (Customer customer) throws ClassNotFoundException, SQLException{
      Connection connection = DBConnection.getInstance().getConnection();
      PreparedStatement stm = connection.prepareStatement("insert into Customer values(?,?,?,?)");
      stm.setObject(1,customer.getID());
      stm.setObject(2,customer.getName());
      stm.setObject(3,customer.getAddress());
      stm.setObject(4,customer.getContact());
      
      return stm.executeUpdate()>0;  
    }
    public static boolean updateCustomer (Customer customer) throws ClassNotFoundException, SQLException{
      Connection connection = DBConnection.getInstance().getConnection();
      PreparedStatement stm = connection.prepareStatement("Update Customer set Cus_name=?, Cus_address=?,Cus_contact=? where Cus_id=?");
      stm.setObject(1,customer.getName());
      stm.setObject(2,customer.getAddress());
      stm.setObject(3,customer.getContact());
      stm.setObject(4,customer.getID());
      return stm.executeUpdate()>0;
    }
    public static boolean deleteCustomer(String ID)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete From Customer Where Cus_id='"+ID+"'";
        Statement stm = connection.createStatement(); 
        return stm.executeUpdate(SQL)>0;
    }
    public static Customer searchCustomer(String ID)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Customer where Cus_id='"+ID+"'";
         ResultSet rst = stm.executeQuery(SQL);
        if(rst.next()){
            return new Customer(rst.getString(1),rst.getString("Cus_name"),rst.getString("Cus_address"),rst.getString("Cus_Contact"));
        }
        return null;
    }
    public static ArrayList<Customer> getAllCustomer()throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select * from Customer");
        ArrayList<Customer> customerList=new ArrayList<>();
        while(rst.next()){
            Customer customer = new Customer();
            customer.setID(rst.getString(1));
            customer.setName(rst.getString("Cus_name"));
            customer.setAddress(rst.getString("Cus_address"));
            customer.setContact(rst.getString("Cus_Contact"));
            customerList.add(customer);
        }
        return customerList;
    }          
    
}    
