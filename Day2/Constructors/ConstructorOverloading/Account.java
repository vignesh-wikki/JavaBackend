// Write a program with a
// class Account
// that has
// overloaded constructors
// to initialize
// accountNumber and
// balance in
// different ways.

package Day2.Constructors.ConstructorOverloading;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        System.out.println("First Constructor: " + this.accountNumber + " " + this.balance);
    }

    public Account(int accountNumber, double balance) {
        this(101);
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Second Constructor: " + this.accountNumber + " " + this.balance);
    }

    public Account() {
        this(102, 500000);
        this.accountNumber = 000;
        this.balance = 0.0;
        System.out.println("Third Constructor: " + this.accountNumber + " " + this.balance);
    }

    public static void main(String[] args) {
        Account ac = new Account();

    }

}
