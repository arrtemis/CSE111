import java.util.Scanner;

public class task7 {
  public static void input_arr(double[] arr){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextDouble();
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int size = sc.nextInt();
    double[] arr = new double[size];
    int removed = 0;
    int a = 0, b = 1;

    System.out.println("Please enter the elements of the array: ");
    input_arr(arr);

    while(b < arr.length -1){
      if(arr[a] == arr[b]){
        double temp = arr[b];
        arr[b] = arr[b+1];
        arr[b+1] = temp;
        removed++;
      }
      a++;
      b++;
    }
    for (int i = 0; i < arr.length - removed; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\nRemoved elements: " + removed);

  }
}
