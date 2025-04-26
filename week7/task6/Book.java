package week7.task6;

public class Book extends Product {

  public String isbn, publisher;

  public Book(int id, String title, int price, String isbn, String publisher) {
    super(id, title, price);
    this.isbn = isbn;
    this.publisher = publisher;
  }

  public String printDetail(){
    return getIdTitlePrice() + " ISBN: " + isbn + " Publisher: " + publisher;
  }

}
