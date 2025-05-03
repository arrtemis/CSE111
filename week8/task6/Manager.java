public class Manager extends Employee {
  public double bonus;
  public int increment;
  public double finalSalary;

  public Manager(String name, double baseSalary, int hoursWorked, double bonus){
    super(name, baseSalary, hoursWorked);
    this.bonus = bonus;
  }

  public void requestIncrement(int increment){
    if(getHoursWorked() >= 100){
      setBaseSalary(increment + getBaseSalary());
      System.out.printf("$%d Increment approved\n", increment);
    }
    else if(getHoursWorked() >= 80 && getHoursWorked() < 100){
      setBaseSalary(increment/2 + getBaseSalary());
      System.out.printf("$%d Increment approved\n", increment/2);
    }else{
      System.out.println("Increment denied.");
    }
  }
  
  public void calculateSalary(){
    finalSalary = getBaseSalary() * (1 + bonus/100);
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Bonus: " + bonus + " %");
    System.out.println("Final Salary: $" + finalSalary);
  }
}
