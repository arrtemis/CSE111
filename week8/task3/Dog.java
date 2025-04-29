package week8.task3;

public class Dog extends Animal{
  public Dog(String name, int age, String color){
    super(name, age, color);
  } 

  @Override
  public void makeSound(){
    System.out.printf("%s color %s is barking", color, name);
  }
}
