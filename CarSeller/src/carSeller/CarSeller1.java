
package carSeller;


public class CarSeller1 {
    private int windows;
    private int engine;
    private boolean ac;
    private final int productionYear;
   
    
    public CarSeller1(int windows, int engine, 
            boolean ac, int productionYear){
        this.windows=windows;
        this.engine=engine;
        this.ac=ac;
        this.productionYear=productionYear;
    }
    
     public int getProductionYear(){
        return productionYear;
     }
     
    public int getWindows(){
        return windows;
    }
    
    public void setWindows(int windows){
        this.windows=windows;
    }
    
    public int getEngine(){
        return engine;
    }
    
    public void setEngine(int engine){
        this.engine=engine;
    }
    
     public boolean hasAc(){
        return ac;
    }
    
    public void setAc(boolean ac){
        this.ac=ac;
    }
    
    
    
    public int getPrice(){
        int Price,ACPrice;
    if(ac==true){
            ACPrice=1000;
        }
     else 
    { ACPrice=0;
    }
    Price=ACPrice+windows+engine;
    return Price;
    }
    
}


