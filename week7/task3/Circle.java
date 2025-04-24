package week7.task3;

public class Circle extends Shape{
  public int radius;

  public void area(){
    System.out.printf("Area of %s %s: %.2f\n", color, name, (Math.PI * radius * radius));
  }
}
