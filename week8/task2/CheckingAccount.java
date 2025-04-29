package week8.task2;

public class CheckingAccount extends Account {
  public static int count;

  public CheckingAccount(){
    super();
    count++;
  }

  public CheckingAccount(double balance){
    super(balance);
    count++;
  }
}
