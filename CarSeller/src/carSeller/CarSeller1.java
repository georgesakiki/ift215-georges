
package carSeller;


public class CarSeller1 {
    private String windows;
    private String engine;
    private boolean ac;
    private final String productionYear;
    private static final String companyName="LCU Car Seller";
    
    public CarSeller1(String windows, String engine, 
            boolean ac, String productionYear){
        this.windows=windows;
        this.engine=engine;
        this.ac=ac;
        this.productionYear=productionYear;
    }
    
     public String getProductionYear(){
        return productionYear;
     }
     
    public String getWindows(){
        return windows;
    }
    
    public void setWindows(String windows){
        this.windows=windows;
    }
    
    public String getEngine(){
        return engine;
    }
    
    public void setEngine(String engine){
        this.engine=engine;
    }
    
     public boolean hasAc(){
        return ac;
    }
    
    public void setAc(boolean ac){
        this.ac=ac;
    }
    
     public int getEnginePrice(){
        int fuelEnginePrice, dieselEnginePrice, electricalEnginePrice;
        switch(productionYear){
            
        
        case "2012":
                fuelEnginePrice=10000;
                dieselEnginePrice=9500;
                electricalEnginePrice=11500;
               
            case "2013":
                fuelEnginePrice=12000;
                dieselEnginePrice=11500;
                electricalEnginePrice=13500;
                
                break;
            case "2014":
               fuelEnginePrice=14000;
                dieselEnginePrice=13500;
                electricalEnginePrice=15500;
               
                break;
            case "2015": 
               fuelEnginePrice=16000;
                dieselEnginePrice=15500;
                electricalEnginePrice=17500;
                
            default: 
               fuelEnginePrice=0;
                dieselEnginePrice=0;
                electricalEnginePrice=0;
        }
         if(productionYear <="2014"){
            engine != "electrical";
         }
     
        
         public int getPrice(){
        int windowsPrice, acPrice ;
        {
            
                acPrice= 500;
                windowsPrice= 1000;
                
        if(ac==false){
            acPrice=0;
         }
        if(windows=="electrical"){
           windowsPrice=500;
        }
        else
          if(windows=="manual"){
           windowsPrice=0;
           }
        }
       
      
         
       
       
         
   public int getCarPrice(){
        int carPrice;
   
        
        carPrice= (EnginePrice +  windowsPrice
                + acPrice );
       
       return carPrice;
    }
}
