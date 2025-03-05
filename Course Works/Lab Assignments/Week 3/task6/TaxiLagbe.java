public class TaxiLagbe {
  public String taxi_no, coverage;
  public int total_passengers, total_fare;
  public String[] passengers = new String[4];


  public void storeInfo(String number, String coverage){
    taxi_no = number;
    this.coverage = coverage;
  }

  public void printDetails() {
    System.out.println("Taxi number: " + taxi_no);
    System.out.println("This taxi can cover " + coverage + " area");
    System.out.println("Total Passenger: " + total_passengers);
    System.out.println("Passenger Lists: ");
    for (int i = 0; i < total_passengers; i++) {
      System.out.print(passengers[i] + " ");
    }
    System.out.println("\nTotal collected fare: " + total_fare + " Taka");
  }

  public void addPassenger(String name, int fare) {
    if(total_passengers >= passengers.length){
      System.out.println("Taxi Full! No more passengers can be added");
    }else{
      passengers[total_passengers++] = name;
      total_fare += fare;
    }
  }

  public void addPassenger(String name1, int fare1, String name2, int fare2) {
    addPassenger(name1, fare1);
    addPassenger(name2, fare2);
  }
  
}
