package ung_task2;

public class Bird {
  public String name;

  int movements = 0;
  public void flyUp(int i) {
    System.out.println(name + " has flown up " + i + " feet");
    movements += i;
  }

  public void makeNoise() {
    if(name.equals("Parrot")){
      System.out.println("Squawk");
    }
    if(name.equals("Eagle")){
      System.out.println("Squee");
    }
  }

  public void flyDown(int i) {
    if(movements - i < 0){
      System.out.println(name + " cannot fly down " + i + " feet");
    }else if(movements - i > 0){
      movements -= i;
      System.out.println(name + " has flown down " + i + " feet");
    }else{
      movements -= i;
      System.out.println(name + " has flow down " + i + " feet and landed");
    }
  }

}
