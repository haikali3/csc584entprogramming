/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author TUF
 */
public class RegisterBean implements java.io.Serializable{
    String name;
    String email;
    String username;
    String password;
    
    public RegisterBean(){
        
    }
    
    public RegisterBean(String name,String email,String username,String password){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
