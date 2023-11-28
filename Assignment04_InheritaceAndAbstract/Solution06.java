/**
 * @question: Assume that a bank maintains two kinds of account for its
 *            customers, one called savings account and other called current
 *            account. The savings account provides compound interest and
 *            withdrawal facilities but no cheque book facility. The current
 *            account provides cheque book facility but no interest. Current
 *            account holders should also maintain a minimum balance (say Rs.
 *            1000) and if the balance falls below this level a service charge
 *            is imposed (say Rs. 100).
 *            Create a class Account that stores customer name, account number
 *            and type of account. From this class derive two classes Curr_Acct
 *            and Savn_Acct respectively to make them more specific to their
 *            requirements. Include the necessary methods to achieve the
 *            following tasks:
 *            a. Accept deposit from a customer and update the balance.
 *            b. Display the balance.
 *            c. Compute and deposit interest.
 *            d. Permit withdrawal and update the balance.
 *            e. Check for minimum balance, impose penalty, if necessary, and
 *            update the balance.
 *            Use constructors to initialize the class members.
 * @author: Nirmalya Dhara
 * @date: 23 Nov, 2023
 */
package assignment04Classes;

class Account {
    String customerName;
    long accountNo;
    String accountType;
    double accountBalance;

    public Account(String customerName, long accountNo, String accountType) {
        this.customerName = customerName;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = 0;
    }

    public double getBalance() {
        return this.accountBalance;
    }

    public void acceptDeposit(double amount) {
        this.accountBalance += amount;
        System.out.println("Rs. " + amount + " is successfully deposited to your account");
    }

}

class Curr_Acct extends Account {
    int minBalance;
    int serviceCharge;

    public Curr_Acct(String customerName, long accountNo) {
        super(customerName, accountNo, "current");
        this.minBalance = 1000;
        this.serviceCharge = 100;
    }

    public void checkMinBalance() {
        if (this.accountBalance < this.minBalance) {
            this.accountBalance -= this.serviceCharge;
            System.out.println("Rs. " + this.serviceCharge + " is imposed as your account balance is less than "
                    + this.minBalance);
        }
    }

    public double getBalance() {
        checkMinBalance();
        return super.getBalance();
    }

    public void acceptDeposit(double amount) {
        super.acceptDeposit(amount);
        checkMinBalance();
    }

}

class Savn_Acct extends Account {
    double interest;

    public Savn_Acct(String customerName, long accountNo) {
        super(customerName, accountNo, "savings");
        this.interest = 0.05;
    }

    public void getInterest() {
        double calcInt = (this.accountBalance * interest);
        this.accountBalance += calcInt;
        System.out.println("Rs. " + calcInt + " is deposit as interest, and new balance : " + super.getBalance());
    }

    public void withdrawalAmout(double amount) {
        if (amount <= this.accountBalance) {
            this.accountBalance -= amount;
            System.out.println("Rs. " + amount + " is successfully withdrawal from your account");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Solution06 {
    public static void main(String[] args) {
        Curr_Acct currentAcct = new Curr_Acct("Bruce Wayane", 37117593201L);
        Savn_Acct savingsAcct = new Savn_Acct("Tony Stark", 916295661556L);
        currentAcct.acceptDeposit(1000000);
        System.out.println("Account Balance : " + currentAcct.getBalance());

        savingsAcct.acceptDeposit(1000000);
        savingsAcct.withdrawalAmout(-1000000);
        savingsAcct.getInterest();
    }
}
