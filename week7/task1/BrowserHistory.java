public class BrowserHistory {
  public int count;
  public String[] websVisited;
  int index;

  public BrowserHistory(int size) {
    websVisited = new String[size];
  }

  public void showHistory() {
    if (count != 0) {
      System.out.println("Browser History: ");
      for (int i = 0; i < websVisited.length; i++) {
        System.out.println(websVisited[i]);
      }
    } else {
      System.out.println("No web pages visited yet.");
    }
  }

  public void currentWeb() {
    if (count != 0) {
      System.out.println("Current web page: " + websVisited[count - 1]);
    } else {
      System.out.println("You have not visited any website yet!");
    }
  }

  public void back() {
    count--;
  }

  public void visitWeb(String web) {
    if (index < websVisited.length) {
      System.out.println("Visited: " + web);
      websVisited[index++] = web;
      count++;
      System.out.println(count);
    } else {
      System.out.println("History is full. Cannot visit www.reddit.com web page.");
    }
  }

}