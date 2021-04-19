//Abdur Mohammed
//Period 5



public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount one = new BankAccount(1000);
        one.deposit(500);
        one.withdraw(250);
        System.out.println("Your balance: $" + one.getBalance());
        System.out.println("Expected: $1250");
    }
}
