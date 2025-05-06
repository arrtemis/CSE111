package week9.task2;

public class Jackfruit extends Fruit {
  public Jackfruit() {
    super(false, "Jackfruit");
  }

  @Override
  public String toString() {
    if (hasFormalin()) {
      return getName() + "s are bad for you";
    }
    return getName() + "s are good for you";
  }
}
