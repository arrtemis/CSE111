package week7.task4;

public class Dog extends Animal {
  private String name;

  public void updateSound(String sound){
    super.sound = sound;
    System.out.println(super.sound + " " + this.sound);
  }

}
