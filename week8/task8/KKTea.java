package week8.task8;

public class KKTea extends Tea {
  public int weight;
  public int teaBags;
  public static int sold;

  public KKTea(int price, int bags){
    super("KK Regular Tea", 250);
    weight = bags * 2;
    teaBags = bags;
  }

  public static void totalSales(){

  }

  public static void updateSoldStatusRegular(KKTea tea){
    sold++;
    tea.status = true;
  }

  @Override
  public void productDetail(){
    super.productDetail();
    System.out.println("Weight: " + weight + ", Tea Bags: " + teaBags);
  }
}
