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

import java.util.Scanner;
public class main {
    public static void main (String args[]){
        
        Scanner in = new Scanner(System.in);
        String name;
        String address;
        int number;
        String room;
        int day;
        double payment;
        
        int count = 0;
        int dayCount = 0;
        double totalPayment = 0.0;
        double average = 0.0;
        
        Patient[] patientArray = new Patient[2];
        Room[] roomArray = new Room[2];
        
        for(int i=0;i<patientArray.length;i++){
            System.out.println("Enter name:");
            name = in.next();
            System.out.print("Enter address:");
            address = in.next();
            System.out.print("Enter number:");
            number = in.nextInt();
            System.out.print("Enter room type:");
            room = in.next();
            System.out.print("Enter no. of day:");
            day = in.nextInt();
            
            patientArray[i] = new Patient(name,number,address);
            roomArray[i] = new Room(name,address,number,room,day);
            payment = roomArray[i].calcPayment(room, day);
            System.out.println("Total Payment:RM"+payment);
            
            if(roomArray[i].getNoDay() > 20){
                count++;
            }
            
            dayCount = dayCount + roomArray[i].getNoDay();
            
            totalPayment = totalPayment + roomArray[i].calcPayment(room,day);
            average = totalPayment/dayCount;
            
        }
        System.out.println("Number of Patient that stay more than 20 days :"+count);
        System.out.println("Total days:"+dayCount);
        System.out.println("Total payment:RM"+totalPayment);
        System.out.println("Average for the total payment per day:"+average);
        
    }

}
