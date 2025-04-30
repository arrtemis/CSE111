public class Manager extends Employee {
  public double bonus;

  public Manager(String name, double baseSalary, int hoursWorked, double bonus){
    super(name, baseSalary, hoursWorked);
    this.bonus = bonus;
  }

  public void requestIncrement(int increment){
    if(getHoursWorked() >= 80 && getHoursWorked() <= 100){
      setBaseSalary(getBaseSalary() + increment/2);
    }else{
      setBaseSalary(getBaseSalary() + increment);
    }
  }

}
