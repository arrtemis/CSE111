package task1;

public class UniversityTester {
  public static void main(String[] args) {
    University uni1 = new University();
    University uni2 = new University();

    System.out.println("Uni_1 location: " + uni1);
    System.out.println("Uni_2 location: " + uni2);

    uni1.name = "Imperial College London";
    uni1.country = "England";
    uni2.name = "Brac University";
    uni2.country = "Bangladesh";

    System.out.println();
    System.out.println("Uni_1 name: " + uni1.name);
    System.out.println("Uni_1 country: " + uni1.country);
    System.out.println("Uni_2 name: " + uni2.name);
    System.out.println("Uni_2 country: " + uni2.country);
  }
}