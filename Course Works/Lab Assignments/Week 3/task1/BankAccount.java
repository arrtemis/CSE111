public class BankAccount {
  public String ac_type = "Not Set";
  public int ac_number = 0;

  public void setInfo(int num, String type){
    ac_type = type;
    ac_number = num;
    if(!ac_type.equals("Not Set") || ac_number != 0){
      System.out.println("Account information updated!");
    }
  }
  public String printDetails(){
    String res = "Account No: " + ac_number + "\nType: " + ac_type;
    return res;
  }
}
