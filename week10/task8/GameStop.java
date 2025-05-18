package task8;

public class GameStop {
  public HandheldPC[] devices;
  int count;

  public GameStop(int size) {
    devices = new HandheldPC[size];
    System.out.printf("GameStop brought %d devices.\n", size);
  }

  public void addDevice(HandheldPC device) {
    if(count < devices.length) {
      if(device instanceof SteamDeck || device instanceof ROGAlly) {
        devices[count++] = device;
        System.out.printf("%s %s added to shelf\n", device.getBrand(), device.getModel());
      }else{
        System.out.println("Invalid device type. Only SteamDeck and ROGAlly are allowed.");
      }
    }else{
      System.out.println("No more space on shelf for new devices.");
    }
  }
  public void filterByOS(String OS) {
    System.out.println("Devices running " + OS + ":");
    for (HandheldPC device : devices) {
      if (device.getOS().equals(OS)) {
        System.out.println("- " + device);
      }
    }
  }

  public void startGamingSession(HandheldPC device) {
    device.bootUp();
    if(device instanceof SteamDeck) {
      ((SteamDeck) device).launchSteamBigPicture();
    }else if(device instanceof ROGAlly) {
      ((ROGAlly) device).syncRGBWithGame();
    }
  }

  public void listDevices() {
    System.out.println("Total devices: " + devices.length);
    countDevices();
    System.out.println("Devices in store: ");
    for (HandheldPC device : devices) {
      System.out.println("- " + device);
    }
  }

  public void countDevices() {
    int n1 = 0, n2 = 0;
    for (HandheldPC device : devices) {
      if (device.getBrand().equals("Valve")) {
        n1++;
      } else if (device.getBrand().equals("ASUS")) {
        n2++;
      }
    }
    System.out.println("Steam Decks: " + n1);
    System.out.println("ROG Allies: " + n2);
  }
}
