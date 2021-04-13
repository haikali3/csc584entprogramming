public class Student
{
    private String studentName;
    private String studentID;
    private String program;
    private double test;
    private double assignment;
    private double finalMark;
    
    public Student(){
        studentName = null;
        studentID = null;
        program = null;
        test = 0.0;
        assignment = 0.0;
        finalMark = 0.0;
    }
    
    public Student(String n,String i,String p,double t,double a,double f){
        studentName = n;
        studentID = i;
        program = p;
        test = t;
        assignment = a;
        finalMark = f;
    }
    
    public String getName(){
        return studentName;
    }
    
    public void setName(String name)
    {
        studentName = name;
    }
    
    public String getID(){
        return studentID;
    }
    
    public void setID(String id)
    {
        studentID = id;
    }
    
    public String getProgram(){
        return program;
    }
    
    public void setProgram(String prog)
    {
        program = prog;
    }
    
    public double getTest(){
        return test;
    }
    
    public void setTest(double t){
        test = t;
    }
    
    public double getAssignment(){
        return assignment;
    }
    
    public void setAssignment(double a){
        assignment = a;
    }
    
    public double getFinal(){
        return finalMark;
    }
    
    public void setFinal(double f){
        finalMark = f;
    }
    
    public String toString(){
        return "Name:" +studentName+ "\nStudent ID:" +studentID+ "\nProgram:" +program+ "\nTest Marks:"+test+"\nAssignment Marks:"+assignment+"\nFinal Marks:"+finalMark;   
    }
    
    public double calculateFinalMarks(){
        double fMark = 0;
        fMark = (test/100*30) + (assignment/100*20) + (finalMark/100*50);
        return fMark;
    }

    
}
