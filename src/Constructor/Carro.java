
package Constructor;

/*
    
    What is?:
    
    The constructor is the way how you can put an initial state to your object
    
    Why?:
    Sometimes you need to put an initial state, for expample this would be useful
    to the tires of the car, for general all the cars have 4 tires so you can put
    that initial state for the tires and all the objects would be have 4 intial tires
    
    
*/

public class Carro {
    
    
    //Constructor
    public Carro(){
    
     tires = 4;
        
    
    }
    
    //Propities
    
    int tires;
    
    
    public static void main(String[]args){
    
        //Created object
        
        Carro Mazda = new Carro();
    
        //We created this object, so this object would have 4 initial tires
        
        System.out.println("Mazda have " + Mazda.tires);
    
    
    }
    
   
    
    
    
}
