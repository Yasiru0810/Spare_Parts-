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
import lk.ijse.model.Supplier;
import lk.ijse.pos.DB.DBConnection;


/**
 *
 * @author Yasiru Sachintha
 */
public class SupplierController {
   public static boolean addsupplier(Supplier supplier)throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getInstance().getConnection();
       PreparedStatement stm = connection.prepareStatement("Insert into Supplier values(?,?,?)");
       stm.setObject(1,supplier.getID());
       stm.setObject(2,supplier.getName());
       stm.setObject(3,supplier.getContact());
       return stm.executeUpdate()>0;
   }
   public static boolean Updatesupplier(Supplier supplier)throws ClassNotFoundException, SQLException{
       Connection connection = DBConnection.getInstance().getConnection();
       PreparedStatement stm = connection.prepareStatement("Update Supplier set sup_name=?, sup_Contact=? where sup_id=?");
       
       stm.setObject(1, supplier.getName());
       stm.setObject(2,supplier.getContact());
       stm.setObject(3, supplier.getID());
       return stm.executeUpdate()>0;
   }
   
   
    public static Supplier searchSupplier(String ID)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Supplier where sup_id='"+ID+"'";
         ResultSet rst = stm.executeQuery(SQL);
        if(rst.next()){
            return new Supplier(rst.getString(1),rst.getString("sup_name"),rst.getString("sup_Contact"));
        }
        return null;
    }

    public static boolean Deletesupplier(String ID) throws ClassNotFoundException, SQLException {
         Connection connection = DBConnection.getInstance().getConnection();
       String SQL = "Delete From Supplier Where sup_id='"+ID+"'";
        Statement stm = connection.createStatement(); 
        return stm.executeUpdate(SQL)>0;
    
    
    }        

   

    public static ArrayList<Supplier> getAlSupplier() throws ClassNotFoundException, SQLException {
      
         Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select * from Supplier");
        ArrayList<Supplier> tempList=new ArrayList();
        while(rst.next()){
          tempList.add(new Supplier(
           rst.getString(1),
           rst.getString(2),
           rst.getString(3)
                   ));
        }
        return tempList;
    }

  
}    

   
