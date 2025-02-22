import java.util.Scanner;

public class ung_task1 {
  public static void input_arr(int[] arr){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
  }
  public static void print_arr(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    input_arr(arr);
    System.out.println("Input array: ");
    print_arr(arr);
    System.out.print("\nRemove element = ");
    int remove = sc.nextInt();
    int count = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == remove){
        count++;
      }
    }
    if(count != 0){ 
      int[] removed_arr = new int[size - count];
      int idx = 0;
      for(int i = 0; i < size; i++){
        if(arr[i] != remove){
          removed_arr[idx++] = arr[i];
        }
      }
      System.out.println("New array: ");
      for(int i = 0; i < removed_arr.length; i++){
        System.out.print(removed_arr[i] + " ");
      }
      System.out.println();
    }else{
      System.out.println("Element not found");
    }
  }
}