package week6.task7;

public class Student {
  public String name, department;
  public double cgpa;
  public int id;
  public static int totalStudents, cseStudents;

  public Student(String name, double cgpa, String dept){
    this.name = name;
    this.cgpa = cgpa;
    department = dept;
    totalStudents++;
    id = totalStudents;
  }
  public Student(String name, double cgpa){
    this.name = name;
    this.cgpa = cgpa;
    department = "CSE";
    totalStudents++;
    id = totalStudents;
    cseStudents++;
  }

  public static void printDetails(){
    System.out.println("Total Student(s): " + totalStudents);
    System.out.println("CSE Student(s): " + cseStudents);
    System.out.println("Other Department Student(s): " + (totalStudents - cseStudents));
  }

  public void individualDetail(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Department: " + department);
  }

}
