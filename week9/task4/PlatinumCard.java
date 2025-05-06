package week9.task4;

public class PlatinumCard extends CreditCard {
  public PlatinumCard(String name, String accNo){
    super(name, accNo, 100);
  }

  public void spendCash(int cash){
    System.out.println("Previous Reward Points: " + rewardPoints);
    rewardPoints += (2 * cash / 100);
    System.out.printf("Reward points after spending %d taka: %d\n", cash, rewardPoints);
  }
}
