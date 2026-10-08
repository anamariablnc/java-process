
package GameInventorySystem;

import javax.swing.JOptionPane;

public class main {
    
    public static void main (String [] args){
    
        
    videGame[] inventary = new videGame[5];
    
    int option;
    
    //Object counter
    int counter=0;
   
    //Do-While menu
    do{
        
    option = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1.Register video game\n"
                                                       + "2. Show Inventary\n"
                                                       + "3. Search videogame\n"
                                                       + "4. Buy videogame\n"
                                                       + "5. Show staidstics\n"
                                                       + "6. Exit"));
    
    
    
    
    
    
    
    
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
            
                for (int i = 0; i < counter; i++) {
                    
                    System.out.println(inventary[i].getName());
                    System.out.println(inventary[i].getPlataform());
                    System.out.println(inventary[i].getPrice());
                    System.out.println(inventary[i].getStock());
                    
                }
   
            
            }  
                else System.out.println("Inventory empty");
        break;
        
        case 3:
            
            String SearchGame = JOptionPane.showInputDialog("Search game");
            
            if(counter > 0){
            
                for (int i = 0; i < counter; i++) {
                    
                    if(inventary[i].getName().equals(SearchGame)){
                    
                        System.out.println(inventary[i].getName());
                        System.out.println(inventary[i].getPlataform());
                        System.out.println(inventary[i].getPrice());
                        System.out.println(inventary[i].getStock());
                    
                    }
                    
                }
            
            }else System.out.println("Game dont found");
        break;
                
}
    
    }while(option!=6);
   
    
    }
    }
    

