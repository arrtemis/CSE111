public class ShoppingCart {
  ShoppingItems[] items = new ShoppingItems[5];
  int index; 
  public void addItems(ShoppingItems item){
    if(index < items.length){
      items[index++] = item;
    }
  }
  public void showCartDetails(){
    int total = 0;
    for (int i = 0; i < index; i++) {
      total += items[i].price;
      items[i].showItemDetails();
      System.out.println("=================");
    }
    System.out.println("Cart total: " + total);
  }
}
