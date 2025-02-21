import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, 0},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;

    //find player position
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        if(arr2D[i][j] == 7){
          row_pos = i;
          col_pos = j;
        }
      }
    }    
    int turns = 5;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      int future_tile = 0;

      if(inp.equals("UP")){
        if(row_pos - 1 < 0){
          System.out.println("game over");
          break;
        }
        future_tile = arr2D[row_pos - 1][col_pos];
        if(future_tile == -1){
          System.out.println("game over");
          break;
        }else if(future_tile == 10){
          System.out.println("game win");
          break;
        }else if(future_tile == 0){
          arr2D[row_pos][col_pos] = 0;
          arr2D[--row_pos][col_pos] = 7;
        }
      }else if(inp.equals("DOWN")){
        if(row_pos + 1 >= row){
          System.out.println("game over");
          break;
        }
        future_tile = arr2D[row_pos + 1][col_pos];
        if(future_tile == 10){
          System.out.println("game win");
          break;
        }else if(future_tile == -1){
          System.out.println("game over");
          break;
        }else if(future_tile == 0){
          arr2D[row_pos][col_pos] = 0;
          arr2D[++row_pos][col_pos] = 7;
        }
      }else if(inp.equals("LEFT")){
        if(col_pos - 1 < 0){
        System.out.println("game over");
        break;
      }
        future_tile = arr2D[row_pos][col_pos - 1];
        if(future_tile == 10){
          System.out.println("game won");
          break;
        }else if(future_tile == -1){
          System.out.println("game over");
          break;
        }else if(future_tile == 0){
          arr2D[row_pos][col_pos] = 0;
          arr2D[row_pos][--col_pos] = 7;
        }
      }else if(inp.equals("RIGHT")){
        if(col_pos + 1 >= col){
          System.out.println("game over");
          break;
        }
        future_tile = arr2D[row_pos][col_pos + 1];
        if(future_tile == 10){
          System.out.println("game won");
          break;
        }else if(future_tile == -1){
          System.out.println("game over");
          break;
        }else if(future_tile == 0){
          arr2D[row_pos][col_pos] = 0;
          arr2D[row_pos][++col_pos] = 7;
        }
      }else{
        System.out.println("Invalid movment");
      }
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
    sc.close();
  }
  
  public static void printMap(int[][] arr) { 
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}