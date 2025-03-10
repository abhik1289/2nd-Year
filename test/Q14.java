
class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class AccountHolder extends Account {
    int uId;
    String name;

    AccountHolder(int accNo, double balance, int uId, String name) {
        super(accNo, balance);
        this.uId = uId;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Account Number: " + super.accNo);
        System.out.println("Balance: " + super.balance);
        System.out.println("User ID: " + uId);
        System.out.println("Name: " + name);
    }

    public void transfer(double amount, AccountHolder rec) {

        if (balance >= amount && amount > 0) {
            balance -= amount;
            rec.balance += amount;
            System.out.println("Transfer Successful");
        } else {
            System.out.println("Transfer Failed");
        }

    }
}

public class Q14 {

}
