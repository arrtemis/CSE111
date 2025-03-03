package task7;

public class CellPhone {
  public String model;
  public int contacts = 0;
  String[] contacts_list = new String[3];

  public void printDetails() {
    if(model == null || contacts == 0){
      System.out.println("Phone model unknown");
      System.out.println("Contacts Stored " + contacts);
    }else{
      System.out.println("Phone model " + model);
      System.out.println("Contacts Stored " + contacts);
    }
    if(contacts != 0){
      System.out.println("Stored Contacts: ");
      for(int i = 0; i < contacts; i++){
        System.out.println(contacts_list[i]);
      }
    }
  }

  public void storeContact(String contact) {
    if(contacts < 3){
      contacts_list[contacts++] = contact;
      System.out.println("Contact Stored");
    }else{
      System.out.println("Memory full. New contact can't be stored");
    }
  }
}
