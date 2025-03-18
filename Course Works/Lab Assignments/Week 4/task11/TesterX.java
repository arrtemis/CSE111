public class TesterX {
  public static void main(String[] args) {
    TracingX t1 = new TracingX();
    t1.y = t1.x = 5;
    TracingX t2 = new TracingX();
    t2.x = t1.metA(2);
    t2.y = t2.metA(4);
    System.out.println(t1.y +t1.x +" "+t2.x +" "+t2.y);
  }
 }
 