public class StoreMoney {
  public static void main(String[] args) {
    Customer c1 = new Customer();
    Customer c2 = new Customer();
    Customer c3 = new Customer();
    System.out.println("1--------------");
    c1.initialInfo("Alif", 250000.0);
    c1.deposit(250000.25);
    c1.displayInfo();
    System.out.println("2--------------");
    c2.initialInfo("Faheema", 600000);
    c2.withdraw(150000.5);
    c2.displayInfo();
    System.out.println("===============");
    System.out.println("Balance: " + c2.checkBalance());
    System.out.println("Balance: " + c1.checkBalance());
    c3.initialInfo("Nila", 50000);
    System.out.println("Status: " + c3.checkBalance());

  }
}
