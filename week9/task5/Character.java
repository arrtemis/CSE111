package week9.task5;

public class Character {
  public String name;
  public int level;
  
  public Character(String name, int level) {
    this.name = name;
    this.level = level;
  }
  
  public void specialMove() {
    System.out.println("Character uses a generic move.");
  }
  
  // Override the .equals() method
  @Override
  public boolean equals(Object character){
    Character chara = (Character) character;
    if(this.name.equals(chara.name) && this.level == chara.level){
      return true;
    }

    return false;
  }
}
