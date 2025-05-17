package task5;

public class Phoenix  extends  MagicalCreature {
  public int rebirths;
  public Phoenix(String name, int age, int rebirths) {
    super(name, age);
    this.rebirths = rebirths;
  }

  @Override
  public void makeSound() {
    System.out.println(name + " sings an enchanting song.");
  }

  @Override
  public void performMagic() {
    System.out.println(name + " is reborn with 5 rebirth cycles.");
  }

  public void regenerate() {
    System.out.println(name + " regenerates its body in a burst of flames.");
  }
}
