public class Customer {
  public String name;
  public double balance;

  public void displayInfo(){
    System.out.println("Customer Name: " + name);
    System.out.println("Balance: " + balance);
  }
  public void initialInfo(String name, double balance){
    this.name = name;
    this.balance = balance;
  }
  public void deposit(double amount){
    balance += amount;
  }
  public void withdraw(double amount){
    balance -= amount;
  }
  public double checkBalance(){
    if(balance <= 50000){
      System.out.println(name + " is a Silver user");
    }else if(balance > 50000 && balance < 500000){
      System.out.println(name + " is a Gold user");
    }else{
      System.out.println(name + " is a Premium user");
    }
    return balance;
  }
}
