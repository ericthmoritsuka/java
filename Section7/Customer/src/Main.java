public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jane", 5000, "jane@email.com");
        Customer customer2 = new Customer();
        Customer customer3 = new Customer(3000);

        customer1.printData();
        customer2.printData();
        customer3.printData();
    }
}
