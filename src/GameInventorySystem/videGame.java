
package GameInventorySystem;

public class videGame {
    
    private String name;
    private String plataform;
    private double price;
    private int stock;
    
    //creating setter and getter for encapsulation
    
    public void setName (String name){ //Same name parameter to variable for clarity
     
        this.name = name; //Using this to say that parameter data is gonna be stored into class variable
    }
    
    public String getName(){
    
        //returning data
        
        return name;
    }
    
    
    public void setPlataform(String plataform){
    
        this.plataform = plataform;    
    }
    
    public String getPlataform(){
    
        return plataform;
    
    }
    
    public void setPrice(double price){
    
        this.price = price;
    
    }
    
    public double getPrice(){
    
        return price;
    
    }
    
    public void setStock(int stock){
    
        this.stock = stock;
    
    }
    
    public int getStock(){
    
        return stock;
    
    }
    
        
    
    }
    

