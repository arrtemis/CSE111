public class Reader {
  public String name = "New User";
  public int cap;
  public String[] ongoings;
  int books_added;
  public String createReader(String name, int cap){
    this.name = name;
    this.cap = cap;
    ongoings = new String[cap];
    return "A new reader is created!";
  }
  public void readerInfo(){
    System.out.println("Name: " + name);
    System.out.println("Capacity: " + cap);
    System.out.println("Books: ");
    if(books_added != 0){
      for (int i = 0; i < ongoings.length; i++) {
        System.out.println("Book " + (i+1) + ": " + ongoings[i]);
      }
    }else{
      System.out.println("No books added yet");
    }
  }
  public void addBook(String book_name){
    if(books_added < ongoings.length){
      ongoings[books_added++] = book_name;
    }else{
      System.out.println("No more capacity");
    }
  }
}
