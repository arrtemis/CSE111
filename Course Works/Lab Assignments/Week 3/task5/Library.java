public class Library {
  public int total_books = 0;
  public String[] books;
  public void setBookCapacity(int n){
    books = new String[n];
  }
  public void addBook(String name){
    if(total_books + 1 > books.length){
      System.out.println("Exceeds maximum capacity. You can't add more than " + books.length + " books");
    }else{
      books[total_books++] = name;
      System.out.println("Book '" + name + "' added to the library");
    }
  }
  public void printDetail(){
    System.out.println("Maximum Capacity: " + books.length);
    System.out.println("Total Books:  " + total_books);
    System.out.println("Book list: ");
    for (int i = 0; i < total_books; i++) {
      System.out.println(books[i]);
    }
  }
}
