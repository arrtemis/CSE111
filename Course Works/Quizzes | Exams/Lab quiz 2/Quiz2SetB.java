public class Quiz2SetB {
  public static void main(String[] args) {

    Customer c1 = new Customer();
    Customer c2 = new Customer();
    Customer c3 = new Customer();

    c1.createCustomer("Afnan", "C01");
    c2.createCustomer("Nuzha", "C02");
    c3.createCustomer("Abdullah Rafid", "C03", "Male");

    c2.updateInfo("Female");

    c1.addToCart("Sunglasses");
    c1.addToCart("Perfume", "Watch");
    c1.addToCart("Hair Oil");

    c1.invoice();

    c2.addToCart("Apple");
    c2.addToCart("Banana");

    c2.invoice();

    c3.invoice();
    c3.addToCart("Keyboard");
    c3.addToCart("Mouse");
    c3.addToCart("Headphones");
    c3.invoice();
  }
}
