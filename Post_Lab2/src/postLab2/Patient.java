/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postLab2;

/**
 *
 * @author TUF
 */
public class Patient {
    protected String patientName;
    protected int patientNumber;
    protected String patientAddress;
    
    /*constructor*/
     public Patient(){
        this.patientAddress = patientAddress;
        this.patientName = patientName;
        this.patientNumber = patientNumber;
     
    }
    
    public Patient(String patientName,int patientNumber,String patientAddress){
        this.patientAddress = patientAddress;
        this.patientName = patientName;
        this.patientNumber = patientNumber;
     
    }
    
    public String getAddress(){
        return patientAddress;
    }
    public int getNumber(){
        return patientNumber;
    }
    public String getName(){
        return patientName;
    }
    
    public void setName(){
        this.patientName = patientName;
    }
    public void setAddress(){
        this.patientAddress = patientAddress;
    }
    public void setNumber(){
        this.patientNumber = patientNumber;}
    
    public String toString(){
        return("Name :"+patientName+"\nPatient Number :"+patientNumber+"\nPatientAddress :"+patientAddress);
    }
    
}
