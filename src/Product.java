/*
Create a product class with private properties for name, price, and stock cannot be negative.
Create three products and print their information

   
 */
package OopExercise;

public class Product {
    
    
    private String name;
    private double price;
    private int stock;
    
    public void setName(String name){
    
        this.name=name;
    
    }
    
    public String getName(){
    
        return name;
    
    }
    
    public void setPrice(double price){
        if (price<0) System.out.println("You dont have enough money to buy this");
        else this.price=price;
    }
    
    public double getPrice(){
    
        return price;
    
    }
    
    public void setStock(int stock){
    
        if (stock<0) System.out.println("The stock cannot be less to 0");
        else this.stock = stock;
    
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
