import java.util.Scanner;

public class task6 {
  public static void input_arr(int[] nums){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int size = sc.nextInt();
    int[] nums = new int[size];
    input_arr(nums);

    for (int i = 0; i < nums.length; i++) {
      int occurance = 0;
      boolean found = false;
      for(int j = i - 1; j >= 0; j--){
        if(nums[i] == nums[j]){
          found = true;
          break;
        }
      }

      if(!found){
        for(int j = i; j < nums.length; j++){
          if(nums[i] == nums[j]){
            occurance++;
          }
        }
        System.out.println(nums[i] + " - " + occurance + " times");
      }
    }
    sc.close();
  }
}