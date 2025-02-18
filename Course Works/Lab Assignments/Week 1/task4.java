import java.util.Scanner;

public class task4 {
  public static boolean is_letter(char ch){
    return ch >= 'a' && ch <= 'z';
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String shifted = "";
    for(int i = 0; i < input.length(); i++){
      char current_ch = input.charAt(i);
      current_ch--;
      if(!is_letter(current_ch)){
        current_ch += 26;
      }
      shifted += current_ch;
    }
    System.out.println(shifted);
    sc.close();
  }
}
