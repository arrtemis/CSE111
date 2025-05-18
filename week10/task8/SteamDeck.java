package task8;

public class SteamDeck extends HandheldPC {
  public SteamDeck(String model, int ram, int storage) {
    super("Valve", model, "SteamOS", ram, storage);
  }

  @Override
  public void bootUp() {
    System.out.printf("Steam Deck (%s) is booting into %s...\n", getModel(), getOS());
  }

  public void launchSteamBigPicture(){
    System.out.println(getModel() + " is launching Steam Big Picture Mode.");
  }
}
