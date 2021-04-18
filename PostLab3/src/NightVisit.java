public class NightVisit extends ZooTaiping
{
    private boolean packageA; 
    private boolean packageB;
    private boolean packageC;
    
    public NightVisit(String name,String icNumber,boolean govServant,boolean A,boolean B,boolean C)
    {
        super(name,icNumber,govServant);
        packageA = A;
        packageB = B;
        packageC = C;
    }
    
    public boolean getPackageA()
    {
        return packageA;
    }
    
     public boolean getPackageB()
    {
        return packageB;
    }
     
     public boolean getPackageC()
    {
        return packageC;
    }
    
    public double totalCharges()
    {
        double price = 0;
        double discount=0.75;
        if(super.getGovServant()==true){
            if(packageA==true){
                price=50*discount;
            }
            else if(packageB==true){
                price=75*discount;
            }
            else if(packageC==true){
                price=100*discount;
            }   
        }
        else
        {
            if(packageA==true){
                price=50;
            }
            else if(packageB==true){
                price=75;
            }
            else if(packageC==true){
                price=100;
            }   
            
        }
        return price;
    }
    
    
    public String toString(){
        return (super.toString()+" Package A:"+packageA+" Package B:"+packageB+" Package C:"+packageC);
    }
    
}
