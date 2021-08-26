/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LoginBean;
import java.sql.*;
import util.DBConnection;

/**
 *
 * @author TUF
 */
public class LoginDao {
    public String authenticateUser(LoginBean loginBean){
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();
        
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        
        String usernameDB="";
        String passwordDB="";
        
        try{
            conn = DBConnection.createConnection();
            statement = conn.createStatement();
            rs= statement.executeQuery("select USERNAME,PASSWORD from users");
            while(rs.next()){
                usernameDB = rs.getString("USERNAME");
                passwordDB = rs.getString("PASSWORD");
                if(username.equals(usernameDB) && password.equals(passwordDB)){
                    return "SUCCESS";
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return "invalid user credential";
    }
}
