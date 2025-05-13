package task9;

public class Buzz extends Bar {
  String name = "Buzz";
  public void call1() {
    System.out.println("Buzz 1");
  }
  public void call4() {
    call3();
    System.out.println("Buzz 4");
  }
}
