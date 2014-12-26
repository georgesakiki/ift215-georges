
package carSeller;


public class CarSeller1 {
    private String windows;
    private String engine;
    private boolean ac;
    private String productionYear;
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
    
    public void setEngine(String surface){
        this.engine=engine;
    }
    
     public boolean hasAc(){
        return ac;
    }
    
    public void setAc(boolean ac){
        this.ac=ac;
    }
    
     public int getPrice(){
        int fuelprice, dieselprice, electricalprice, acPrice, windowsprice, price;
        switch(productionYear){
            
        }
      case "2012":
                fuel=10000;
                diselprice=9500;
                electricalprice=11500;
            case "2013":
                fuel=12000;
                diselprice=11500;
                electricalprice=13500;
                break;
            case "2014":
               fuel=14000;
                diselprice=13500;
                electricalprice=15500;
                break;
            case "2015": 
               fuel=16000;
                diselprice=15500;
                electricalprice=17500;
            default: 
               fuel=0;
                diselprice=0;
                electricalprice=0;
        }
        if(ac==false){
            acPrice=0;
        }
       
         If(ac==true){
            acPrice=1000;
            
       }
         
        
        
     
    
    
     
    
        