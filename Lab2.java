class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance of $100 must be maintained.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount(200); // Create a savings account with $200 initial balance
        account1.withdraw(50); // Allowed
        account1.withdraw(150); // Not allowed
        account1.deposit(100); // Allowed
        System.out.println("Account balance: $" + account1.getBalance());
    }
}
