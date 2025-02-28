package this_ex;

public class Student {
  public String name;
  public int id;
  public void set_attributes(String name, int id){
    this.name = name;
    this.id = id;
  }
  public void print_details(){
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
  }
}
