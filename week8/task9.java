package week8;

public class task9 {
  public static void main(String[] args) {
    A a1 = new A();
    B b1 = new B();
    B b2 = new B(b1);
    a1.methodA(1, 1);
    b1.methodA(1, 2);
    b2.methodB(3, 2);

  }
}
class A{
  public int temp = 4;
  public int sum = 1;
  public int y = 2;
  public A(){
    y = temp - 2;
    sum = temp + 3;
    temp-=2;
  }
  public void methodA(int m, int n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 + n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum); 
  }
}
class B extends A {
  public int x;
  public B(){
    y = temp + 3 ;
    sum = 3 + temp + 2;
    temp-=1;
  } 
  public B(B b){
    sum = b.sum;
    x = b.x;
  }
  public void methodB(int m, int n){    
   int  y =0;
   y = y + this.y;
   x = this.y + 2 + temp;
   methodA(x, y);
   sum = x + y + super.sum;
   System.out.println(x + " " + y+ " " + sum);
  }
}


