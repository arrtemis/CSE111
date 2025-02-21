public class task9 {
  public static boolean is_identity(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(i == j){
          if(matrix[i][j] != 1){
            return false;
          }
        }else if(matrix[i][j] != 0){
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int[][] A = {
      {1, 0, 0, 1},
      {0, 1, 0, 0},
      {1, 0, 1, 0},
      {0, 1, 0, 1}
    };
    int[][] B = {
      {1, 0, 0},
      {0, 1, 0},
      {0, 0, 1},
    };
    
    if(is_identity(A)){
      System.out.println("Identity Matrix");
    }else{
      System.out.println("Not an Identity Matrix");
    }
    if(is_identity(B)){
      System.out.println("Identity Matrix");
    }else{
      System.out.println("Not an Identity Matrix");
    }
  }
}
