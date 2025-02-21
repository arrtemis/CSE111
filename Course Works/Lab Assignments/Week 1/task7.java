import java.util.Scanner;

public class task7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int size = sc.nextInt();
    double[] arr = new double[size];
    double[] arr_new = new double[size];
    int removed = 0, index = 0;
    double prev_input = 0;

    System.out.println("Please enter the elements of the array: ");

    for(int i = 0; i < arr.length; i++){
      double current_input = sc.nextDouble();
      arr[i] = current_input;
      if(i==0){
        arr[i] = arr_new[i];
      }else{
        prev_input = arr_new[index-1];
      }

      if(prev_input != current_input){
        arr_new[index] = current_input;
        index++;
      }else{
        removed++;
      }
    }
    System.out.print("New Array: ");
    for (int i = 0; i < arr_new.length - removed; i++) {
      System.out.print(arr_new[i] + " ");
    }
    System.out.println("\nRemoved elements: " + removed);
    sc.close();
  }
}
