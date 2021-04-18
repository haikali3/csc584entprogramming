import javax.swing.*;
public class TestZoo {
    
    public static void main(String[] args){
        
        
        double TotalPrice = 0.0;
        int countDay = 0;
        int countNight = 0;
        ZooTaiping[] zooArray = new ZooTaiping[20];
        for(int i=0; i<zooArray.length; i++)
        {
            String name = JOptionPane.showInputDialog("Enter name");
            String icNumber = JOptionPane.showInputDialog("Enter IC number");
           int gov = JOptionPane.showOptionDialog(new JFrame(),"Are you a government servant?","GovServant",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,
           new Object[] {"Yes","No"}, JOptionPane.YES_OPTION);
           boolean govServant = true;
           if(gov == JOptionPane.YES_OPTION){
               govServant = true;
           }
           if(gov == JOptionPane.NO_OPTION){
               govServant = false;
           }
           String type = JOptionPane.showInputDialog("Day or Night visit?");
           if(type.equalsIgnoreCase("Day")){
               String category = JOptionPane.showInputDialog("Adult or Children?");
               zooArray[i] = new DayVisit(name,icNumber,govServant,category);
               TotalPrice = TotalPrice + zooArray[i].totalCharges();
               countDay++;
           }
           else if(type.equalsIgnoreCase("Night")){
               String pack = JOptionPane.showInputDialog("package A/B/C");
               boolean packA = true;
               boolean packB = true;
               boolean packC = true;
               countNight++;
               if(pack.equalsIgnoreCase("A"))
               {
                   packA = true;
                   packB = false;
                   packC = false;
                 
               }
               else if(pack.equalsIgnoreCase("B"))
               {
                   packA = false;
                   packB = true;
                   packC = false;
                  
               }
               else if(pack.equalsIgnoreCase("C"))
               {
                   packA = false;
                   packB = false;
                   packC = true;
                   
               }
               
               zooArray[i] = new NightVisit(name,icNumber,govServant,packA,packB,packC);
               TotalPrice = TotalPrice + zooArray[i].totalCharges();
           }
           
          
           
        }
        
        for(int i=0; i<zooArray.length; i++){
            if(zooArray[i] instanceof DayVisit){
                System.out.println(((DayVisit)zooArray[i]).toString());
            }
            else if(zooArray[i] instanceof NightVisit){
                System.out.println(((NightVisit)zooArray[i]).toString());
            }
        }
        System.out.println("Total Day Visitor:"+countDay);
        System.out.println("Total Night Visitor:"+countNight);
        System.out.println("Total Price RM:"+TotalPrice);
       
        System.out.println("Visitor in Package C");
        for(int i=0; i<zooArray.length; i++){
            if(((NightVisit)zooArray[i]).getPackageC() == true)
                System.out.println(((NightVisit)zooArray[i]).toString());
        }
        
    }
}

     
