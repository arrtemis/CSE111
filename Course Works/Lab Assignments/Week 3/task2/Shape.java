public class Shape {
  public String type;
  public int a, b;
  public double rect_a, rect_b;
  public void setParameters(String type, int num) {
    this.type = type;
    a = num;
  }
  public void setParameters(String type, int num1, int num2) {
    this.type = type;
    a = num1;
    b = num2;
  }
  public void setParameters(String type, double num1, double num2) {
    this.type = type;
    rect_a = num1;
    rect_b = num2;
  }
  public String details() {
    double area = 0.0;
    if(type.equals("Circle")){
      area = Math.PI * a * a;
    }else if(type.equals("Triangle")){
      area = 0.5 * a * b;
    }else if(type.equals("Rectangle")){
      area = rect_a * rect_b;
    }
    
    String res = "Shape Name: " + type + "\nArea: " + area;
    return res;
  }

}
