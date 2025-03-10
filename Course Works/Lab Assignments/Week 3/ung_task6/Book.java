public class Book {
  public String title = "Unknown", author = "Unknown", genre = "Unknown";
  public int pages;

  public void createBook(String title) {
    this.title = title;
  }

  public void createBook(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void createBook(String title, String author, String genre) {
    this.title = title;
    this.author = author;
    this.genre = genre;
  }

  public void customizeGenre(String genre) {
    this.genre = genre;
    System.out.println("Updated genere of " + title + " to " +  genre);
  }

  public void customizePages(int pages) {
    this.pages = pages;
    System.out.println("Updated pages of " + title + " to " +  pages);
  }

  public void displayDetails() {
    System.out.print("Title: " + title);
    System.out.print(", Author: " + author);
    System.out.print(", Genre: " + genre);
    System.out.print(", Pages: " + pages);
    System.out.println();
  }
  
}
 