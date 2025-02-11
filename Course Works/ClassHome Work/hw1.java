import java.util.Scanner;

public class hw1{
  public static void input_arr(int[] arr){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements");
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size: ");
    int size = sc.nextInt();
    int[] marks = new int[size];
    input_arr(marks);

    System.out.print("Enter value of k: ");
    int k = sc.nextInt();
    int start = 0, end = start + k;
    double max_avg = 0.0, current_avg;
    while (end != size) {
      int sum = 0;
      for(int i = start; i < end; i++){
        System.out.print(marks[i] + " ");
        sum += marks[i];
      }
      current_avg = sum / k;
      if(current_avg > max_avg) max_avg = current_avg;
      start++;
      end++;
    }
    System.out.println("Max Avg: " + max_avg);
    sc.close();
  }
}
