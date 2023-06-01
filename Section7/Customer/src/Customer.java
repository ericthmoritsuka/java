public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    //constructor overload
    public Customer (String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer (){
        this("John", 10000, "john@email.com");
    }

    public Customer(double creditLimit) {
        this("Jack", creditLimit, "jack@email.com");
    }

    public void printData(){
        System.out.println(name);
        System.out.println(creditLimit);
        System.out.println(email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
