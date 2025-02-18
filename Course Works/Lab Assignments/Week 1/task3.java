import java.util.Scanner;

public class task3 {
  public static boolean is_letter(char ch){
    return (ch >= 'A' && ch <= 'Z') ||  (ch >= 'a' && ch <= 'z');
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    String res = s1 + " " + s2;
    System.out.println(res);

    int sum = 0;
    for(int i = 0; i < res.length(); i++){
      char current_ch = res.charAt(i);
      if(is_letter(current_ch)){
        sum += (int)current_ch;
      }
    }
    System.out.println(sum);
    sc.close();
  }
}
