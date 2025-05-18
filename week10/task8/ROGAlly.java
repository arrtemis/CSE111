package task8;

public class ROGAlly extends HandheldPC {
  public String rgb;

  public ROGAlly(String model, int ram, int storage, boolean rgb) {
    super("ASUS", model, "Windows 11", ram, storage);
    if(rgb){
      this.rgb = "RGB ON";
    }else{
      this.rgb = "RGB OFF";
    }
  }

  @Override
  public void bootUp() {
    System.out.printf("ROG Ally (%s) booting into %s with %s\n", getModel(), getOS(), rgb);
  }

  public void syncRGBWithGame(){
    if(rgb.equals("RGB ON")){
      System.out.println(getModel() + "  syncing RGB lights with gameplay...");
    }else{
      System.out.println(getModel() + " has RGB disabled.");
    }
  }
}
