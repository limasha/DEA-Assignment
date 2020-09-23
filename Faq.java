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
class Faq {
Statement st1;
    void addFaq(String useremail, String item, String question)  {
        connectQuestionTODb();
        String sql="INSERT INTO userfaq VALUES('"+useremail+"','"+item+"','"+question+"')";
        try {
        st1.executeUpdate(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void connectQuestionTODb(){
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
    
    

