package task9;

public class Tester {
  public static void main(String[] args) {
    Foo foo1 = new Foo();
    Bar bar1 = new Bar();
    Bux bux1 = new Bux();
    Foo foo2 = new Buzz();
    Bar bar2 = new Buzz();
    Object obj1 = new Foo();
    bar1.call1();
    foo2.call1();
    foo2.call2();
    bar2.call3();
    System.out.println(bar1.name);
    System.out.println(bar2.name);
    System.out.println(((Buzz)bar2).name);
    ((Buzz)bar1).call4();
    ((Bar)foo1).call3();
    ((Foo)bux1).call1();
    ((Bux)foo1).call1();
    bux1.call1();
    bux1.call2();
    ((Foo)foo2).call2();
    ((Buzz)obj1).call3();
    ((Buzz)obj1).call2();
    ((Bux)foo2).call2();
    ((Buzz)obj1).call1();
    System.out.println(foo2.name);
  }

}
