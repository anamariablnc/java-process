
package Modularization_Polarization;

/*

If we want to take the tires propietie from the class car
         and you put 2.000 tires property wont be correct because for 
         general the cars have 4 cars*/
        
        //Car mazda = new Car();
        //mazda.tires= 2000;  // property without initialization
        
        
        /*¿So can we can make sure that in others clases put the correct information?
        We must to encapsulate that property and put some requerimients with setter
        and getter and that way would be a specific paramenters to put in that parameter
*/

public class Car {
    
    //Propities ----------------
    
    private int tires; 
    
    /*
    With the keyword Private you encapsulate the property
    and any classe wont be able to put information in there directly
    
    But if they're not able to put information, how can we create objects?
    Easy, with getters and setters
    */
    
    //So with this setter you can make sure the other classes put the correct information
    public void setTires(int t){
    
        if(t<3 || t> 4){
        
            System.out.println("Incorrect");
        
        }else{
        
            tires = t;
        
        }
        
    }
    
    /*
    But if the propertie is private and the setter is only useful to put the information
    How can I get the information from another class?
    You must use a getter:
    */
    
    public int getTire(){
    
        return tires;
    }
   
    
    
    
    public static void main (String [] args){
    
        /*
        And here even if you not able to access to the tire property you can call it
        and used it whit the setter requirements
        */
        
        //Creating a object from the Car class
        Car mazda = new Car ();
        
        //using the propitie 
       mazda.setTires(4); //In the parameters you put the number of dors --- and the setter will validate if you can put that information in it
       
        System.out.println(mazda.getTire());//With this you're showing in the console the number of tires of the car mazda
        
        
    
    }
    
}
