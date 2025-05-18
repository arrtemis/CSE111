package task6;

public class Bondhus extends SocialMedia {
  public String[] messages;
  public int msgSent;

  public Bondhus(String name, String email) {
    super(name, email);
    messages = new String[5];
  }

  public void showSentbox() {
    System.out.println(userName + "'s sentbox");
    if(msgSent == 0) {
      System.out.println("No sent messages.");
    }else{
      for (int i = 0; i < msgSent; i++) {
        System.out.println(messages[i]);
      }
      if(msgSent == messages.length - 1) {
        System.out.println("Sentbox is full.");
      }
    }
  }

  public void sendMessage(String msg) {
    if(msgSent < messages.length) {
      messages[msgSent++] = msg;
    }
  }

  @Override
  public String toString() {
    return super.toString() + "\nMessages Sent: " + msgSent;
  }
}
