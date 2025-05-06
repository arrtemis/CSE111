package week9.task3;

public class CSEStudent extends Student {
  public String msg = "I want to transfer to CSE";
  
  @Override
  public String shout(){
    return msg;
  }
}
