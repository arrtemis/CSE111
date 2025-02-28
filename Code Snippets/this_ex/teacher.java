package this_ex;

public class teacher {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.set_attributes("Student 1", 3253);
    s2.set_attributes("Student 2", 2002);

    s1.print_details();
    s2.print_details();
  }
}
