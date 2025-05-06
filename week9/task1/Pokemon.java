package week9.task1;

//1.a.
public class Pokemon {
  public String name;

  public Pokemon(String name){
    this.name = name;
  }

  public void attack(){
    System.out.println("Pikachu attacks with a basic move!");
  }

  public void attack(String attack){
    System.out.printf("Pikachu uses %s!\n", attack);
  }

  public void attack(String attack, int power){
    System.out.printf("Pikachu uses %s with power %d!\n", attack, power);
  }

//1.b. Compile Time Polymorphism

}
