import java.util.Scanner;

public class closest_pair {
  public static double distance_Calc(double x_1, double x_2, double y_1, double y_2){
    return Math.sqrt(Math.pow(x_1-x_2, 2)+Math.pow(y_1-y_2, 2));
  }
  public static void input_arr(double[][] arr){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = sc.nextDouble();
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many points? ");
    int points = sc.nextInt();
    double[][] coordinates = new double[points][2];
    input_arr(coordinates);
    int i = 0, idx1 = 0, idx2 = 0;
    double distance = 0.0, min = Integer.MAX_VALUE;
    while(i < coordinates.length){
      double x_1 = coordinates[i][0];
      double y_1 = coordinates[i][1];
      for(int j = i+1; j < coordinates.length; j++){
        double x_2 = coordinates[j][0];
        double y_2 = coordinates[j][1];
        distance = distance_Calc(x_1, x_2, y_1, y_2);
        if(distance < min){
          min = distance;
          idx1 = i;
          idx2 = j;
        }
      }
      i++;
    }
    System.out.println("Closest pair: (" + coordinates[idx1][0] + ", " + coordinates[idx1][1] + ") and (" + coordinates[idx2][0] + ", " + coordinates[idx2][1] + ")");
  }
}
