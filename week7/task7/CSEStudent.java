package week7.task7;

public class CSEStudent extends Student {
  public static int students;
  public static String[] labBasedCourses = {"CSE110", "CSE111", "CSE220", "CSE221"};

  public CSEStudent(String name, int id){
    super(name, id);
    students++;
  }
  
  public static void details(){
    System.out.println("Total CSE Students: " + students);
    System.out.println("Available Lab Based Courses: ");
    for (int i = 0; i < labBasedCourses.length; i++) {
      System.out.print(labBasedCourses[i] + " ");
    }
    System.out.println();
  }

  public void addLabBasedCourse(String course) {
    if(findCourse(course)){
      courses += (course + " ");
    }else{
      System.out.println("It is not a lab based course!");
    }
  }

  public boolean findCourse(String course){
    for (int i = 0; i < labBasedCourses.length; i++) {
      if(labBasedCourses[i].equals(course)){
        return true;
      }
    }
    return false;
  }
}
