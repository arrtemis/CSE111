public class ques23 {
  public static void main(String[] args) {
    int sum = 0;
    int count = 0;
    int store = 0;
    for(int i = 5; i < 534; i += 4){
      sum += i;
      count++;
      store = i;
      System.out.print(i + ", ");
    }
    System.out.println();
    System.out.println(sum + "  " + count + "  " + store);
  }
}
