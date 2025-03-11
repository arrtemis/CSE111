public class Teacher {
  public String name, initials;
  public Course[] courses = new Course[3];
  int index;
  public Teacher(){
    name = null;
    initials = null;
  }
  public Teacher(String name, String initials){
    this.name = name;
    this.initials = initials;
    System.out.println("A new teacher has been created");
  }  
  public void addCourse(Course course){
    if(index < courses.length){
      courses[index++] = course;
    }
  }
  public void printDetail(){
    System.out.println("Name: " + name);
    System.out.println("Initial: " + initials);
    System.out.println("List of courses: ");
    for (int i = 0; i < index; i++) {
      System.out.println(courses[i].courseTitle);
    }
  }
}
