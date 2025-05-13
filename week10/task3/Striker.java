package task3;

public class Striker extends Football{
  public int goals, shots;

  public Striker(String name, int age, int stamina, int goals, int shots) {
    super(name, age, stamina);
    this.goals = goals;
    this.shots = shots;
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Goals: " + goals);
    System.out.println("Shots on target: " + shots);
  }

  @Override
  public void calculatePerformance(){
    System.out.println("Performance: " + (double) goals / (double) shots);
  }
}
