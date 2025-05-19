package q2;

import javax.xml.namespace.QName;

public class Event {
  private String name;
  public String date;
  public static int events;
  public static String[] names = new String[5];
  public static String[] dates = new String[5];

  public Event(String name, String date) {
    this.name = name;
    this.date = date;
    addEvent();
  }

  public void addEvent() {
    if(events < 5){
      names[events] = name;
      dates[events] = date;
    }
    events++;
  }

  public static void allEventInfo() {
    System.out.println("Total events: " + events);
    for(int i = 0; i < events; i++){
      System.out.println("Event " + (i + 1) + ": ");
      System.out.println("Name: " + names[i]);
      System.out.println("Date: " + dates[i]);
    }
  }

  public String getName(){ return name; }

  public String details() {
    return "Name: " + name + "\nDate: " + date;
  }
}
