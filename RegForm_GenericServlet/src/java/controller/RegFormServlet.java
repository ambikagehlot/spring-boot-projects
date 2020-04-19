/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class RegFormServlet extends GenericServlet 
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
    {
       
        PrintWriter out=res.getWriter();
        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String address=req.getParameter("address");
        
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
           PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into student values(?,?,?,?)");
           pst.setInt(1, id);
           pst.setString(2, name);
           pst.setString(3, email);
           pst.setString(4, address);
           int i= pst.executeUpdate();
           
           if(i!=0)
               out.println("Registration Successful");
           else
                out.println("Registration failed");
           
           
        }
        catch(ClassNotFoundException | SQLException e)
        {
              
        }
        
        
    }

   
}
