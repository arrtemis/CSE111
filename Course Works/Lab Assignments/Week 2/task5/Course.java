package task5;

public class Course {
  public String name;
  public String code;
  public int credit;
  public void updateDetails(String c_name, String c_code, int cred){
    name = c_name;
    code = c_code;
    credit = cred;
  }
  public void displayCourse(){
    System.out.println("Course Name: " + name + "\nCourse Code: " + code + "\nCourse Credit: " + credit);
  }
}
