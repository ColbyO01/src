package SRC.bankaccount.version2;

public class BankAccountDriver {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(2000);

        checkingAccount.deposit(500);
        checkingAccount.withdraw(200);
        savingsAccount.deposit(1000);
        savingsAccount.addInterest();

        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}
