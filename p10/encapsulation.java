

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance >= 0 ? balance : 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account =
            new BankAccount("Rahul", "12345", 5000);

        System.out.println("Account Holder: "
                           + account.getAccountHolder());

        account.deposit(1000);   // Valid
        account.deposit(-500);   // Invalid

        account.withdraw(2000);  // Valid
        account.withdraw(0);     // Invalid
        account.withdraw(5000);  // Insufficient balance

        System.out.println("Updated Balance: "
                           + account.getBalance());
    }
}
