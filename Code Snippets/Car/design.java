package Car;

public class design {
  public String color;
  public String model;
  public int car_number;
  public void update_attributes(String c, String m, int n){
    color = c;
    model = m;
    car_number= n;
  }
  public void print_attributes(){
    System.out.println("Car color: " + color);
    System.out.println("Car model: " + model);
    System.out.println("Car number: " + car_number);
  }  
}
