package task5;

public class Dragon extends MagicalCreature {
  public int powerlevel;
  public Dragon(String name, int age, int powerlevel) {
    super(name, age);
    this.powerlevel = powerlevel;
  }

  @Override
  public void makeSound() {
    System.out.println(name + " roars with a fiery breath!");
  }

  @Override
  public void performMagic() {
    System.out.printf("%s breathes fire with power level: %d\n", name, powerlevel);
  }

  public void fly() {
    System.out.println(name + " flies through the sky.");
  }
}
