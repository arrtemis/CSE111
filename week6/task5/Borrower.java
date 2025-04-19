public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  public String name;
  public String[] books_borrowed;
  int index;

  
  public Borrower(String name){
    this.name = name;
    books_borrowed = new String[3];
  }
  
  public static void bookStatus(){
    System.out.println("Available Books: ");
    for (int i = 0; i < 3; i++) {
      System.out.println(book_name[i] + ": " + book_count[i]);
    }

  }

  public static int remainingBooks(String title){
    return book_count[findBookIndex(title)];
  }

  public void borrowBook(String title){
    int i = findBookIndex(title);
    if(i != -1){
      if(book_count[i] > 0){
        book_count[i]--;
        books_borrowed[index++] = book_name[i];
      }else{
        System.out.println("This book is not available.");
      }
    }
  }

  public void borrowerDetails(){
    System.out.println("Name: " + name);
    System.out.println("Books Borrowed: ");
    for (int i = 0; i < index; i++) {
      System.out.println(books_borrowed[i]);
    }
  }

  public static int findBookIndex(String title){
    for (int i = 0; i < book_name.length; i++) {
      if(book_name[i].equals(title)){
        return i;
      }
    }
    return -1;
  }
}