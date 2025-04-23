public class FruitTester {
  public static void main(String[] args) {
    Fruit mango = new Fruit("Mango", 23);
    Fruit apple = new Fruit("Apple", 35);
    mango.FruitsPerSeedling(35);
    apple.FruitsPerSeedling(32);
    mango.details();
    apple.details();
    Fruit lemon = new Fruit("Lemon", 40);
    lemon.FruitsPerSeedling(25);
    lemon.details();
    Fruit.productionDetails();

  }
}
