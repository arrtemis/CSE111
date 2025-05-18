package task7;

public class Patient {
  public static int count;
  public String id;
  public String name;
  public String doctor;

  public Patient(String name, String doctor) {
    count++;
    this.name = name;
    this.doctor = doctor;
    id = "PO" + count;
  }

  public static void details() {
    System.out.println("Total patients: " + count);
  }

  public static void details(Patient[] allPatients) {
    System.out.println("Details of " + allPatients.length + " selected patients");
    for (Patient patient : allPatients) {
      System.out.println("== == == == ==");
      System.out.println(patient);
    }
  }

  @Override
  public String toString() {
    return String.format("Patient ID: %s, Name: %s, Doctor: %s", id, name, doctor);
  }
}
