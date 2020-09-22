/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My DELL
 */
class Message {
Statement st;
    void addMessage(String uname, String email, String subject, String message) {
    
        connectTODb();
        String sql="INSERT INTO usercomment VALUES('"+uname+"','"+email+"','"+subject+"','"+message+"')";
        try {
        st.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void connectTODb(){
    
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/commentdb";
        try {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,"root","");
        con.createStatement();
    } catch (ClassNotFoundException |SQLException ex) {
        Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
    }
            
    }
    
}
