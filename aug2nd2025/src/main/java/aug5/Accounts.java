package aug5;

public class Accounts {
    private static int accCounter = 1000; // for auto-generating account numbers

    private int accNum;
    private String accHolderName;
    private double balance;

   
    private static final double MIN_BALANCE = 500.0;

    // Constructor
    public Accounts(String accHolderName, double initialBalance) {
        this.accHolderName = accHolderName;
        if (initialBalance >= MIN_BALANCE) {
            this.balance = initialBalance;
        } else {
            this.balance = MIN_BALANCE; 
        }
        this.accNum = accCounter++;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " INR deposited to " + accHolderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(amount + " INR withdrawn from " + accHolderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal for " + accHolderName);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account Number: " + accNum +
               "\nAccount Holder: " + accHolderName +
               "\nBalance: INR " + balance;
    }
}

