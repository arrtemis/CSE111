public class Customer {
  public String name, id, gender;
  public String[] cart = new String[3];
  int index;

  public void createCustomer(String name, String id){
    this.name = name;
    this.id = id;
    System.out.println("Welcome " + name + " !!");
  }
  public void createCustomer(String name, String id, String gender){
    this.gender = gender;
    createCustomer(name, id);
  }
  public void addToCart(String item){
    if(index < cart.length){
      cart[index++] = item;
      System.out.println(item + " added.");
    }else{
      System.out.println("Your cart is full. You can take a maximum of 3 items");
    }
  }
  public void addToCart(String item1, String item2){
    addToCart(item1);
    addToCart(item2);
  }
  public void updateInfo(String gender){
    this.gender = gender;
    System.out.println("Information Updated");
  }
  public void invoice(){
    System.out.println("Name:  " + name + " ID: " + id + " Gender: " + gender);
    System.out.println("Items: ");
    if(index == 0){
      System.out.println("Empty Cart!!");
    }else{
      for (int i = 0; i < index; i++) {
        System.out.println((i+1) + ": " + cart[i]);
      }
    }
  }
}
