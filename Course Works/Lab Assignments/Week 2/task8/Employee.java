package task8;

public class Employee {
  public String name;
  public double salary;
  public String designation;
  String[] rank = {"senior", "lead", "manager"};

  public void newEmployee(String string) {
    name = string;
    salary = 30000.0;
    designation = "junior";
  }

  public void displayInfo() {
    System.out.println("Employer Name: " + name);
    System.out.println("Employer Salary: " + salary + " Tk");
    System.out.println("Employer Designation: " + designation);
  }

  public void calculateTax() {
    double tax = 0;
    if(salary > 50000){
      tax = salary * 0.3;
    }else if(salary > 30000 && salary <= 50000){
      tax = salary * 0.1;
    }
    if(tax != 0){
      System.out.println(name + " Tax Amount: " + tax + " Tk");
    }else{
      System.out.println("No need to pay tax");
    }
  }

  public void promoteEmployee(String string) {
    designation = string;
    int promote = 0;
    for(int i = 0; i < rank.length; i++){
      if(rank[i].equals(string)){
        promote = i;
      }
    }
    if(promote == 0){
      salary += 25000;
    }else if(promote == 1){
      salary += 50000;
    }else if(promote == 2){
      salary += 75000;
    }
    System.out.println(name + " has been promoted to " + designation);
    System.out.println("New Salary: " + salary + " Tk");
  }  
}