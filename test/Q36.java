class Account {
    private static int accountCounter = 1000;
    protected int accountNumber;
    protected String name;
    protected String accountType;
    protected double balance;
    protected String lastDepositDate;

    public Account(String name, String accountType, double initialBalance, String lastDepositDate) {
        this.accountNumber = ++accountCounter;
        this.name = name;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.lastDepositDate = lastDepositDate;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}

// Subclass for Standard Account
class StandardAccount extends Account {
    public StandardAccount(String name, double initialBalance, String lastDepositDate) {
        super(name, "Standard", initialBalance, lastDepositDate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 100000) {
            super.withdraw(amount);
        } else if (amount <= 500000) {
            double penalty = 0.005 * amount;  // 0.5% penalty
            if (balance >= (amount + penalty)) {
                balance -= (amount + penalty);
                System.out.println(amount + " withdrawn with a penalty of " + penalty);
            } else {
                System.out.println("Insufficient balance including penalty.");
            }
        } else {
            System.out.println("Withdrawal limit exceeded for Standard Account.");
        }
    }
}

// Subclass for Premium Account
class PremiumAccount extends Account {
    public PremiumAccount(String name, double initialBalance, String lastDepositDate) {
        super(name, "Premium", initialBalance, lastDepositDate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 500000) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded for Premium Account.");
        }
    }
}

// Main Class
public class Q36 {
    public static void main(String[] args) {
        // Creating accounts
        StandardAccount standardAcc = new StandardAccount("Alice", 300000, "01-03-2025");
        PremiumAccount premiumAcc = new PremiumAccount("Bob", 700000, "05-02-2025");

        // Performing transactions
        System.out.println("\n--- Standard Account Transactions ---");
        System.out.println("Balance: " + standardAcc.checkBalance());
        standardAcc.deposit(50000);
        standardAcc.withdraw(250000);  // Should work without penalty
        standardAcc.withdraw(400000);  // Should apply penalty
        standardAcc.withdraw(600000);  // Should fail

        System.out.println("\n--- Premium Account Transactions ---");
        System.out.println("Balance: " + premiumAcc.checkBalance());
        premiumAcc.deposit(100000);
        premiumAcc.withdraw(400000);  // Should work
        premiumAcc.withdraw(600000);  // Should fail
    }
}
