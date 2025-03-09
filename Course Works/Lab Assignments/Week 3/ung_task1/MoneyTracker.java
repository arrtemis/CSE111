public class MoneyTracker {
  public double balance;
  public String name;
  double spent, added;

  public void createTracker(String name) {
    balance = 1.0;
    this.name = name;
  }

  public void income(int amount) {
    added = amount;
    balance += amount;
    System.out.println("Balance updated!");
  }

  public void expense(int amount) {
    if(balance - amount == 0){
      balance -= amount;
      System.out.println("You're broke!");
    }else if(balance - amount < 0){
      System.out.println("Not enough balance.");
    }else{
      spent = amount;
      balance -= amount;
      System.out.println("Balance updated.");
    }
  }

  public void showHistory() {
    System.out.println("Last added: " + added);
    System.out.println("Last spent: " + spent);
  }

  public String info() {
    String res = "Name: " + name + "\nCurrent Balance: " + balance;
    return res;
  }
  
}
