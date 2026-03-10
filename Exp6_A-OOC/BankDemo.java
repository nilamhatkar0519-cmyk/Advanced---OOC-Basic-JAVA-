// Custom Exceptions
class LowBalanceException extends Exception {
    public LowBalanceException(String message) { super(message); }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) { super(message); }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) throw new NegativeNumberException("Cannot deposit negative amount.");
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0) throw new NegativeNumberException("Cannot withdraw negative amount.");
        if (amount > balance) throw new LowBalanceException("Insufficient funds! Balance is only $" + balance);
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        try {
            account.balanceEnquiry();
            account.deposit(200);
            account.withdraw(1000); // This will trigger LowBalanceException
        } catch (LowBalanceException | NegativeNumberException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
}
