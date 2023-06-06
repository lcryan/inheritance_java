public class Main {


    public static void main(String[] args) {


        Customer customer = new Customer("Audrey", "Hepburn", 123456, new CreditCard(200));
        Customer customer2 = new Customer("Lionel", "Richie", 123467, new CreditCard(300));
        customer.printName();
        customer2.printName();
    }
}
