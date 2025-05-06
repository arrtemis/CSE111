package week9.task6;

public class Garage {
  Bike[] bikes;
  Car[] cars;

  int carCount, bikeCount;

  public Garage(int carCap, int bikeCap) {
    cars = new Car[carCap];
    bikes = new Bike[bikeCap];
    printDetail();
  }

  public void printDetail() {
    System.out.println("Welcome to the Garage!");
    System.out.println("Car Capacity: " + cars.length);
    System.out.println("Bike Capacity: " + bikes.length);
  }

  public void addVehicle(Vehicle vehicle) {
    if (vehicle instanceof Car) {
      Car car = (Car) vehicle;
      if (carCount < cars.length) {
        System.out.println("A " + car.getBrand() + " CAR has been added to the Garage");
        cars[carCount++] = car;
      }else{
        System.out.println("Can't add more Cars! Capacity: " + cars.length);
      }
    } else if (vehicle instanceof Bike) {
      Bike bike = (Bike) vehicle;
      if(bikeCount < bikes.length){
        System.out.println("A " + bike.getBrand() + " BIKE has been added to the garage");
        bikes[bikeCount++] = bike;
      }else{
        System.out.println("Can't add more bikes! Capacity: " + bikes.length);
      }
    }
  }
}
