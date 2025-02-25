 class Account {
    int accNo;
    double balance;

    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void disp() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
    }
}

 class AccountHolder extends Account {
    int uid;
    String name;

    public AccountHolder(int accNo, double balance, int uid, String name) {
        super(accNo, balance);
        this.uid = uid;
        this.name = name;
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("UID: " + uid);
        System.out.println("Name: " + name);
    }

    public void transfer(AccountHolder recipient, double amount) {
        if (amount <= 0) {
            System.out.println("Transfer amount must be greater than zero!");
            return;
        }

        if (this.balance < amount) {
            System.out.println("Insufficient balance! Transfer failed.");
            return;
        }

        this.balance -= amount;
        recipient.balance += amount;
        System.out.println("Transfer of $" + amount + " from " + this.name + " to " + recipient.name + " successful!");
    }
}

public class Demo {
    public static void main(String[] args) {
        AccountHolder account1 = new AccountHolder(12345, 1000.0, 101, "Alice");
        AccountHolder account2 = new AccountHolder(67890, 500.0, 102, "Bob");

        System.out.println("Before Transfer:");
        account1.disp();
        System.out.println();
        account2.disp();

        System.out.println("\nAttempting transfer of $300 from Alice to Bob...");
        account1.transfer(account2, 300.0);

        System.out.println("\nAfter Transfer:");
        account1.disp();
        System.out.println();
        account2.disp();

        System.out.println("\nAttempting invalid transfer (-50)...");
        account1.transfer(account2, -50);

        System.out.println("\nAttempting overdraft transfer (800)...");
        account1.transfer(account2, 800);
    }
}
