package ATMMachine;

import java.util.*;

class ATM {
    float Balance;
    int PIN = 2000;

    public void checkpin() {
        System.out.println("Enter your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid PIN: ");
            
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        }

        else if (opt == 2) {
            WithdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        }

        else if (opt == 4) {
            return;
        }

        else {
            System.out.println("Enter a valid choice");
            menu();
        }

    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void WithdrawMoney() {
        System.out.println("Enter Amount to withdraw: ");
        Scanner Sc = new Scanner(System.in);
        float amount = Sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficiant Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successful");
        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("Enter the Amount: ");
        Scanner Sc = new Scanner(System.in);
        float amount = Sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposite Successfuly");
        menu();

    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int pIN) {
        PIN = pIN;
    }
}

public class ATMMachine {

    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();
    }
}