<%-- 
    Document   : DeleteItem
    Created on : Aug 19, 2020, 8:39:38 PM
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
        <h1>Delete Items</h1>
        <form method="POST" action="DeleteItem_Servlet">
            <table>
                <tr>
                    <td>Enter Product ID</td>
                    <td><input type="text" name="pid"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Delete"></td>
                    <td><input type="reset" value="Cancel"></td>

                </tr>
            </table>
        </form>
    </body>
</html>
