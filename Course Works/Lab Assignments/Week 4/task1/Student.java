public class Student{
  public String name, prog;
  public Student(){
    name = null;
    prog = null;
  }
  public Student(String name, String major){
    this.name = name;
    prog = major;
  }
  public Student(int i) {
    //TODO Auto-generated constructor stub
  }
  public void updateName(String name){
    this.name = name;
  }
  public void updateProgram(String major){
    prog = major;
  }
  public String accessProgram(){
    return prog;
  }
}