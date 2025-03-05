public class Cart {
  public String[] cart = new String[3];
  public double[] prices = new double[3];
  public int cart_id;
  public double discount;
  int items = 0;

  public void create_cart(int n) {
    cart_id = n;
  }

  public void addItem(String item, double price) {
    if(items < cart.length){
      cart[items] = item;
      prices[items++] = price;
      System.out.println(item + " added to cart" + cart_id + ".");
      System.out.println("You have " + items + " item(s) in your cart now");
    }else{
      System.out.println("You already have 3 items in your cart");
    }
  }

  public void addItem(double price, String item) {
    addItem(item, price);
  }

  public void cartDetails() {
    double total_price = 0;
    System.out.println("Your cart(" + cart_id + ") :");
    for (int i = 0; i < items; i++) {
      System.out.println(cart[i] + " - " + prices[i]);
      total_price += prices[i];
    }
    System.out.println("Discount Applied: " + discount);
    System.out.println("Total price: " + total_price * (1 - discount/100.0));

  }

  public void giveDiscount(int discount) {
    this.discount = discount;
  }

}
