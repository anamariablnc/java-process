/*
 
Create a BankAccount class with private properties for owner name,
account number, and balance. The balance cannot be negative.
Create one account

 */
package OopExercise;

public class Bank_Account {
    
    private String name;
    private int account;
    private double balance;
    
  //Adding this
    
    public void setOwnerName(String name){
    
        this.name = name;
    
    }
    
    public String getOwnerName(){
    
        return name;
    
    }
    
    public void setAccountNumber(int account){
    
        this.account = account;
    
    }
    
    public int getAccountNumber(){
    
        return account;
    
    }
    
    public void setBalance(double balance){
        
        if(balance<0) System.out.println("The balance must not be negative");
        else this.balance = balance;
    
        
    }
    
    public double getBalance(){
    
        return balance;
    
    }
    
    
    public static void main(String [] args){
    
        
        Bank_Account Client_One = new Bank_Account();
        
        Client_One.setOwnerName("Andres");
        
        System.out.println("Client name: " + Client_One.getOwnerName());
        
        Client_One.setAccountNumber(323232323);
        
        System.out.println("Account number: " + Client_One.getAccountNumber());
        
        Client_One.setBalance(323232323);
        
        System.out.println("Balance: " + Client_One.getBalance());
        
        
        
    
    }
    
}
