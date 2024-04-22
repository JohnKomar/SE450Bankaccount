// This is a class named BankAccount which declares variables and creates methods to calculate deposit and withdraw of
// a bank account.
package Question1;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private enum accountType{
        SAVINGS, CHECKING
    }
    private accountType typeofaccount;
    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public BankAccount(int accountNumber, String accountHolderName, double balance, accountType typeofaccount){
        this.accountNumber= accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance= balance;
        this.typeofaccount= typeofaccount;
    }
    public void getAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + typeofaccount);
        System.out.println("Balance: $" + balance);
    }


}
