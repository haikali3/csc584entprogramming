public abstract class ZooTaiping {
    private String visitorName;
    private String icNumber;
    private boolean govServant;
    
    public ZooTaiping(String name,String ic,boolean govServ)
    {
        visitorName = name;
        icNumber = ic;
        govServant = govServ;
    }
    
    public String getName(){
        return visitorName;
    }
    
    public String getIC(){
        return icNumber;
    }
    
    public boolean getGovServant(){
        return govServant;
    }
    
    public abstract double totalCharges();
    
    public String toString(){
        return ("Name:"+visitorName+" IC No:"+icNumber+" Visitor is a a goverment servant:"+govServant);
    }
        
}
  
