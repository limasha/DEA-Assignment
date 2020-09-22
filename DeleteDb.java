/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class DeleteDb {
    Statement st;

    int deleteItem(String product_id) {
        connectToDb();
        String deletequery="DELETE FROM product WHERE itemid="+product_id+" ";
        try {
            int a=st.executeUpdate(deletequery);
            if(a==1)
            {
                return a;
            }
            else
            {
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void connectToDb() {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/productdb";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DeleteDb.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
    }
    
}
