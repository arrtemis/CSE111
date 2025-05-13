package task2;

public class NikeBD {
  public String name;
  public int[] stock;
  public int sold;

  public static int branches;
  public static String[] products = {"Jordan", "Cortez", "Kobe"};
  public static int[] overallStock = new int[3];
  public static int overallSold;


  public NikeBD(String name){
    this.name = name;
    stock = new int[products.length];
    branches++;
  }

  public void details(){
    System.out.println("Nike " + name + " outlet");
    System.out.println("Products Currently Stocked: ");
    for (int i = 0; i < products.length; i++) {
      if(i == 2){
        System.out.printf("%s: %d\n", products[i], stock[i]);
      }else{
        System.out.printf("%s: %d, ", products[i], stock[i]);
      } 
    }
    System.out.println("Sold: " + sold);
  }

  public void restockProducts(String product, int qty){
    int i = findProduct(product);
    if(i >= 0){
      stock[i] += qty;
      overallStock[i] += qty; 
    }else{
      System.out.println("Product is not available");
    }
  }

  public void restockProducts(String[] products, int[] qtys){
    for (int i = 0; i < products.length; i++) {
      restockProducts(products[i], qtys[i]);
    }
  }
  
  public void productSold(String product, int qty){
    int i = findProduct(product);
    if(i >= 0){
      stock[i] -= qty;
      overallStock[i] -= qty;
      sold += qty;
      overallSold += qty;
    }
  }

  public void productSold(String product1, int qty1, String product2, int qty2){
    productSold(product1, qty1);
    productSold(product2, qty2);
  }

  public static void status(){
    System.out.println("Nike Bangladesh Status: ");
    System.out.println("Branches Opened: " + branches);
    System.out.println("Currently Stocked: ");
    for (int i = 0; i < products.length; i++) {
      if(i == 2){
        System.out.println(products[i] + ": " + overallStock[i]);

      }else{
        System.out.print(products[i] + ": " + overallStock[i] + ", ");
      } 
    }
    System.out.println("Sold: " + overallSold);
  }
  
  public int findProduct(String product){
    for (int i = 0; i < products.length; i++) {
      if(products[i].equals(product)){
        return i;
      }
    }

    return -1;
  }
}