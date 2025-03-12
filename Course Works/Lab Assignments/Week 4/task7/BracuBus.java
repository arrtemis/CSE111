public class BracuBus {
  public String route;
  public String[] passengers;
  int index;

  public BracuBus(String route) {
    this.route = route;
    passengers = new String[2];
  }

  public BracuBus(String route, int capacity) {
    this.route = route;
    passengers = new String[capacity];
  }

  public void board(){
    System.out.println("No passengers");
  }
  public void board(BracuStudent student){

  }
  public void board(BracuStudent student1, BracuStudent student2){

  }
  
  public void showDetails() {
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + index);
    System.out.println("Passengrs on Board: ");
    if (index != 0) {
      for (int i = 0; i < index; i++) {
        System.out.print(passengers[i]);
      }
      System.out.println();
    }
  }
}
