public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositFunds(double amount){
//        setAccountBalance(getAccountBalance() + amount);
        accountBalance += amount;
        System.out.println("Your new balance is: $" + getAccountBalance());
    }

    public void withdrawFunds(double amount){
        if (amount > getAccountBalance()){
            System.out.println("You cannot withdraw funds. Your account will be: $" + (accountBalance-amount));
            System.out.println("Your balance is: $" + getAccountBalance());
        } else {
//            setAccountBalance(getAccountBalance()-amount);
            accountBalance -= amount;
            System.out.println("You withdrew $" + amount);
            System.out.println("Your new balance is: $" + getAccountBalance());
        }
    }

    public void accountSummary(){
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("WELCOME TO BANK OF AMERICA");
        System.out.println("Account #" + getAccountNumber());
        System.out.println("Owner: " + getCustomerName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhoneNumber());
        System.out.println("Balance: $" + getAccountBalance());
        System.out.println("--------------------------");
        System.out.println();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
