public class Developer extends Employee {
  public String programmingLang;

  public Developer(String name, double baseSalary, int hoursWorked, String programmingLang){
    super(name, baseSalary, hoursWorked);
    this.programmingLang = programmingLang;
  }
}
