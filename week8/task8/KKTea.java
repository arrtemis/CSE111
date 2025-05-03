package week8.task8;

public class KKTea extends Tea {
  public int weight;
  public int teaBags;
  public static int sold;
  public static int regularTeaSold;

  public KKTea(int price, int bags) {
    super("KK Regular Tea", price);
    weight = bags * 2;
    teaBags = bags;
  }

  public static void totalSales() {
    System.out.println("Total Sales: " + sold);
    System.out.println("KK Regular Tea: " + regularTeaSold);
    if (sold - regularTeaSold > 0) {

      System.out.println("KK Flavoured Tea: " + (sold - regularTeaSold));
    }
  }

  public static void updateSoldStatusRegular(KKTea tea) {
    sold++;
    regularTeaSold++;
    tea.status = true;
  }

  @Override
  public void productDetail() {
    super.productDetail();
    System.out.println("Weight: " + weight + ", Tea Bags: " + teaBags);
  }
}
