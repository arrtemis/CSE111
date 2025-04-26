package week7.task5;

public class Cricket_Tournament extends Tournament{
  public int teams;
  public String type;
  public Cricket_Tournament(){
    super();
    teams = 0;
    type = "No type";
  }

  public Cricket_Tournament(String name, int teams, String type) {
    super(name);
    this.teams = teams;
    this.type = type;
  }

  public String detail(){
    return "Cricket Tournament Name: " + getName() + "\n" + "Number of Teams: " + teams + "\n" + "Type: " + type;
  }
}
