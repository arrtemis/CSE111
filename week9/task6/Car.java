package week9.task6;

public class Car extends Vehicle {
  public String model;
  public int doors;
  public boolean ai;

  public Car(String brand, String model, int year, int doors, int wheels, boolean ai){
    super(brand, year);
    setWheels(wheels);
    this.model = model;
    this.doors = doors;
    this.ai = ai;
  }
  
  public void startAutoPilot(){
    if(ai){
      System.out.printf("%s:%s AutoPilot Started\n", getBrand(), model);
    }else{
      System.out.printf("%s:%s has NO AutoPilot\n", getBrand(), model);
    }
  }

  @Override
  public String toString(){
    String extras = ", Model: " + model + ", Doors: " + doors + ", AI: " + ai;
    return "Car " + super.toString() + extras;
  }
}
