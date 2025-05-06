package week9.task6;

public class Bike extends Vehicle {
  public String model;
  public boolean sideCar;

  public Bike(String brand, String model, int year, int wheels, boolean sideCar){
    super(brand, year);
    setWheels(wheels);
    this.sideCar = sideCar;
    this.model = model;
  }

  public void doAWheelie(){
    if(sideCar){
      System.out.printf("Wheelie Failed. %s:%s has SideCar\n", getBrand(), model);
    }else{
      System.out.printf("%s:%s is doing Wheelie!!\n", getBrand(), model);
    }
  }

  @Override
  public String toString(){
    String extras = ", Model: " + model + ", SideCar: " + sideCar;
    return "Bike " + super.toString() + extras;
  }
}
