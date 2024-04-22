// This is BankAccountTest class that contains a main() method that instantiates an object of type BankAccount
// This will run deposit and withdraw and provide account information
package Question2;

public class BankAccountTest {
    public static void main(String args[]){
        BankAccount account1 = new BankAccount(12345, "John Doe", 1000, BankAccount.accountType.SAVINGS);
        account1.deposit(500);
        account1.withdraw(300);
        account1.getAccountInfo();
    }
}

