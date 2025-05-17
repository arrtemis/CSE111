public class prob22 {
  public static void main(String[] args) {
    int a = 0;
    for(int i = 1; i < 1000; i++){
      if(i % 7 > 0 && i % 11 > 0){
        a++;
      }
    }
    System.out.println(a);
  }
}
