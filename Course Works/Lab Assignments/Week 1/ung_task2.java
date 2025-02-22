import java.util.Scanner;

public class ung_task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0, min = Integer.MAX_VALUE, max_idx = 0, min_idx = 0;
    int[] arr = new int[5];
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
        max_idx = i;
      }
      if(arr[i] < min){
        min = arr[i];
        min_idx = i;
      }
    }
    System.out.println("The largest number " + max + " was found at location " + max_idx);
    System.out.println("The smallest number " + min + " was found at location " + min_idx);
  }
}