public class Student {
  public String name;
  public int id;
  String[] courses = new String[10];
  int index = 0;

  public Student(String name, int id){
    this.name = name;
    this.id = id;
    System.out.println("Constructor 1 called");
  }
  public Student(String name){
    this.name = name;
    id = -1;
    System.out.println("Constructor 2 called");
  }
  public Student(int id) {
    this.id = id;
    name = null;
    System.out.println("Constructor 3 called");
  }
  public Student(int id, String name){
    this.id = id;
    this.name = name;
    System.out.println("Constructor 4 called");
  }
  public Student(){
    name = null;
    id = -2;
    System.out.println("Constructor 5 called");
  }

  public String print_details(){
    String course_list = "";
    for (int i = 0; i < courses.length; i++) {
      if(courses[i] != null){
        if(i != 0){
          course_list += "\n" + courses[i];
        }else{
          course_list += courses[i];
        }
      }
    }
    return "Name: " + name + "\nID: " + id + "\n" + course_list;
  }
  public void add_course(String course_1){
    if(index < courses.length){
      courses[index++] = course_1;
      System.out.println(course_1 + " added to " + id);
      System.out.println(index);
    }else{
      System.out.println("cannot add");
    }
  }
  public void add_course(String course_1, String course_2){
    add_course(course_1);
    add_course(course_2);
  }
  public void add_course(String course_1, String course_2, String course_3){
    add_course(course_1, course_2);
    add_course(course_3);
  }
  public void add_course(String[] course_list){
    for (int i = 0; i < course_list.length; i++) {
      add_course(course_list[i]);
    }
  }
}
