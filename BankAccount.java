public class BankAccount {

    //attributes
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    //constructor
    public BankAccount(int accountNumber, String accountHolderName, double accountBalance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    //method for deposit
    public void deposit(double amount) 
    {
        accountBalance = accountBalance + amount;
    }

    //method for withdrawal
    public void withdraw(double amount) 
    {
        if (amount <= accountBalance)
            accountBalance = accountBalance - amount;
        else
            System.out.println("Insufficient balance.");
    }

    //method to display info
    public void displayAccountInfo() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        //new object
        BankAccount account = new BankAccount(989630242, "Noopur Sharma", 5000);

        //deposit money
        account.deposit(1000);

        //withdraw money
        account.withdraw(400);

        //display info
        account.displayAccountInfo();
    }
}
