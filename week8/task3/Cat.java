package week8.task3;

public class Cat extends Animal{
  public Cat(String name, int age, String color){
    super(name, age, color);
  }

  @Override
  public void makeSound(){
    System.out.printf("%s color %s is meowing\n", color, name);
  }
}
