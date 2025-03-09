public class Store {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    ShoppingItems i1 = new ShoppingItems("Carrots", "Veggies", 80);
    ShoppingItems i2 = new ShoppingItems("Chicken", "Poulty", 450);
    cart.addItems(i1);
    cart.addItems(i2);
    cart.showCartDetails();
  }
}
