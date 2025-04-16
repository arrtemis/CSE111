package week6.task3;

public class Book {
  public static int total_books_sold;
  public static double total_revenue;
  public String name;
  public double price = 150.0;
  public double discountPercentage;

	public Book(String name, int discount) {
    this.name = name;
    discountPercentage = discount;
    total_books_sold++;
  }

  public void giveDiscount(){
    price = price * (1 - discountPercentage/100);
    total_revenue += price;
  }

  public void bookDetails() {
    System.out.println("Title: " + name);
    giveDiscount();
    System.out.println("Price after Discount: " + price);
  }
  
}