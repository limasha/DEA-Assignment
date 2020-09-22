/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author acer
 */
public class signupservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signupservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signupservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       try (PrintWriter out = response.getWriter()) {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String username = request.getParameter("username");
        String address = request.getParameter("address");
        int contactnumber = Integer.parseInt(request.getParameter("contactnumber"));
        String email = request.getParameter("email");
        String password = request.getParameter("password");
     
        if(!(username.equals(""))){
        try{
            
         String driver="com.mysql.jdbc.Driver";
         Class.forName(driver);
         String url="jdbc:mysql://localhost:3306/userdb";
         Connection con=DriverManager.getConnection(url,"root","");
         String sql= "INSERT INTO user  VALUES('"+firstname+"', '"+lastname+"' , '"+email+"', '"+username+"','"+password+"','"+address+"',"+contactnumber+")";
         Statement st=con.createStatement();
         st.executeUpdate(sql);
         
        
        
          
       
    }
       catch(ClassNotFoundException | SQLException ex){
         out.println(ex);
       }
       }
        
    }
    }
}
            
            
      
        
        
      
    
        
        
        
    

    


