import java.util.Scanner;

public class ung_task3 {
  public static void bubble_sort(int[] nums){
    int n = nums.length;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n - 1 -i; j++){
        if(nums[j+1] < nums[j]){
          int temp = nums[j+1];
          nums[j+1] = nums[j];
          nums[j] = temp;
        }
      }
    }
  }
  public static void input_arr(int[] nums){
    int n = nums.length;
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }
  }
  public static void print_arr(int[] nums){
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    input_arr(nums);
    bubble_sort(nums);

    if(n % 2 == 1){
      System.out.println("The median is " + nums[nums.length / 2]);
    }else{
      System.out.println("The medan is " + ((nums[(nums.length - 1) / 2] + nums[(nums.length + 1) / 2]) / 2.0));
    }
  }
}
