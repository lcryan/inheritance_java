public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Audrey", "Hepburn", 123456);
        Customer customer2 = new Customer("Lionel", "Richie", 456279);
        customer.printName();
        customer2.printName();
    }
}
