package task9;

public class Foo {
  String name = "foo";
  public void call1() {
    System.out.println("Foo 1");
  }
  public void call2() {
    call1();
    System.out.println("Foo 2");
  }
}

