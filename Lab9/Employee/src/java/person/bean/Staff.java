/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person.bean;

/**
 *
 * @author User
 */
public class Staff implements java.io.Serializable {
    
    private String firstname;
    private String lastname;
    private int age;

    public Staff() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getFullName(){
        String fullname;
        
        fullname = firstname.concat(" "+lastname);
        
        return fullname;
    }
    
}
