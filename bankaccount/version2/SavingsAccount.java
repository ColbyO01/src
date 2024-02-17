package SRC.bankaccount.version2;

public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.01;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void addInterest() {
        balance += balance * INTEREST_RATE;
    }
}
