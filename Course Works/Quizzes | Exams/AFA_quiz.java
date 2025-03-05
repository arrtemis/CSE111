public class AFA_quiz {
  public static void main(String[] args) {
    //find the column with the largest sum and print the elements in that column
    int[][] matA = {
      {4, 5},
      {2, 2},
      {1, 5},
    };
    int max_sum = 0, idx = 0;
    for (int i = 0; i < matA[i].length; i++) {
      int sum = 0;
      for (int j = 0; j < matA.length; j++) {
        sum += matA[j][i];
      }
      if(sum > max_sum){
        max_sum = sum;
        idx = i;
      }
    }
    for(int i = 0; i < matA.length; i++){
      System.out.print(matA[i][idx] + " ");
    }
  }
}
