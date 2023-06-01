public class BankAccountConstructor {
    private final String accountNumber;
    private double accountBalance;
    private final String customerName;
    private final String email;
    private final String phoneNumber;

    //with a constructor, when we create a new instance with new, the constructor method is
    //implicitly called. If there is no constructor declared, a default one is declared.
    //It is called no-args (no arguments) constructor.

    //the constructor has to have the same name as the class
    //it does not have a return type, not even void
    //We use an access modifier to change who can instantiate the class.
    public BankAccountConstructor (String accountNumber, double accountBalance,
                                   String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //we can use a different name to the variable, for example: customerEmail
    }

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
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
