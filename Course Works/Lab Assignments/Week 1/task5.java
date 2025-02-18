import java.util.Scanner;

public class task5 {
  public static void input_arr(int[] nums){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
  }
  public static void print_arr(int[] nums){
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  } 
  public static void reverse_arr(int[] nums){
    for(int i = 0; i < nums.length/2; i++){
      int temp = nums[i];
      nums[i] = nums[nums.length - 1 - i];
      nums[nums.length - 1 - i] = temp;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: " );
    int size = sc.nextInt();
    int[] nums = new int[size];
    input_arr(nums);
    reverse_arr(nums);
    print_arr(nums);
    sc.close();
  }
}
