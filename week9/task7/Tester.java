public class Tester {
  public static void main(String[] args) {

    Gandalf var1 = new Frodo();
    Gandalf var2 = new Bilbo();
    Gandalf var3 = new Gandalf();
    Object var4 = new Bilbo();
    Bilbo var5 = new Frodo();
    Object var6 = new Gollum();
//    System.out.println("var1.method1();");
    var1.method1();
//    System.out.println("var2.method1();");
    var2.method1();
    System.out.println("compiler error");
    System.out.println("compiler error");
    //var4.method1(); //compile time error
    //var6.method1(); //compile time error
//    System.out.println("var1.method2();");
    var1.method2();
//    System.out.println("var3.method2();");
    var3.method2();
    System.out.println("compiler error");

    //var4.method2(); //compile time error
//    System.out.println("var5.method2();");
    var5.method2();
    System.out.println("compiler error");
    System.out.println("runtime error");
    System.out.println("runtime error");
    System.out.println("runtime error");
    System.out.println("runtime error");

    //var6.method2(); //compile time error
    //((Frodo) var4).method3(); //run time error
    //((Frodo) var6).method2(); //run time error
    //((Gollum) var1).method3(); //run time error
    //((Gollum) var4).method1(); //run time error
//    System.out.println("((Gandalf) var1).method2();");
    ((Gandalf) var1).method2();
    System.out.println("runtime error");
    //((Frodo) var4).method1(); run time error
//    System.out.println("((Gollum) var6).method2();");
    ((Gollum) var6).method2();
//    System.out.println("((Gandalf) var2).method1();");
    ((Gandalf) var2).method1();
    System.out.println("runtime error");
    //((Bilbo) var6).method2(); run time error
//    System.out.println("((Frodo) var1).method3();");
    ((Frodo) var1).method3();
    System.out.println("compiler error");
    //((Gandalf) var5).method3(); //compile time error
  }

}
