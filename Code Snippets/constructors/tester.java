public class tester {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Bob");
    Student s3 = new Student(1234);
    Student s4 = new Student("Alice", 6789);
    Student s5 = new Student(1023, "Carol");

    String[] courses_to_add = {"CSE220", "CSE221", "CSE320"};
    s1.add_course("CSE110");
    s2.add_course("MAT110", "MAT120");
    s3.add_course("CSE111", "CSE230", "CSE220"); 
    s4.add_course(courses_to_add);; 
    s5.add_course("CSE110", "BUS102");

    System.out.println(s1.print_details());
    System.out.println(s2.print_details());
    System.out.println(s3.print_details());
    System.out.println(s4.print_details());
    System.out.println(s5.print_details());
  }
}
