package task10;

public class Tester {
  public static void main(String[] args) {

    Chocolate choco1 = new Chocolate();
    KitKat kit = new KitKat();
    DairyMilk dairyMilk1 = new DairyMilk();
    DairyMilk dairyMilk2 = new SilkOreo();
    Object obj1 = new DairyMilk();
    Object obj2 = new KitKat();
    Chocolate caramel1 = new Caramel();
    choco1.method1();
    dairyMilk1.method1();
    // dairyMilk2.method4();
    caramel1.method1();
    System.out.println(caramel1);
    System.out.println(caramel1.texture);
    ((Chocolate) kit).method2();
    ((SilkOreo) dairyMilk2).method3();
    // ((DairyMilk) kit).method2();
    // ((Chocolate) kit).method3();
    ((Chocolate) dairyMilk2).method1();
    ((Chocolate) obj1).method2();
    // ((Caramel) obj1).method2();
    // ((SilkOreo) obj2).method3();
    System.out.println(((Object) choco1).toString());
    System.out.println(((Chocolate) kit).texture);
  }
}
