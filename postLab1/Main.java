import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
   public static void main(String [] args)
   {
       Scanner in=new Scanner(System.in);
       
       ArrayList<Student> studList = new ArrayList<Student>();
       
       String name;
       String id;
       String program;
       double test;
       double assignment;
       double fnal;
       
       for(int i=0; i<4; i++)
       {
           System.out.print("\nEnter Name:");
           name=(in.next());
           System.out.print("Enter ID:");
           id=(in.next());
           System.out.print("Enter Program:");
           program=(in.next());
           System.out.print("Enter Test Marks:");
           test=in.nextDouble();
           System.out.print("Enter Assignment Marks:");
           assignment=in.nextDouble();
           System.out.print("Enter Final Marks:");
           fnal=in.nextDouble();
           
           Student stud = new Student(name,id,program,test,assignment,fnal);
           studList.add(stud);
        }
        
        System.out.println("\nStudent Details:");
        for(int i=0; i<studList.size(); i++)
        {
            Student stud = studList.get(i);
            System.out.println("\n"+stud.toString());
            System.out.println("Total Final Marks:"+stud.calculateFinalMarks());
        }
        
    }
    
    
}
