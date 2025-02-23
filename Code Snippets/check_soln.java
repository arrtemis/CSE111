public class check_soln{
  public static boolean is_valid(int[][] grid){
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        if(grid[i][j] < 1 || grid[i][j] > 9 || !is_valid(i, j, grid)){
          return false;
        }
      }
    }
    return true;
  }
  public static boolean is_valid(int i, int j, int[][] grid){
    for(int col = 0; col < 9; col++){
      if(col != j && grid[i][col] == grid[i][j]){
        return false;
      }
    }
    for(int row = 0; row < 9; row++){
      if(row != i && grid[row][j] == grid[i][j]){
        return false;
      }
    }
    for(int r = (i/3) * 3; r < ((i/3) * 3) +3; r++){
      for(int c = (j/3) * 3; c < ((j/3) * 3) +3; c++){
        if(!(r == i && c == j) && grid[r][c] == grid[i][j]){
          return false;
        }
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int[][] solution = {
        {9, 6, 3, 1, 7, 4, 2, 5, 8},
        {1, 7, 8, 3, 2, 5, 6, 4, 9},
        {2, 5, 4, 6, 8, 9, 7, 3, 1},
        {8, 2, 1, 4, 3, 7, 5, 9, 6},
        {4, 9, 6, 8, 5, 2, 3, 1, 7},
        {7, 3, 5, 9, 6, 1, 8, 2, 4},
        {5, 8, 9, 7, 1, 3, 4, 6, 2},
        {3, 1, 7, 2, 4, 6, 9, 8, 5},
        {6, 4, 2, 5, 9, 8, 1, 7, 3}
    };
    if(is_valid(solution)){
      System.out.println("valid");
    }else{
      System.out.println("invalid");
    }
  }
}