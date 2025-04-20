public class ques26 {
  public static void main(String[] args) {
    int sum = 0;
    for(double i = 1; i <= Math.pow(3, 20); i *= 3){
      sum += i;
    }
    System.out.println(5 * sum);
  }
}
