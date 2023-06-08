public class Main {


    public static void main(String[] args) {

        Customer customer = new Customer("Audrey", "Hepburn", 123456, new MasterCard(200));
        Customer customer2 = new Customer("Lionel", "Richie", 123467, new VisaCard(400));
        customer.printName();
        customer2.printName();
        System.out.println(customer2.getCreditCard().getDebt());
        customer2.getCreditCard().pay(100);
        System.out.println(customer2.getCreditCard().getDebt());

    }
}
