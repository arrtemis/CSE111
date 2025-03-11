public class Shape2D {
  public int a, b, c;
  public String type;

  public Shape2D() {
    a = 5;
    type = "Square";
    System.out.println("A " + type + " has been created with length: " + a);
  }

  public Shape2D(int length, int breadth) {
    a = length;
    b = breadth;
    type = "Rectangle";
    System.out.println("A " + type + " has been created with length: " + a + " and breadth: " + b);
  }

  public Shape2D(int base, int height, String type) {
    a = base;
    b = height;
    c = 0;
    this.type = type;
    System.out.println("A " + this.type + " has been created with height: " + a + " and breadth: " + b);
  }

  public Shape2D(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    type = "Triangle";
    System.out.println("A " + type + " has been created with the following sides: " + a + ", " + b + ", " + c);
  }

  public void area() {
    double area = 0.0;
    switch (type) {
      case "Square":
        area = a * a;
        break;
      case "Rectangle":
        area = a * b;
        break;
      case "Triangle":
        if (c == 0) {
          area = 0.5 * a * b;
        } else {
          double s = (a + b + c) / 2;
          area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        break;
      default:
        break;
    }
    System.out.printf("The area of the %s is: %.2f%n", type, area);
  }
}
