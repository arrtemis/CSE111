public class Calculator {
  public void add(int a, int b){
    System.out.println(a + b);
  }
  public void add(int a, int b, int c){
    System.out.println(a + b + c);
  }
  public void multiply(int a, int b){
    System.out.println(a * b);
  }
  public void multiply(int a, int b, int c){
    System.out.println(a * b * c);
  }
  public void multiply(String word, int times){
    String res = "";
    for (int i = 0; i < times; i++) {
      if(i != times - 1){
        res += word + "-";
      }else{
        res += word;
      }
    }
    System.out.println(res);
  }
}
