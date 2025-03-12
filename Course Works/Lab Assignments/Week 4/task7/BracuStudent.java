public class BracuStudent {
  public String name, livesIn;
  public boolean hasBP;
  public BracuStudent(String name, String locality){
    this.name = name;
    livesIn = locality;
  }
  public void showDetails(){
    System.out.println("Student Name: " + name);
    System.out.println("Lives in " + livesIn);
    System.out.println("Have Bus Pass? " + hasBP);
  }
  public void updateHome(String newHome){
    livesIn = newHome;
  }
  public void getPass(){
    
  }
}
