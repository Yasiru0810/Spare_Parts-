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
import lk.ijse.model.ItemModel;
import lk.ijse.pos.DB.DBConnection;


/**
 *
 * @author Yasiru Sachintha
 */
public class ItemController {

    public static boolean additem(ItemModel item) throws ClassNotFoundException, SQLException {
      Connection connection = DBConnection.getInstance().getConnection();
      PreparedStatement stm = connection.prepareStatement("insert into Parts values(?,?)");
      stm.setObject(1,item.getItemCode());
      stm.setObject(2,item.getName());
      return stm.executeUpdate()>0;
    }

    public static ItemModel searchItemCode(String partid) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Parts where Parts_id='"+partid+"'";
        ResultSet rst = stm.executeQuery(SQL);
        if(rst.next()){
            return new ItemModel(rst.getString(1),rst.getString("Parts_name"));
        }
        return null;
    }
    public static boolean updatePart(ItemModel item) throws Exception{ 
        Connection connection = DBConnection.getInstance().getConnection();
        
      PreparedStatement stm = connection.prepareStatement("UPDATE parts SET Parts_name=? WHERE Parts_id=?");
      
      stm.setObject(1,item.getName());
      stm.setObject(2,item.getItemCode());
      return stm.executeUpdate()>0;
    }
    public static ArrayList<ItemModel> getAllParts() throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        
      PreparedStatement stm = connection.prepareStatement("SELECT * from Parts");
      ResultSet rs=stm.executeQuery();
      ArrayList<ItemModel> items=new ArrayList<>();
      while(rs.next()){
          ItemModel item=new ItemModel(rs.getString(1), rs.getString(2));
          items.add(item);
      }
      return items;
    }

    public static boolean deleteItem(String ItemCode) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete From Parts Where item_code='"+ItemCode+"'";
        Statement stm = connection.createStatement(); 
        return stm.executeUpdate(SQL)>0;
    }
}
