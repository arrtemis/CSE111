public class Triangle {
  public int a, b, c, perimeter;

  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    perimeter = a + b + c;
  }

  public void triangleDetails() {
    System.out.println("Three sides of the triangle are: " + a + ", " + b + ", " + c);
    System.out.println("Perimeter: " + perimeter);
  }

  public String printTriangleType() {
    String res = "This is a ";
    if (a == b && b == c) {
      res += "Equilateral Triangle";
    } else if (a != b && b != c) {
      res += "Scalene Triangle";
    } else {
      res += "Isosceles Triangle";
    }
    return res;
  }

  public void compareTrinagles(Triangle triangle) {
    if(this != triangle){
      if(!compareSides(this, triangle)){
        if(this.perimeter != triangle.perimeter){
          System.out.println("Addresses, length of the sides and perimeter all are different.");
        }else{
          System.out.println("Only the perimeter of both triangles is equal.");
        }
      }else{
        System.out.println("Addresses are different but the sides of the triangles are equal.");
      }
    }else{
      System.out.println("The two triangle objects have the same address");
    }
  }

  public boolean compareSides(Triangle tr1, Triangle tr2){
    return tr1.a == tr2.a && tr1.b == tr2.b && tr1.c == tr2.c;
  }
}
