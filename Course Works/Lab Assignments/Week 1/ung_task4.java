import java.util.Scanner;

public class ung_task4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] A = {
      {4, 5, 7},
      {0, 3, -2},
      {4, 1, -4},
      {5, 10, 1}
    };
    System.out.print("k = ");
    int k = sc.nextInt();
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        A[i][j] *= k;
        System.out.print(A[i][j] + " ");
      }
      System.out.println();
    }
  }
}
