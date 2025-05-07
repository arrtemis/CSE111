package week9.task8;

public class Tester {
  public static void main(String[] args) {
    Moo var1 = new Crew();
    Blue var2 = new Moo();
    Object var3 = new Sue();
    Sue var4 = new Sue();
    Blue var5 = new Crew();
    Blue var6 = new Blue();
    var1.method1();      
    var2.method1();          
    // var3.method1();   compiler error   
    var4.method1();      
    var5.method1();      
    var6.method1();            
    var1.method3();      
    var2.method3();    
    // var3.method3();      compiler error
    ((Blue)var1).method1();   
    ((Crew)var1).method2();  
    // ((Sue)var1).method3();    compiler error
    // ((Blue)var3).method1(); runtime error  
    // ((Crew)var3).method1();  runtime error
    ((Sue)var3).method3();    
    ((Moo)var2).method2();   
    // ((Crew)var3).method2();  runtime error
    ((Moo)var5).method2();   
    // ((Moo)var6).method2();   runtime error
    ((Moo)var2).method1();
  }
}
