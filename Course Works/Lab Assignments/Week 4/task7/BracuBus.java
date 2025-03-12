public class BracuBus {
  public String route;
  public BracuStudent[] passengers;
  int index;

  public BracuBus(String route) {
    this.route = route;
    passengers = new BracuStudent[2];
  }

  public BracuBus(String route, int capacity) {
    this.route = route;
    passengers = new BracuStudent[capacity];
  }

  public void board(){
    System.out.println("No passengers");
  }
  public void board(BracuStudent student){
    if(index < passengers.length && student.hasBP && student.livesIn == this.route){
      passengers[index++] = student;
      System.out.println(student.name + " has boarded the bus.");
    }else if(!student.hasBP){
      System.out.println("You don't have a bus pass!");
    }else if(student.livesIn != this.route){
      System.out.println("You got on the wrong bus!");
    }
  }
  public void board(BracuStudent student1, BracuStudent student2){
    board(student1);
    board(student2);
  }
  
  public void showDetails() {
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + index + " (Max: " + passengers.length + ")");
    System.out.println("Passengrs on Board: ");
    if (index != 0) {
      for (int i = 0; i < index; i++) {
        System.out.print(passengers[i].name + " ");
      }
      System.out.println();
    }
  }
}
