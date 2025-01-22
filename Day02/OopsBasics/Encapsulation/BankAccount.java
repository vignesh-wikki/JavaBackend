// Write a
// class BankAccount with private attributes for
// accountNumber and balance.Provide
// public methods to deposit,withdraw,
// and check
// the balance.

package Day02.OopsBasics.Encapsulation;

class BankAccount {
    private int accountNumber;
    private int balance;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private boolean accountNumberChecking(int accountNumber) {
        if (this.accountNumber == accountNumber)
            return true;

        return false;
    }

    public void deposit(int amount, int accountNumber) {
        if (accountNumberChecking(accountNumber))
            balance += amount;

    }

    public int withdraw(int amount, int accountNumber) {
        if (accountNumberChecking(accountNumber))
            balance -= amount;
        return balance;
    }

    public int checkBalance(int accountNumber) {
        if (accountNumberChecking(accountNumber))
            return balance;
        return 0;
    }

    public static void main(String[] args) {
        BankAccount ac = new BankAccount(101, 0);

        ac.deposit(100000, ac.getAccountNumber());
        System.out.println("Withdrawed: " + ac.withdraw(1000, ac.getAccountNumber()));
        System.out.println("Balance: " + ac.checkBalance(ac.getAccountNumber()));

    }
}