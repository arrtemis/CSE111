package week6.task4;

public class Circle {
  private double radius;
  public static int count;

  public Circle(double r){
    radius = r;
    count++;
  }

  public double getRadius(){
    return radius;
  }
  public void setRadius(double r){
    radius = r;
  }
  
  public double area(){
    return Math.PI * radius * radius;
  }
}
