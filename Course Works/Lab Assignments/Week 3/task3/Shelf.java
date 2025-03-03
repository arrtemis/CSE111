public class Shelf {
  public int capacity, books;
  public void showDetails(){
    System.out.println("Shelf capacity: " + capacity);
    System.out.println("Number of books: " + books);
  }
  public void addBooks(int n){
    if(capacity == 0){
      System.out.println("Zero capacity. Cannot add books.");
    }else if(n > capacity || books + n > capacity){
      System.out.println("Exceeds capacity");
    }else{
      books += n;
      System.out.println(n + " books added to shelf");
    }
  }
}
