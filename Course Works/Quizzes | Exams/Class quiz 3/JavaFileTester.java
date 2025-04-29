import java.util.Arrays;

public class JavaFileTester {
  public static void main(String[] args) {
    System.out.println("Java Files: " + Arrays.toString(JavaFile.names));
    JavaFile file1 = new JavaFile("CSE111");
    JavaFile file2 = new JavaFile("Assignment 8", "Drive: D");
    file1.fileDetails();
    file2.fileDetails();
    System.out.println("Java Files: " + Arrays.toString(JavaFile.names));
    System.out.println("Location same? true/false: " + file1.getFolder().equals(file2.getFolder()));
    file1.renameFile("CSE111");
    file1.fileDetails();
    file1.renameFile("CSE111 Practice");
    file1.fileDetails();
    System.out.println("Java Files: " + Arrays.toString(JavaFile.names));

  }
}
