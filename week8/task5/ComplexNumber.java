package week8.task5;

public class ComplexNumber extends RealNumber {
  public double imaginaryValue;

  public ComplexNumber() {
    super(1.0);
    imaginaryValue = 1.0;
  }

  public ComplexNumber(double n1, double n2) {
    super(n1);
    imaginaryValue = n2;
  }

  @Override
  public String toString(){
    return super.toString() + "\nImaginary Part: " + imaginaryValue;
  }

}
