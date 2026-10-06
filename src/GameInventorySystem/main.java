
package GameInventorySystem;

import javax.swing.JOptionPane;

public class main {
    
    public static void main (String [] args){
    
        
    videGame[] inventary = new videGame[5];
    
    
    // menu
    
    int option = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.Register video game\n"
                                                       + "2. Show Inventary\n"
                                                       + "3. Search videogame\n"
                                                       + "4. Buy videogame\n"
                                                       + "5. Show staidstics\n"
                                                       + "6. Exit"));
    
    //Object counter
    
    int counter=0;
    
    switch(option){
    
        case 1: 
        
        inventary[counter] = new videGame();
           
        inventary[counter].setName(JOptionPane.showInputDialog("Enter game Name"));
           
        inventary[counter].setPlataform(JOptionPane.showInputDialog("Enter plataform game"));
           
        inventary[counter].setPrice((double)Integer.parseInt(JOptionPane.showInputDialog("Enter game price")));
            
        inventary[counter].setStock((int)(Math.random()*20));
        
        counter++;
        
        break;
        
        case 2:
        
            if (counter > 0){
            
                for(videGame Element : inventary){
                    
                    System.out.println(inventary[counter].getName());
                    System.out.println(inventary[counter].getPlataform());
                    System.out.println(inventary[counter].getPrice());
                    System.out.println(inventary[counter].getStock());
                }  }  
                else System.out.println("Inventory empty");
                
}
    
    
    }
    }
    

