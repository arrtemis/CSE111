package week9.task5;

public class Warrior extends Character {
  public Warrior(String name, int level){
    super(name, level);
  }

  @Override
  public void specialMove(){
    System.out.println(name + " performs a heavy sword slash!");
  }
}
