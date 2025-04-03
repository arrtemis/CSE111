import java.util.Arrays;

public class sta201 {
  public static void main(String[] args) {
    // int[][] runs = { { 776, 822, 1390, 871, 1519, 1068, 1519, 1068, 1467, 970, 393, 555, 389, 475, 503 },
    //     { 38, 1033, 220, 379, 513, 84, 146, 423, 568, 516, 49, 352, 290, 420, 53 },
    //     { 6, 17, 425, 438, 214, 139, 151, 64, 19, 22, 446, 223, 439, 188, 95 }
    // };
    // int sum = 0;
    // for (int i = 0; i < runs.length; i++) {
    //   for (int j = 0; j < runs[i].length; j++) {
    //     sum += runs[i][j];
    //   }
    //   System.out.println(sum);
    //   sum = 0;
    // }
    int[] a = {45, 52, 48, 41, 56, 46, 44, 42, 48, 53, 51, 53, 51, 48, 46, 43, 52, 50, 54, 47, 44, 47, 50, 49, 52};
    System.out.println(a.length);
    Arrays.sort(a);
    System.out.println(Arrays.toString(a)); 
  }
}
