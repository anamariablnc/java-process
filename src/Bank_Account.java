/*
 
Create a BankAccount class with private properties for owner name,
account number, and balance. The balance cannot be negative.
Create one account

 */
package OopExercise;

public class Bank_Account {
    
    private String owner_name;
    private int account_number;
    private double balance;
    
    
    public void setOwnerName(String n){
    
        owner_name = n;
    
    }
    
    public String getOwnerName(){
    
        return owner_name;
    
    }
    
    public void setAccountNumber(int a){
    
        account_number = a;
    
    }
    
    public int getAccountNumber(){
    
        return account_number;
    
    }
    
    public void setBalance(double b){
        
        if(b<0) System.out.println("The balance must not be negative");
        else balance = b;
    
        
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
