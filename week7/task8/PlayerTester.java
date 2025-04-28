package week7.task8;

public class PlayerTester {
  public static void main(String[] args) {
    Player playerOne = new Player("Al-Nassr", "Ronaldo", "Striker", 25, 32);
    playerOne.calculateRatio();
    playerOne.printDetails();
    System.out.println("----------------");
    Manager managerOne = new Manager("Real Madrid", "Zidane", "Manager", 25);
    managerOne.printDetails();
  }
}

class SportsPerson {
  private String team;
  private String name;
  public String role;
  public double earningPerMatch;
  
  public SportsPerson(String teamName, String name, String role){
    this.team = teamName;
    this.name = name;
    this.role = role;
    this.earningPerMatch = 0;
  }
  
  public String getNameTeam() {
    return "Name: " + name + ", Team Name: " + team;
  }
}

