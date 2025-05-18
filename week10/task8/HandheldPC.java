package task8;

public class HandheldPC {
  private final String brand;
  private final String model;
  private final String os;
  private final int ram; // in GB
  private final int storage; // in GB

  public HandheldPC(String brand, String model, String os, int ram, int storage) {
    this.brand = brand;
    this.model = model;
    this.os = os;
    this.ram = ram;
    this.storage = storage;
  }

  public String getBrand() { return brand; }
  public String getModel() { return model; }
  public String getOS() { return os; }

  public String toString() {
    return brand + " " + model + " | OS: " + os + " | RAM: " + ram + "GB | Storage: " + storage + "GB";
  }

  public void bootUp() {
    System.out.println(model + " is booting up...");
  }
}
