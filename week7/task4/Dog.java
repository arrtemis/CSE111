package week7.task4;

public class Dog extends Animal {
  public String name;

  public Dog(){
    System.out.println("The dog says hello!");
  }

  public void updateSound(String sound){
    this.sound = sound;
    System.out.println(super.sound + " " + this.sound);
  }

  public String getName(){
    return name;
  }
}
