package task13;

public class Tester {
  public static void main(String[] args) {
    
  Department b1 = new Department();
  Department b2 = new EEEDept();
  Department b3 = new SoftwareDept();
  CSEDept c1 = new SoftwareDept ();
  CSEDept c2 = new CSEDept();
  Object o1 = new EEEDept();
  Department o2 = new RoboticsDept();
 c2.task2();
 b3.task1();
 System.out.println(b3);
 System.out.println("run time error");
// ((CSEDept)b1).task1();
System.out.println("compile time error");
// System.out.println(((Object)b2).chant);
((Department)b2).advising();
System.out.println("run time error");
// ((CSEDept)b2).task2();
((EEEDept)b2).task2();
System.out.println((CSEDept)b3);
System.out.println(((Department)c1).chant);;
((Object)c1).toString();
System.out.println(((Department)c2));
System.out.println(((Department)o1));
System.out.println("=======================");
((EEEDept)o2).advising();
    System.out.println("=======================");
System.out.println("run time error");
// ((SoftwareDept)o2).task1();
  }
}
