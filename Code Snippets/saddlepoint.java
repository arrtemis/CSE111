import java.util.Arrays;
import java.util.Scanner;

public class saddlepoint {
  public static void input_arr(int[][] arr) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements: ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print("(" + i + "," + j + "): ");
        arr[i][j] = sc.nextInt();
      }
    }
  }

  public static void print_arr(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row, column;
    System.out.println("Enter dimensions: ");
    row = sc.nextInt();
    column = sc.nextInt();
    int[][] mat = new int[row][column];
    input_arr(mat);
    print_arr(mat);
    for(int i = 0; i < column; i++){
      int min = Integer.MAX_VALUE, min_idx = 0;
      for(int j = 0; j < row; j++){
        if(mat[i][j] < min){
          min = mat[i][j];
          min_idx = j;
        }
      }
      int max = 0, max_idx = 0;
      for(int j = 0; j < row; j++){
        if(mat[j][min_idx] > max){
          max = mat[j][min_idx];
          max_idx = j;
        }
      }
      if(min == max){
        System.out.println("Saddle point at " + max_idx + ", " + min_idx + ": " + min);
      }
    }
  }
}