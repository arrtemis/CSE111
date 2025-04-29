package week8.task4;

public class Vehicle2010 extends Vehicle {

  public Vehicle2010(){
    super();
  }

  public void moveLowerLeft(){
    moveLeft();
    moveDown();
  }
  public void moveUpperRight(){
    moveUp();
    moveRight();
  }
  public void moveLowerRight(){
    moveDown();
    moveRight();
  }
}
