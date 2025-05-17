package task4;

public class Nokia extends Mobile {
  public double balance;

  public Nokia(String model, boolean status, String imei, double balance){
    super(model, imei, status);
    this.balance = balance;
  }

  public void rechargeSIMCard(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Recharge successful. New balance: " + balance);
    } else {
      System.out.println("Invalid recharge amount.");
    }

  }

	public String dialCall(String number) {
    String countryCode = "";
    for(int i = 0; i < 3; i++){
      countryCode += number.charAt(i);
    }
    String countryName = getCountryName(countryCode);
    if (countryName != null) {
      if (simCardStatus) {
        if (balance > 0) {
          balance -= 1;
          return "Dialing " + number + " from " + model + " in " + countryName;
        } else {
          return "Insufficient balance to make a call.";
        }
      } else {
        return "SIM card is not activated.";
      }
    } else {
      return "Invalid country code.";
    }
	}

  @Override
  public String toString() {
    return super.toString() + "\nBalance: " + balance;
  }
}
