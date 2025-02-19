import java.util.Scanner;

public class task7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int size = sc.nextInt();
    double[] arr = new double[size];
    int removed = 0, index = 0;
    double prev_input = 0;

    System.out.println("Please enter the elements of the array: ");

    for(int i = 0; i < arr.length; i++){
      double current_input = sc.nextDouble();
      if(i > 0){
        prev_input = arr[index-1];
      }
      if(prev_input != current_input){
        arr[index] = current_input;
        index++;
      }else{
        removed++;
      }
    }
    
    for (int i = 0; i < arr.length - removed; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\nRemoved elements: " + removed);

  }
}
