package task3;

public class CourseTester {
  public static void main(String[] args) {
    CSECourse c1 = new CSECourse();
    c1.courseName = "Programming Language II";
    c1.courseCode = "CSE111";
    c1.credit = 3;
    System.out.println("Course Name: "+c1.courseName);
    System.out.println("Course Code: "+c1.courseCode);
    System.out.println("Credit: "+c1.credit);
  }
}
