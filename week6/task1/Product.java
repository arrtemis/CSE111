package week6.task1;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(){
    name = "Unknown";
    price = 0.0;
  }
  public Product(String name, double price){
    this.name = name;
    this.price = price;
  }

  public void displayInfo(){
    System.out.println("Product Name: " + name );
    System.out.println("Price: $" + price);
  }
  public void displayInfo(boolean flag){
    if(flag){
      displayInfo();
      System.out.println("Quantity: " + quantity);
    }
  }

  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }

  public void setQuantity(int n){
    quantity = n;
  }

}
