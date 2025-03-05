public class Student {
  public String name = "Not Set", dept = "CSE", scholly_stat = "Not Set";
  public int credits = 9;
  public double cgpa = 0.0;

  public void showDetails(){
    System.out.println("Name: " + name);
    System.out.println("Department: " + dept);
    System.out.println("GPA: " + cgpa);
    System.out.println("Credits: " + credits);
    System.out.println("Scholarship Status: " + scholly_stat);    
  }
  public void updateDetails(String name, double cg, int credits){
    this.name = name;
    cgpa = cg;
    this.credits = credits;
  }
  public void updateDetails(String name, double cg) {
    this.name = name;
    cgpa = cg;
  }
  public void updateDetails(String name, double cg, int credits, String department) {
    this.name = name;
    cgpa = cg;
    this.credits = credits;
    dept = department;
  }
  public void checkScholarshipEligibility(){
    if(cgpa >= 3.5 && credits > 10){
      if(cgpa < 3.7){
        scholly_stat = "Need-based scholarship";
        System.out.println(name + " is eligible for " + scholly_stat);
      }else{
        scholly_stat = "Merit based scholarship";
        System.out.println(name + " is eligible for " + scholly_stat);
      }
    }else{
      scholly_stat = "No scholarship";
      System.out.println(name + " is not elgible for scholarship");
    }
  }
}
