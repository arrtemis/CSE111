public class Customer {
  public String name;
  public String[] items = new String[4];
  public int[] prices = new int[4];
  int index;

  public void createCustomer(String customerName){
    name = customerName;
  }

  public void addItem(String item, int price){
    if(index < items.length){
      items[index] = item;
      prices[index++] = price;
      System.out.println(item + " added to cart");
    }else{
      System.out.println("Cart is full");
    }
  }

  public void addItem(String item1, int price1, String item2, int price2){
    if(index < items.length){
      items[index] = item1;
      prices[index++] = price1;
      items[index] = item2;
      prices[index++] = price2;
      System.out.println(item1 + " and " + item2 + " added to cart");
    }else{
      System.out.println("Cart is full");
    }
  }

  public void showCart(){
    System.out.println("Customer: " + name);
    if(index != 0){
      for (int i = 0; i < index; i++) {
        System.out.println("Item: " + items[i] + " Price: " + prices[i]);
      }
    }
  }

  public void calculatePrice(){
    if(index != 0){
      int total = 0;
      for (int i = 0; i < index; i++) {
        total += prices[i];
      }
      System.out.println("Total: " + total);
    }else{
      System.out.println("Cart is empty!");
    }
  }
}
