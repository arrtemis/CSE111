public class Student {
  public int id;
  public double cgpa;
  public String[] courses = new String[4];
  int index;

  public Student(int id) {
    this.id = id;
    System.out.println("A student with ID: " + id + " has been created.");
  }

  public Student(int id, double cg) {
    this.id = id;
    cgpa = cg;
    System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
  }

  public void addCourse(String course) {
    if(cgpa == 0.0){
      System.out.println("Failed to add " + course + "\nSet CG first");
    }else if(cgpa > 3.0){
      if(index < courses.length){        
        courses[index++] = course;
      }else{
        System.out.println("Failed to add " + course + "\nMaximum 4 courses allowed.");
      }
    }else{
      if(index < courses.length - 1){
        courses[index++] = course;
      }else{
        System.out.println("Failed to add " + course + "\nCG is low. Can't add more than 3 courses.");
      }
    }
  }

  public void addCourse(String[] courseList) {
    for (int i = 0; i < courseList.length; i++) {
      addCourse(courseList[i]);
    }
  }

  public void storeCG(double cg) {
    cgpa = cg;
  }

  public void storeID(int id) {
    this.id = id;
  }

  public void showAdvisee() {
    System.out.println("Student ID: " + id + ", CGPA: " + cgpa);
    if(index != 0){
      System.out.println("Added courses are: ");
      for (int i = 0; i < index; i++) {
        System.out.print(courses[i] + " ");
      }
      System.out.println();
    }else{
      System.out.println("No courses added.");
    }
  }

  public void removeAllCourse(){
    index = 0;
  }
}