import java.util.Scanner;

public class task2 {
  public static int div_count(int num){
    int divisors = 0;
    for(int i = 1; i <= num; i++){
      if(num % i == 0){
        divisors++;
      }
    }
    return divisors;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int prime_count = 0;
    
    if(start > end){
      int temp = start;
      start = end;
      end = temp;
    }

    for(int i = start; i <= end; i++){
      if(div_count(i) == 2){
        prime_count++;
      }
    }
    System.out.println("There are " + prime_count + " prime numbers between " + start + " and " + end);

    sc.close();
  }
}