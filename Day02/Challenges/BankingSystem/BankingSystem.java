// Implement a simple banking system where users can open accounts, deposit money, withdraw money, and check balance using OOP.

package Day02.Challenges.BankingSystem;

import java.util.HashMap;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nEnter 1 to open Account");
            System.out.println("Enter 2 to deposit in Account");
            System.out.println("Enter 3 to withdraw from Account");
            System.out.println("Enter 4 to check Account Balance");
            System.out.println("Enter 5 to Exit");

            int selection = sc.nextInt();
            sc.nextLine();

            switch (selection) {
                case 1: {
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    Account account = new Account(accountNumber);
                    bank.openAccount(accountNumber, account);
                    break;
                }
                case 2: {
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    Account account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        account.deposit(amount);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    Account account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        account.withdraw(amount);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    Account account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Balance amount is: " + account.checkBalance());
                    }
                    break;
                }
                case 5: {
                    sc.close();
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

class Bank {
    private HashMap<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void openAccount(String accountNumber, Account account) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, account);
            System.out.println("Account opened with number: " + accountNumber);
        } else {
            System.out.println("Account already exists.");
        }
    }

    public Account findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}
