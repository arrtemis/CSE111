package ung_task4;

public class MobilePhone {
  public int[] numbers;
  public String[] names;
  public int contacts = 0;

  public void setContactCapacity(int capacity){
    numbers = new int[capacity];
    names = new String[capacity];
  }
  
  public void details(){
    System.out.println("Total Contacts: " + contacts);
    System.out.println("Contact List: ");
    if(contacts > 0){
      for (int i = 0; i < contacts; i++) {
        System.out.println(names[i] + ":" + numbers[i]);
      }
    }
  }
  public void addContact(String name, int number){
    if(contacts < numbers.length){
      names[contacts] = name;
      numbers[contacts] = number;
      System.out.println("The contact of " + name + " is added.");
      contacts++;
    }else{
      System.out.println("Storage Full!");
    }
  }

	public void makeCall(int number) {
    boolean saved = false;
    int saved_idx = 0;
    for (int i = 0; i < names.length; i++) {
      if(number == numbers[i]){
        saved = true;
        saved_idx = i;
        break;
      }
    }
    if(saved){
      System.out.println("Calling " + names[saved_idx] + " . . .");
    }else{
      System.out.println("Calling " + number + " . . .");
    }
	}
}
