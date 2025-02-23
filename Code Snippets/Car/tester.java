package Car;

import java.util.Scanner;

public class tester {
  public static void main(String[] args) {
    design car1 = new design();
    design car2 = new design();
    design car3 = new design();

    Scanner sc = new Scanner(System.in);
    String color, model;
    int car_number;

    System.out.println("enter car 1 details");
    color = sc.nextLine();
    model = sc.nextLine();
    car_number = sc.nextInt();
    car1.update_attributes(color, model, car_number);

    sc.nextLine();

    System.out.println("enter car 2 details");
    color = sc.nextLine();
    model = sc.nextLine();
    car_number = sc.nextInt();
    car2.update_attributes(color, model, car_number);

    sc.nextLine();


    System.out.println("enter car 3 details");
    color = sc.nextLine();
    model = sc.nextLine();
    car_number = sc.nextInt();
    car3.update_attributes(color, model, car_number);

    System.out.println("Entered car details: ");
    System.out.println("car 1: ");
    car1.print_attributes();
    System.out.println("car 2: ");
    car2.print_attributes();
    System.out.println("car 3: ");
    car3.print_attributes();
    sc.close();
  }
}
