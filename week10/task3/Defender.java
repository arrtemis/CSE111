package task3;

public class Defender extends Football {
  public int tackles, interceptions;

  public Defender(String name, int age, int stamina, int tackles, int interceptions) {
    super(name, age, stamina);
    this.tackles = tackles;
    this.interceptions = interceptions;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Tackles: " + tackles);
    System.out.println("Interceptions: " + interceptions);
  }

  @Override
  public void calculatePerformance() {
    System.out.println("Performance: " + (double) interceptions / (double) tackles);
  }
}
