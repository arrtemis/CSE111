package week8.task8;

public class KKFlavouredTea extends KKTea {
  public KKFlavouredTea(String flavour, int price, int bags){
    super(price, bags);
    name = "KK " + flavour + " Tea";
  }

  public static void updateSoldStatusFlavoured(KKFlavouredTea tea){
    tea.sold++;
    
  }
}
