package q2;

public class Organizer {
  public String name;
  public Event[] events = new Event[4];
  public int count;

  public Organizer(String name) {
    this.name = name;
  }

  public Organizer() {
    name = "uni";
    System.out.println("Please provide the organizer's name.");
  }

  public void organizeEvent(Event event) {
    if(count < 4){
      events[count++] = event;
      System.out.println(name + " successfully organized " + event.getName());
    }
  }

  public void searchEventByDate(String date) {
    boolean found = false;
    for(int i = 0; i < count; i++){
      if(events[i].date.equals(date)){
        System.out.println(events[i].getName());
        found = true;
        break;
      }
    }
    if(!found){
      System.out.println("No event is scheduled for " + date);
    }
  }
}
