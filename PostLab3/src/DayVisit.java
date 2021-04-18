public class DayVisit extends ZooTaiping{
    private String category;
    
    public DayVisit(String name,String icNumber,boolean govServant,String category){
        super(name,icNumber,govServant);
        this.category = category;
    }
    
    public double totalCharges(){
        double price = 0;
        if(category.equalsIgnoreCase("Adult")){
            price = 25;
        }
        else if(category.equalsIgnoreCase("Children")){
            price = 15;
        }
        return price;
    }
    
    public String toString(){
        return (super.toString()+" Category:"+category);
    }
}
