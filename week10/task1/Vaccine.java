package task1;

public class Vaccine {
  private String name, country;
  private int delay;

  public Vaccine(String name, String country, int delay) {
    this.name = name;
    this.country = country;
    this.delay = delay;
  }

  public String getName() {
    return name;
  }
  public String getCountry() {
    return country;
  }
  public int getDelay() {
    return delay;
  }
}
