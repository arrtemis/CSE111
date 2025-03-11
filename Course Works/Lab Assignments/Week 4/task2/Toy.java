public class Toy {
  public String name;
  public int price;

  public Toy() {
    name = null;
    price = 0;
  }

  public Toy(String name, int price) {
    this.name = name;
    this.price = price;
    System.out.println("A new toy has been made!");
  }

  public void updatePrice(int newPrice) {
    price = newPrice;
  }

  public void updateName(String newName) {
    System.out.println("Changing old name: " + name);
    name = newName;
    System.out.println("new name: " + name);
  }

  public void showPrice() {
    System.out.println("price: " + price);
  }

}
