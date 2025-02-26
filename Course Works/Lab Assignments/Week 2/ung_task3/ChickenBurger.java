package ung_task3;

public class ChickenBurger {

  public String bun = "Sesame";
  public int price = 200;
  public String sauceOption = "Less";
  public String spiceLevel = "Not Set";
  String[] spice_levels = new String[] {"Mild", "Spicy", "Naga", "Extreme"};
  public String serveBurger() {
    if(spiceLevel.equals("Not Set")){
      return "Cannot serve now. Customize Spice Level first";
    }
    return "The burger is being served:-\nBun type: " + bun + "\nPrice: " + price + "\nSauce Option: " + sauceOption + "\nSpice Level: " + spiceLevel;
  }
  public void customizeSpiceLevel(String string) {
    boolean valid = false;
    int level = 0;
    for(int i = 0; i < spice_levels.length; i++){
      if(string.equals(spice_levels[i])){
        valid = true;
        level = i;
        break;
      }
    }
    if(valid){
      spiceLevel = spice_levels[level];
      System.out.println("Spice level set to " + spiceLevel);
    }else{
      System.out.println("This spice level is unavailable");
    }
  }

}
