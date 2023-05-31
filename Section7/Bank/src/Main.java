public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountBalance(1000);
        account1.setAccountNumber("1");
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
    }
}
