import java.util.Scanner;

public class hw2 {
  public static void input_arr(int[][] arr){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements: ");
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print("(" + i + "," + j + "): ");
        arr[i][j] = sc.nextInt();
      }
    }
  }
  public static void print_arr(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row1, row2, column1, column2;
    System.out.println("Enter dimensions: (first matrix)");
    row1 = sc.nextInt();
    column1 = sc.nextInt();
    System.out.println("Enter dimensions: (second matrix)");
    row2 = sc.nextInt();
    column2 = sc.nextInt();

    int[][] mat_A = new int[row1][column1];
    int[][] mat_B = new int[row2][column2];

    input_arr(mat_A);
    input_arr(mat_B);

    if(column1 == row2){
      int[][] mat_Ans = new int[row1][column2];
      for(int i = 0; i < mat_Ans.length; i++){
        for(int j = 0; j < mat_Ans[0].length; j++){
          for(int k = 0; k < column1; k++){
            mat_Ans[i][j] += mat_A[i][k] * mat_B[k][j];
          }
        }
      }
      print_arr(mat_Ans);
    }else{
      System.out.println("Cannot multiply");
    }
  }
}
