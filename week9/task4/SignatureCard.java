package week9.task4;

public class SignatureCard extends CreditCard {
  public int companions;
  public SignatureCard(String name, String accNo){
    super(name, accNo, 200);
    companions = 5;
  }
  
  public void spendCash(int cash){
    System.out.println("Previous Reward Points: " + rewardPoints);
    rewardPoints += (4 * cash / 100);
    System.out.printf("Reward points after spending %d taka: %d\n", cash, rewardPoints);
  }

  @Override
  public void cardDetails(){
    super.cardDetails();
    System.out.println("Possible Number of Companions for Lounge: " + companions);
  }
}
