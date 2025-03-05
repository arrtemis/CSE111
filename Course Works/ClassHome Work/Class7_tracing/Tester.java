public class Tester {
  public static void main(String[] args) {
    TracingProblem t1 = new TracingProblem();
    TracingProblem t2 = new TracingProblem(t1);
    TracingProblem t3 = null;
    t3 = t1;
    t3.methodB(2, 4);
    t2.methodA(3);
  }
}
