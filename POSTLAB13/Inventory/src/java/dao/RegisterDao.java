/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.RegisterBean;
import java.sql.*;
import util.DBConnection;

/**
 *
 * @author TUF
 */
public class RegisterDao {
    public String registerUser(RegisterBean regBean){
        
        Connection conn = null;
        Statement statement = null;
        
        
        String fullname = regBean.getName();
        String email = regBean.getEmail();
        String username = regBean.getUsername();
        String password = regBean.getPassword();
        
        try{
            
            conn = DBConnection.createConnection();
            
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO USERS(USERNAME,PASSWORD,FULLNAME,EMAIL) VALUES (?,?,?,?)");
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,fullname);
            pstmt.setString(4,email);
            
            int i = pstmt.executeUpdate();
            if(i>0){
                return "SUCCESS";
            }
            else{
                return "FAIL";
            }
            
        
        }catch(SQLException e){
            return e.getMessage();
      
        }
        
    }

    
}
