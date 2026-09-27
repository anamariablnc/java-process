/*
 Create a patient class with private properties for name, age, and temperature must be between 35 and 42 degrees. Create two patients 
 */
package OopExercise;


public class Patient {
    
    private String name;
    private int age;
    private double temperature;
    
   //Adding this
    
    public void setName(String name){
    
        this.name=name;
    
    
    }
    
    public String getName(){
    
        return name;
    
    }
    
    
    public void setAge(int age){
    
        if(age<0 || age>110) System.out.println("Edad no valida");
        else this.age = age;
    
    }
    
    public int getAge(){
    
        return age;
    
    }
    
    public void setTemperature(double temperature){
    
        if(temperature<35||temperature>42) System.out.println("The temperature is not correct");
        else this.temperature = temperature;
    }
    
    public double getTemperature(){
    
        return temperature;
    
    }
    
    
    
    public static void main (String [] args){
    
        Patient patientOne = new Patient();
        
        patientOne.setName("Enrique");
        System.out.println(patientOne.getName());
        
        patientOne.setAge(40);
        System.out.println(patientOne.getAge());
        
        patientOne.setTemperature(56);
        System.out.println(patientOne.getTemperature());
        
        
        Patient patientTwo = new Patient();
        
        patientTwo.setName("Carlos");
        System.out.println(patientTwo.getName());
        
        patientTwo.setAge(32);
        System.out.println(patientTwo.getAge());
        
        patientTwo.setTemperature(37);
        System.out.println(patientTwo.getTemperature());
    
    
    }
}
