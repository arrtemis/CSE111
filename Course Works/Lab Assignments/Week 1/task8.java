import java.util.Scanner;

public class task8 {
  public static void input_arr(int[][] arr){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = sc.nextInt();
      }
    }
  }
  public static void print_arr(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("row = ");
    int row = sc.nextInt();
    System.out.print("column = ");
    int column = sc.nextInt();
    int[][] arr = new int[row][column];
    input_arr(arr);
    System.out.println("2D Array: ");
    print_arr(arr);

    int[] flattened = new int[row*column];
    int i = 0, j = 0, idx = 0;
    while(i < row && j < column){
      flattened[idx++] = arr[i][j++];
      if(j >= column){
        j = 0;
        i++;
      }
    }
    System.out.println("1D Array: ");
    for (int k = 0; k < flattened.length; k++) {
      System.out.print(flattened[k] + " ");
    }
    System.out.println();
    sc.close();
  }
}
