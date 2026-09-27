/*
Create a product class with private properties for name, price, and stock cannot be negative.
Create three products and print their information

   
 */
package OopExercise;

public class Product {
    
    
    private String name;
    private double price;
    private int stock;
    
    public void setName(String n){
    
        name=n;
    
    }
    
    public String getName(){
    
        return name;
    
    }
    
    public void setPrice(double p){
        if (p<0) System.out.println("You dont have enough money to buy this");
        else price=p;
    }
    
    public double getPrice(){
    
        return price;
    
    }
    
    public void setStock(int s){
    
        if (s<0) System.out.println("The stock cannot be less to 0");
        else stock = s;
    
    }
    
    public int getStock(){
    
        return stock;
    }
    
    
    public static void main(String[]args){
    
        Product productOne = new Product();
        
        productOne.setName("Shirt");
        System.out.println(productOne.getName());
        
        productOne.setPrice(10);
        System.out.println(productOne.getPrice());
        
        productOne.setStock(600);
        System.out.println(productOne.getStock());
        
        
        
        Product productTwo = new Product();
        
        productTwo.setName("Hat");
        System.out.println(productTwo.getName());
        
        productTwo.setPrice(60);
        System.out.println(productTwo.getPrice());
        
        productTwo.setStock(20);
        System.out.println(productTwo.getStock());
        
        
        Product productThree = new Product();
        
        productThree.setName("Hoddiee");
        System.out.println(productThree.getName());
        
        productThree.setPrice(30);
        System.out.println(productThree.getPrice());
        
        productThree.setStock(900);
        System.out.println(productThree.getStock());
        
        
    
    
    }
    
    
}
