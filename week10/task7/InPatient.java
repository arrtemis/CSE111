package task7;

public class InPatient extends Patient {
  public String dept;
  public static int count;
  public InPatient(String name, String doctor, String dept) {
    super(name, doctor);
    this.dept = dept;
    System.out.println("New patient admitted to " + dept);
    InPatient.count++;
  }

  public static void details(){
    Patient.details();
    System.out.println("Admitted In-patients: " + InPatient.count);
    System.out.println("Out-Patients: " + (Patient.count - InPatient.count));
  }

  @Override
  public String toString() {
    return super.toString() + "\nDepartment: " + dept;
  }
}
