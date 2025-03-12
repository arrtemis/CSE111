public class Usis {
  public Student[] advisee = new Student[5];
  public int totalAdvisee;

  public Usis() {
    System.out.println("Usis is ready to use!");
  }

  public void login(Student student) {
    if (student.email == null || student.password == null) {
      System.out.println("Email and password need to be set");
    } else {
      System.out.println("Login successful");
      student.isLoggedIn = true;
    }
  }

  public void advising(Student student) {
    if(student.isLoggedIn){
      System.out.println("You haven't selected any courses.");
    }else{
      System.out.println("Please login to advise courses!");
    }
  }

  public void advising(Student student, String course1, String course2, String course3) {
    if(student.isLoggedIn){
      student.addCourse(course1);
      student.addCourse(course2);
      student.addCourse(course3);
      System.out.println("Advising successful!");
      advisee[totalAdvisee++] = student;
    }else{
      System.out.println("Please login to advise courses!");
    }
  }

  public void advising(Student student, String course1, String course2, String course3, String course4) {
    if(student.isLoggedIn){
      System.out.println("You need special approval to take more than 3 courses.");
    }else{
      System.out.println("Please login to advise courses!");
    }
  }

  public void allAdviseeInfo() {
    System.out.println("Total Advisee: " + totalAdvisee);
    for(int i = 0; i < totalAdvisee; i++){
      advisee[i].displayInfo();
    }
  }
}
