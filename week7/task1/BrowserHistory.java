public class BrowserHistory{
  public int count;
  public String[] websVisited;
  int index;

  public BrowserHistory(int size){
    websVisited = new String[size];
  }

  public void showHistory(){
    for (int i = 0; i < websVisited.length; i++) {
      System.out.println("Visited: " + websVisited[i]);
    }
  }
  public void currentWeb(){

  }

  public void visitWeb(String web){
    
  }

}
