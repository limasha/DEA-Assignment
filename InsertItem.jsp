<%-- 
    Document   : InsertItem
    Created on : Aug 19, 2020, 8:36:23 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insert Items</h1>
        <form method="POST" action="InsertItem_Servlet">
            <table>
                <tr>
                    <td>Product Name</td>
                    <td><input type="text" name="pname"></td>                  
                </tr>
                <tr>
                    <td>Choose an image</td>             
                    <td><input type="file" name="fileimage" size="100"></td>
                </tr>
                <tr>
                    <td>Product Price</td>             
                    <td><input type="text" name="pprice"></td>
                </tr>
                <tr>  
                    <td>Product Description</td>
                    <td><input type="text" name="pdescription"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Insert"></td>
                    <td><input type="reset" value="Cancel"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
