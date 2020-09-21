package productpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class ProductDb {
    Statement st;

    void addProduct(String product_name,String product_image, float product_price, String product_description) {
        connectToDb();
        String sql="INSERT INTO product_table(Product_Name,Product_Image,Product_Price,Product_Description) VALUES('"+product_name+"','"+product_image+"',"+product_price+",'"+product_description+"')";
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectToDb() {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/productdb";
        
        try {
            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,"root","");
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductDb.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    ArrayList viewItem() {
         connectToDb();
        String query="SELECT * FROM product_table";
        List items=new ArrayList();
        ResultSet rs;
        try {
            rs = st.executeQuery(query);
            while(rs.next())
        {
            items.add(rs.getString("Product_Name"));
            items.add(rs.getString("Product_Price"));
            items.add(rs.getString("Product_Description"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (ArrayList) items;
    }
    
}
