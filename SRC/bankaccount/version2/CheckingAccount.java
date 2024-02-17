package SRC.bankaccount.version2;

public class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_FEE = 25.0;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            balance -= OVERDRAFT_FEE;
        }
        super.withdraw(amount);
    }
}
