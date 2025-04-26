import java.util.Scanner;

public class SquaredDifferences {
    public static double[] calculateSquaredDifferences(double[][] matrix) {
        int rows = matrix.length;
        double[] result = new double[rows];
        
        for (int i = 0; i < rows; i++) {
            double diff = matrix[i][0] - matrix[i][1];
            result[i] = diff * diff;
        }
        
        return result;
    }
    
    public static double[] calculateSquaredDifferencesFromValue(double[][] matrix, double value) {
        int rows = matrix.length;
        double[] result = new double[rows];
        
        for (int i = 0; i < rows; i++) {
            double diff = matrix[i][0] - value;
            result[i] = diff * diff;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // Create matrix with your specific values
        double[][] matrix = {
            {170.0, 142.06},
            {120.0, 139.76},
            {125.0, 135.16},
            {148.0, 135.16},
            {140.0, 132.86},
            {106.0, 128.26},
            {120.0, 125.96},
            {108.0, 123.66},
            {124.0, 119.06},
            {134.0, 116.76},
            {116.0, 114.46},
            {114.0, 112.16}
        };
        
        Scanner scanner = new Scanner(System.in);
        
        // Get the specific number to compare with first column
        System.out.print("Enter a number to compare with first column elements: ");
        double compareValue = scanner.nextDouble();
        
        // Calculate squared differences between columns
        double[] squaredDiffs = calculateSquaredDifferences(matrix);
        
        // Calculate squared differences between first column and specific value
        double[] squaredDiffsFromValue = calculateSquaredDifferencesFromValue(matrix, compareValue);
        
        // Print the results
        System.out.println("\nSquared differences between columns:");
        for (int i = 0; i < squaredDiffs.length; i++) {
            System.out.println("Row " + (i+1) + ": " + squaredDiffs[i]);
        }

        double sum = 0;
        
        System.out.println("\nSquared differences between first column and " + compareValue + ":");
        for (int i = 0; i < squaredDiffsFromValue.length; i++) {
            System.out.printf("Row %d: %.2f\n", (i+1), squaredDiffsFromValue[i]);
            sum += squaredDiffsFromValue[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}