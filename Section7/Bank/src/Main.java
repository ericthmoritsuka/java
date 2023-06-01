public class Main {
    public static void main(String[] args) {
        //constructor overloading exists.
        //When we declare multiple constructors, with different formal parameters
        //the number of parameters can be different between constructors.
        //the number may be the same, but the types or order may differ.

        //constructor chaining also exists.
        //It is when we call a constructor from another constructor.

        BankAccount account1 = new BankAccount();
        account1.setAccountNumber("1");
        account1.setAccountBalance(1000);
        account1.setEmail("account1@email.com");
        account1.setCustomerName("John Doe");
        account1.setPhoneNumber("819812345");

        account1.accountSummary();
        account1.depositFunds(1000);
        account1.withdrawFunds(500);
        account1.withdrawFunds(1505);
        account1.depositFunds(2000);
        account1.withdrawFunds(1450);
        account1.withdrawFunds(2050);
        account1.accountSummary();

        BankAccountConstructor account2 = new BankAccountConstructor("2", 2000, "account2@email.com", "Jane Doe", "8198765432");
        account2.depositFunds(1000);
        account2.withdrawFunds(500);
        account2.accountSummary();
    }
}
