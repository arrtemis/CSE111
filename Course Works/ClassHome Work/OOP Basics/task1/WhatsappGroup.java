public class WhatsappGroup {
  int members = 0;
  public String[] members_list = new String[5];
  public void add_members(String name) {
    if(members < members_list.length){
      members_list[members++] = name;
      System.out.println("A member has been successfully added");
    }else{
      System.out.println("Cannot be added. Sorry");
    }
  }
  public String display(){
    String res = "";
    for(int i = 0; i < members_list.length; i++){
      if(i != 0){
        res += "\n" + members_list[i];
      }else{
        res += members_list[i];
      }
    }
    return res;
  }
  public boolean check(String name){
    for(int i = 0; i < members_list.length; i++){
      if(members_list[i].equals(name)){
        return true;
      }
    }
    return false;
  }
  public void send_message(String name, String message){
    if(check(name)){
      System.out.println(name + " can send a message. He wants to say " + message);
    }else{
      System.out.println(name + " cannot send a message.");
    }
  }
}
