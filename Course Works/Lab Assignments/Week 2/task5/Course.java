package task5;

public class Course {
  public String course_name;
  public String course_code;
  public int course_credit;
  public void updateDetails(String name, String code, int credits){
    course_name = name;
    course_code = code;
    course_credit = credits;
  }
  public void displayCourse(){
    System.out.println("Course Name: " + course_name + "\nCourse Code: " + course_code + "\nCourse Credit: " + course_credit);
  }
}
