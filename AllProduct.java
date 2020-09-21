import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllProduct {
 Statement st;


    private void connectToDb() {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/productdb";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AllProduct.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    ArrayList viewItem() {
         connectToDb();
        String query="SELECT * FROM product";
        List items=new ArrayList();
        ResultSet rs;
        try {
            rs = st.executeQuery(query);
            while(rs.next())
        {
            items.add(rs.getString("itmename"));
            items.add(rs.getString("Price"));
            items.add(rs.getString("description"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(AllProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (ArrayList) items;
    }   
}
