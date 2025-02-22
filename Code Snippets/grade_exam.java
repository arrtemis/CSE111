import java.util.Scanner;

public class grade_exam {
  public static void input_arr(String[][] arr){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextLine();
      }
    }
  }
  public static void main(String[] args) {
    char[][] answers = {
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
    };
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    int highest = 0, highest_idx = 0;
    for(int i = 0; i < answers.length; i++){
      int correct = 0;
      for(int j = 0; j < answers[i].length; j++){
        if(answers[i][j] == keys[j]){
          correct++;
        } 
      }
      if(correct > highest){
        highest = correct;
        highest_idx = i+1;
      }
      System.out.println("Student " + (i+1) + " got " + correct + "/10");
    }
    System.out.println("Student " + highest_idx + " got the highest");
  }
}
