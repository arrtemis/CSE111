package week7.task5;

public class Tennis_Tournament extends Tournament {
  public int players;
  public Tennis_Tournament(String name, int players){
    super(name);
    this.players = players;
  }

  public String detail(){
    return "Tenis Tournament Name: " + getName() + "\n" + "Number of Players: " + players;
  }
}
