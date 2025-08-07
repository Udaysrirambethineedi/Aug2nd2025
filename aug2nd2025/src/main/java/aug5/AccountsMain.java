package aug5;

public class AccountsMain {
    public static void main(String[] args) {
   
        Accounts uday = new Accounts("uday", 2000);
        Accounts sriram = new Accounts("sriram", 3000);

      
        uday.deposit(2000);

        
        sriram.withdraw(2000);

       
        System.out.println("\nUpdated Account Details:\n");

        System.out.println(uday); 
        System.out.println();
        System.out.println(sriram); 
    }
}

