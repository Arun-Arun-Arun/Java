/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Accounts {
    private String accountNumber;
    private double balance;

    public Accounts(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " in an account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Your Account " + accountNumber + " has " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Accounts> accounts = new ArrayList<>();
        accounts.add(new Accounts("12345", 10000));
        accounts.add(new Accounts("34567", 20000));

        while (true) {
            System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.Display Balance \n 4.Exit");
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting.....");
                break;
            }

            System.out.println("Enter your Account Number: ");
            String accountNumber = sc.next();
            Accounts selectedAccount = null;

            for (Accounts account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    selectedAccount = account;
                    break;
                }
            }

            if (selectedAccount == null) {
                System.out.println("Account not found");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    selectedAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    selectedAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    selectedAccount.displayBalance();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Accounts
{
    private String accountNumber;
    private double balance;

    public  Accounts(String accountNumber,double initialbalance)
    {
        this.accountNumber=accountNumber;
        this.balance=initialbalance;
    }

    public void Deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited $" +amount+ "in an account "+accountNumber);
    }
    public void Withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance -= amount;
            System.out.println("Withdraw $" +amount+ "in an account "+accountNumber);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public void displaybalance()
    {
        System.out.println("Your Account " +accountNumber+ " has "  +balance);
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Accounts> accounts = new ArrayList<>();
        accounts.add(new Accounts("12345", 10000));
        accounts.add(new Accounts("34567", 20000));
        System.out.println("\n 1.Deposit \n 2.Withdraw \n 3.DisplayBalance \n 4.Exit");
        System.out.println("Enter your Choice: ");
        int choice = sc.nextInt();
        if (choice == 4) {
            System.out.println("Exiting.....");
            return;
        }
        while (true)
        {
            System.out.println("Enter your Account Number: ");
            String accountNumber = sc.next();
            Accounts selectedaccount = null;
            for (Accounts account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    selectedaccount = account;
                    break;
                }
            }
            if (selectedaccount == null) {
                System.out.println("Account not found");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    selectedaccount.Deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter Withdraw Amount: ");
                    double WithdrawAmount = sc.nextDouble();
                    selectedaccount.Withdraw(WithdrawAmount);
                    break;
                case 3:
                    selectedaccount.displaybalance();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


