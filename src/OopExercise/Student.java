
package OopExercise;


//Create a Student class with private properties for name, age, and grade. Age must be between 15 and 30, and grade must be between 0 and 10. Create three students and print their information

public class Student {

      private String name;
      private int age;
      private int grade;
      
    //Adding this
      public void setName(String name){
      
          this.name = name;
      
      }
      
      public String getName(){
      
          return name;
      }

      public void setAge(int age){

          if (age<15 || age>30) System.out.println("That age is no correct");
          else this.age=age;

      }
      
       public int getAge(){

       return age;

      }

      public void setGrade(int grade){

       if (grade<0 || grade>10) System.out.println("Invalid grade");
       else this.grade=grade;
      
      }

     public int getGrade(){

       return grade;

     }

      
public static void main(String [] args){

       Student studentOne = new Student ();
       Student studentTwo = new Student ();
       Student studentThree = new Student ();
          
       //studentOne
      
      studentOne.setName("Jorge");
      System.out.println(studentOne.getName());
      studentOne.setAge(200);
      System.out.println(studentOne.getAge());
      studentOne.setGrade(9);
      System.out.println(studentOne.getGrade());
 

       //studentTwo
      
      studentTwo.setName("Andres");
      System.out.println(studentTwo.getName());
      studentTwo.setAge(20);
      System.out.println(studentTwo.getAge());
      studentTwo.setGrade(10);
      System.out.println(studentTwo.getGrade());
 
      //studentThree
      
      studentThree.setName("Erick");
      System.out.println(studentThree.getName());
      studentThree.setAge(20);
      System.out.println(studentThree.getAge());
      studentThree.setGrade(10);
      System.out.println(studentThree.getGrade());
}
      }