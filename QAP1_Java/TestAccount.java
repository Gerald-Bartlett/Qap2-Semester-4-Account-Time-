


public class TestAccount {
    
    public static void main(String[] args) {
        
       
    // create Account A
    System.out.println(" ");        
    Account accountA = new Account(); // create an account object
    // Id A = new Id();
    accountA.deposit(1000.00);
    
    // create Account B
    Account accountB = new Account();
    accountB.deposit(1000.00);
    

    // Print Account A & Account B Balance
    System.out.println("Account A has a balance of : "+  accountA.getBalance());
    System.out.println("Account B has a balance of : " + accountB.getBalance());    
    System.out.println("==================================== ");  
    
    // Print credit Account A
    accountA.credit(1000.00);
    System.out.println("Credit $1000 in Account A " );
    System.out.println("Account A has a balance of : " + accountA.getBalance());
    
    // Print credit Account B
    accountB.credit(2000.00);
    System.out.println("Credit $2000 in Account B " );
    System.out.println("Account B has a balance of : " + accountB.getBalance());
    System.out.println("==================================== "); 
        
    // Print transfer from Account B Account A With Balances 
    accountB.transferTo(1000, accountA);
    System.out.println("Transfer $1000.00 from account B to account A");
    System.out.println("Account A has a balance of : " + accountA.getBalance());
    System.out.println("Account B has a balance of : " + accountB.getBalance());
    System.out.println("====================================");

    // Print debit Account A & balance
    accountA.debit(100);
    System.out.println("Debit of $100 from account A ");
    System.out.println("Account A has a balance of : " + accountA.getBalance());

    // Print debit Account A & balance
    System.out.println("Debit of $3000 from account B ");
    accountB.debit(3000);
    System.out.println("Account B has a balance of : " + accountB.getBalance());
    System.out.println("====================================");
    System.out.println(" ");
    
    }

}
