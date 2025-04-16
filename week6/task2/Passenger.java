package week6.task2;

public class Passenger {
  public static int no_of_passenger;
  public static double total_fare;
  public String name;
  public double fare, baggageWeight;

  public Passenger(String name, double distance){
    this.name = name;
    fare = 20 * distance;
    total_fare += fare;
    no_of_passenger++;
  }

  public void storeBaggageWeight(double weight){
    double new_fare = 10 * weight;
    fare += new_fare;
    total_fare += new_fare;

  }

  public void passengerDetails(){
    System.out.println("Name: " + name);
    System.out.println("Fare: " + fare);
  }
}
