//Abdur Mohammed
//Period 5

/**This represents a simple bankaccount with limited functionality
 * @author Abdur Mohammed
 * @version 1.0
 */

public class BankAccount {
    //instance variables
    private double balance;

    /**
     * Default Constructor. Makes an empty bank account
      */
    public BankAccount(){
        balance = 0;
    }

    /**Constructor that takes in an starting balance
     * @param initialBalance - starting balance
     */
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    /**Deposit adds money to the bank account
     * @param amount - money to be deposited
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**Withdraw removes money from bank account. Assumes amount is less than balance
     * @param amount - money to be withdrawn
     */
    public void withdraw (double amount){
        balance -= amount;
    }

    /**GetBalance - Gets the balance
     * @return - amount of money in bank account
     */
    public double getBalance(){
        return balance;
    }
}
