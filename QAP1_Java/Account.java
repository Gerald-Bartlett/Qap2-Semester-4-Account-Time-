// Qap 1 Problem #1 Advanced Java Gerald Bartlett For Dr. Anni

public class Account {
    
    
    class account {      
        protected double balance;
        public account (double initialDeposit) {
            balance = initialDeposit;           
        }
    }
    
    private double balance;
    

    // set ballance to 0.00
    public Account(String account) {
        balance = 0.0;
        // id = 0;
    }

    public Account() {
       
    }
    
    // deposit
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // debit account

     // Method to decrease the account balance by the amount passed in.
    public void debit (double amount) { 
    if(amount <= balance){
        balance = balance - amount;
    }
    else {
        System.out.println("Amount exceeded balance: ");
     }
    }
    // Method to increase the account balance by the amount passed.
    public void credit (double amount) {
    balance = balance + amount;
    }  

    public void transferTo(double amount, Account another) {
        if (balance >= amount) {
           this.balance -= amount;
           another.balance += amount;
        } else {
           System.out.println("amount exceeded");
        }
    }
    
    // get balance
    public double getBalance() {
        return balance;
    }
}
