
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
        int fuelengineprice, dieselengineprice, electricalengineprice;
        switch(productionYear){
            
        
        case "2012":
                fuelengineprice=10000;
                dieselengineprice=9500;
                electricalengineprice=11500;
               
            case "2013":
                fuelengineprice=12000;
                dieselengineprice=11500;
                electricalengineprice=13500;
                
                break;
            case "2014":
               fuelengineprice=14000;
                dieselengineprice=13500;
                electricalengineprice=15500;
               
                break;
            case "2015": 
               fuelengineprice=16000;
                dieselengineprice=15500;
                electricalengineprice=17500;
                
            default: 
               fuelengineprice=0;
                dieselengineprice=0;
                electricalengineprice=0;
        }
     
                
                
               
 
    
         if (productionYear = "2013" || "2012"){
            engine (!electrical);
         }
     }
     
     
        
         public int getAcPrice(){
        int  acprice ;
        {
            acprice= 500;
        }
            if(ac==false){
            acprice=0;
         }
        }
         
        
         public int getWindowsPrice(){
             int windowsprice;
             {
             windowsprice= 1000;    
             }
              if(windows=="electrical"){
           windowsprice=500;
        }
        else
          if(windows=="manual"){ 
           windowsprice=0;
           
           }
             
         }
         
             
             
     
         
   public int getPrice(){
        int price;
        {
        
       price= (total +  windowsprice
                + acprice );
       
       return price;
    }
  }
 }

