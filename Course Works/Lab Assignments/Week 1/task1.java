import java.util.Scanner;
public class task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputs = 10, sum = 0, num, max = 0, min = Integer.MAX_VALUE, count = 0;
    while(inputs > 0){
      num = sc.nextInt();
      if(num % 2 == 1 && num > 0){
        sum += num;
        if(num > max){
          max = num;
        }
        if(num < min){
          min = num;
        }
        count++;
      }
      
      inputs--;
    }

    if(count != 0){
      double average = sum / (double)count;
      System.out.println("Sum = " + sum);
      System.out.println("Minimum = " + min);
      System.out.println("Maximum = " + max);
      System.out.println("Average = " + average);
    }else{
      System.out.println("No odd positive numbers found");
    }

    sc.close();
  }
}