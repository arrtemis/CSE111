public class Developer extends Employee {
  public String programmingLang;
  public double finalSalary;

  public Developer(String name, double baseSalary, int hoursWorked, String programmingLang){
    super(name, baseSalary, hoursWorked);
    this.programmingLang = programmingLang;
  }

  public void calculateSalary(){
    if(programmingLang.equals("Java")){
      finalSalary = getBaseSalary() + 700;
    }else{
      finalSalary = getBaseSalary();
    }
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: " + programmingLang);
    System.out.println("Final Salary: $" + finalSalary);
  }
}
