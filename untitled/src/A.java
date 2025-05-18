public class A{
  public static int temp = 7;
  public int sum = 5, y = 3,  x = 2;
  public A(){
    y = temp - 1;
    sum = temp + 2;
    temp -= 3;
  }
  public void methodA(int m, int [] n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 +  (++n[0]);
    sum = sum + this.x + y;
    temp = n[0] - this.sum + x;
    n[0] = this.sum + 4;
    System.out.println(x + " " + y+ " " +sum);
  }
}
class B extends A {
  public static int x = 1;
  public int sum = 2;
  public B(){
    y = temp + 1 ;
    x = 3 + temp + x;
  }
  public B(B b){
    sum = b.sum + super.sum;
    x = b.x + x;
    b.methodB(x, sum);
  }
  public void methodB(int m, int n){
    int [] y = {0};
    super.y = y[0] + this.y + m;
    x = super.y + 2 + temp - this.sum;
    methodA(x, y);
    sum = x + y[0] + super.sum;
    System.out.println(x + " " + y[0]+ " " +sum);
  }
}