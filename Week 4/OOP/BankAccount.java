public class BankAccount {
    String accHolder;
    double balance;

    BankAccount(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        }
    }

    void displayBalance() {
        System.out.println(accHolder + "'s Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Bishal", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);
        acc.displayBalance();
    }
}
