package week7.task9;

class A {
  public int temp = 4;
  public int sum = 1;
  public int y = 2;

  public void methodA(int m, int n) {
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 + n;
    sum = sum + x + y;
    System.out.println(x + " " + y + " " + sum);
  }
}

class B extends A {
  public int x = 6;

  public void methodB(int m, int n) {
    int y = 0;
    y = y + this.y;
    x = this.y + 2 + temp;
    methodA(x, y);
    System.out.printf("%d = %d + %d + %d\n", sum, x, y, super.sum);

    sum = x + y + super.sum;
    System.out.printf("%d = %d + %d + %d\n", sum, x, y, super.sum);
    System.out.println(x + " " + y + " " + sum);
  }
}

public class tester {
  public static void main(String[] args) {
    A a1 = new A();
    a1.methodA(1, 1);
    B b1 = new B();
    b1.methodB(1, 2);

  }
}
