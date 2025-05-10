package week9.task8;

public class Tester {
  public static void main(String[] args) {
    Moo var1 = new Crew();
    Blue var2 = new Moo();
    Object var3 = new Sue();
    Sue var4 = new Sue();
    Blue var5 = new Crew();
    Blue var6 = new Blue();
    System.out.println("var1.method1()");
    var1.method1();
    System.out.println("var2.method1()");      
    var2.method1();          
    // var3.method1();   compiler error   
    System.out.println("var4.method1()");
    var4.method1();   
    System.out.println("var5.method1()");   
    var5.method1(); 
    System.out.println("var6.method1()");    
    var6.method1(); 
    System.out.println("var1.method3()");           
    var1.method3();   
    System.out.println("var2.method3()");   
    var2.method3();    
    // var3.method3();      compiler error
    System.out.println("((Blue)var1).method1()");
    ((Blue)var1).method1();
    System.out.println("((Crew)var1).method2()");  
    ((Crew)var1).method2();  
    // ((Sue)var1).method3();    compiler error
    // ((Blue)var3).method1(); runtime error  
    // ((Crew)var3).method1();  runtime error
    System.out.println("((Sue)var3).method3()");
    ((Sue)var3).method3();
    System.out.println("((Moo)var2).method2()");    
    ((Moo)var2).method2();   
    // ((Crew)var3).method2();  runtime error
    System.out.println("((Moo)var5).method2()");
    ((Moo)var5).method2();   
    // ((Moo)var6).method2();   runtime error
    System.out.println("((Moo)var2).method1()");
    ((Moo)var2).method1();
  }
}
