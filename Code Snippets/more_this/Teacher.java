package more_this;

public class Teacher {
  public String name;
  public String initials;
  public void set_attributes(String name, String initials){
    this.name = name;
    this.initials = initials;
  }
  public String details(){
    String st = "Name of a teacher is: " + name + "\n" + "Initial of a teacher";
    return st;
  }
  public void check(Teacher a){
    System.out.println(a); //memory reference of the object being passed
    System.out.println(this); //memory reference of the object calling this method
    System.out.println(this.name); //name attribute of object calling this method
    System.out.println(a.name); //name attribute of object being passed
  }
}
