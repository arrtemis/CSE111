public class Student {
  public String name, dept, email, password;
  public int id;
  public String[] courses = new String[3];
  public boolean isLoggedIn;
  int index;

  public Student() {
    name = null;
    dept = null;
    email = null;
    password = null;
    id = 0;
    isLoggedIn = false;
  }

  public Student(String name, int id, String dept) {
    this.name = name;
    this.id = id;
    this.dept = dept;
    System.out.println("Student object is created");
  }
  public void addCourse(String course){
    if(index < courses.length){
      courses[index++] = course;
    }
  }
  public void displayInfo(){
    System.out.println("Name: " + name + " ID: " + id);
    System.out.println("Department: " + dept);
    System.out.println("Advised Courses: ");
    for (int i = 0; i < index; i++) {
      System.out.print(courses[i] + " ");
      if(i == index - 1){
        System.out.println();
      }
    }
    System.out.println("==============");
  }
}
