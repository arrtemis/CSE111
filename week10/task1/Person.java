package task1;

public class Person {
  public String name;
  public int age;
  public String occupation;
  public Vaccine vaccineTaken;
  public boolean firstDone, secondDone;

  public Person(String name, int age, String occupation) {
    this.name = name;
    this.age = age;
    this.occupation = occupation;
  }

  public Person(String name, int age) {
    this(name, age, "");
  }
  public void pushVaccine(Vaccine vaccine) {
    if(!occupation.equals("Student") && age < 25) {
      System.out.println("Sorry " + name + ", Minimum age for taking vaccines is 25 years now.");
    }else{
      System.out.println("1st dose done for " + name);
      vaccineTaken = vaccine;
      firstDone = true;
    }
  }
  public void pushVaccine(Vaccine vaccine, String dose) {
    if(!firstDone && dose.equals("1st Dose")) {
      pushVaccine(vaccine);
      return;
    }
    if(vaccine.equals(vaccineTaken) && !secondDone) {
      System.out.println("2nd dose done for " + name);
      secondDone = true;
    }else if(!vaccine.equals(vaccineTaken)) {
      System.out.println("Sorry "+ name + ", you can’t take 2 different vaccines");
    }else if(!firstDone && dose.equals("2nd Dose")) {
      System.out.println("Sorry " + name + ", invalid dose request.");
    }else {
      System.out.println("Sorry " + name + ", you already received both doses.");
    }
  }

  public void showDetail() {
    System.out.println("Name: " + name + " Age: " + age + " Occupation: " + occupation);
    System.out.println("Vaccine name: " + vaccineTaken.getName());
    if(!secondDone) {
      System.out.println("1st dose: Given");
      System.out.println("2nd dose: Please come after " + vaccineTaken.getDelay());
    }else{
      System.out.println("1st dose: Given");
      System.out.println("2nd dose: Given");
    }
  }
}
