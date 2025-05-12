package task8;

public class Moo extends Blue {
  void method2() {
    super.method3();
    System.out.println("moo 2");
    this.method3();
  } 
  void method3() {
    System.out.println("moo 3");
  }
 }