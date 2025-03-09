public class ShoppingItems {
  public String name, section;
  public int price;
  public ShoppingItems(String name, String section, int price){
    this.name = name;
    this.section = section;
    this.price = price;
  }
  public void showItemDetails(){
    System.out.println("Name: " + name);
    System.out.println("Section: " + section);
    System.out.println("Price: " + price);
  }
}
