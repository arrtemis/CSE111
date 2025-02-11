import java.util.*;
public class twod_array {
   public static void input_arr(int[][] arr){
    Scanner sc = new Scanner(System.in);
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
   public static void add_arr(int[][] arr1, int[][] arr2){
    if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){
      int[][] res =  new int[arr1.length][arr1[0].length];
      for(int i = 0; i < arr1.length; i++){
        for(int j = 0; j < arr1[i].length; j++){
          res[i][j] = arr1[i][j] + arr2[i][j];
        }
      }
      print_arr(res);
    }else{
      System.out.println("cannot add");
    }
   }
   public static void mult_arr(int[][] arr1, int[][] arr2){
      if(arr1[0].length == arr2.length){
        int[][] res = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++){
          for(int j = 0; j < arr2[0].length; j++){
            for(int k = 0; k < arr1[0].length; k++){
              res[i][j] += arr1[i][k] * arr2[k][j];
            }
          }
        }
        print_arr(res);
      }else{
        System.out.println("cannot multiply");
      }
   }
   public static void main(String[] args){
    int[][] num1 = {
      {1, 2, 3},
      {4, 5, 6}
    };
    int[][] num2 = {
      {5, 1, 2},
      {4, 3, 5}
    };
    Scanner sc = new Scanner(System.in);
    System.out.println("dimensions: ");
    int row = sc.nextInt(), column = sc.nextInt();

    int[][] num3 = new int[row][column];
    input_arr(num3);
    print_arr(num3);
    add_arr(num2, num3);

    System.out.println("num1: ");
    print_arr(num1);
    System.out.println("num2: ");
    print_arr(num2);
    System.out.println("res: ");
    add_arr(num1, num2);

    System.out.println("matrix multiply: ");
    mult_arr(num2, num3);

    sc.close();
   }
}
