package week6.task6;

public class Cargo {
  public static double cargoCapacity = 10.0;
  public static int count = 0;

  public boolean isLoaded;
  public int id;
  public String contents;
  public double weight;
  
  public Cargo(String contents, double weight){
    count++;
    id = count;
    isLoaded = false;
    this.weight = weight;
    this.contents = contents;
  }

  public static double capacity() {
    return cargoCapacity;
  }

  public void load(){
    if(cargoCapacity - weight > 0){
      isLoaded = true;
      System.out.println("Cargo " + id + " loaded for transport");
      cargoCapacity -= weight;
    }else{
      System.out.println("Cannot load cargo, exceeds weight capacity.");
    }
  }

  public void unload(){
    System.out.println("Cargo " + id + " unloaded");
    cargoCapacity += weight;
    isLoaded = false;
  }

  public void details(){
    System.out.println("Cargo ID: " + id + ", Contents: " + contents + ", Weight: " + weight + ", Loaded: " + isLoaded);
  }
  
}
