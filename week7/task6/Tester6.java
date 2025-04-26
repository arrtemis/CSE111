package week7.task6;

public class Tester6 {
  public static void main(String[] args) {
    Book book = new Book(1, "The Alchemist", 500, "97806", "HarperCollins");
    System.out.println(book.printDetail());
    System.out.println("-----------------------");
    
    CD cd = new CD(2, "Shotto", 300, "Warfaze", 50, "Hard Rock");
    System.out.println(cd.printDetail());
  }
}

class Product {
  private int id;
  private String title;
  private int price;
  
  public Product(int id, String title, int price) {
    this.id = id;
    this.title = title;
    this.price = price;
  }
  
  public String getIdTitlePrice() {
    return "ID: " + id + " Title: " + title + " Price: " + price;
  }
}

