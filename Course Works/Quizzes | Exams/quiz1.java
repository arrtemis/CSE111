import java.util.Arrays;
import java.util.Scanner;

public class quiz1{
  public static void input_arr(int[][] arr){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = sc.nextInt();
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("row = ");
    int row = sc.nextInt();
    System.out.print("column = ");
    int col = sc.nextInt();
    int[][] nums = new int[row][col];
    input_arr(nums);
    System.out.println("2D array: ");
    System.out.println(Arrays.deepToString(nums));
    for(int i = 0; i < row; i++){
      int min = Integer.MAX_VALUE;
      for(int j = 0; j < col; j++){
        if(nums[i][j] < min){
          min = nums[i][j];
        }
      }
      System.out.println("Minimum in row " + i + ": " + min);
    }
    sc.close();
  }
}
