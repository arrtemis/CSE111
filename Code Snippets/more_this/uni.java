package more_this;

public class uni {
  public static void main(String[] args) {
    Teacher t1 = new Teacher();
    Teacher t2 = new Teacher();

    System.out.println(t1);
    System.out.println(t2);
    t1.set_attributes("X", "XYZ");
    t2.set_attributes("Y", "YXZ");
    t1.check(t2);

  }
}
