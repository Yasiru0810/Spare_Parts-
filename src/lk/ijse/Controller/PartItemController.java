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
import lk.ijse.model.Parts_Item;
import lk.ijse.pos.DB.DBConnection;

/**
 *
 * @author Yasiru Sachintha
 */
public class PartItemController {
    public static boolean addItem(Parts_Item item) throws ClassNotFoundException, SQLException {
      Connection connection = DBConnection.getInstance().getConnection();
      PreparedStatement stm = connection.prepareStatement("insert into Parts_Item values(?,?,?)");
      stm.setObject(1,item.getParts_id());
      stm.setObject(2,item.getQTY());
      stm.setObject(3,item.getunitPrice());
      return stm.executeUpdate()>0;
    }

    public static Parts_Item searchItemCode(String itemcode) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Parts_Item where Parts_id='"+itemcode+"'";
        ResultSet rst = stm.executeQuery(SQL);
        if(rst.next()){
            return new Parts_Item(rst.getString(1),rst.getInt("QTY"),rst.getDouble("unitprice"));
        }
        return null;
    }
    public static boolean updatePart(Parts_Item item) throws Exception{ 
        Connection connection = DBConnection.getInstance().getConnection();
        
      PreparedStatement stm = connection.prepareStatement("UPDATE Parts_Item SET QTY=? WHERE Parts_id=?");
      
      stm.setObject(1,item.getParts_id());
      stm.setObject(2,item.getQTY());
      stm.setObject(3,item.getUnitPrice());
      return stm.executeUpdate()>0;
    }
    public static ArrayList<Parts_Item> getAllParts() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        
      PreparedStatement stm = connection.prepareStatement("SELECT * from Parts_Item");
      ResultSet rs=stm.executeQuery();
      ArrayList<Parts_Item> items=new ArrayList<>();
      while(rs.next()){
          Parts_Item item=new Parts_Item(rs.getString(1), rs.getInt(2),rs.getInt(3));
          items.add(item);
      }
      return items;
    }
}
