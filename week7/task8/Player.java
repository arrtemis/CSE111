package week7.task8;

public class Player extends SportsPerson {
  public int total_goal, total_match;
  public double ratio;

  public Player(String team, String name, String role, int n1, int n2){
    super(team, name, role);
    total_goal = n1;
    total_match = n2;
    earningPerMatch = (total_goal * 1000) + (total_match * 10);
  }

  public void calculateRatio(){
    ratio = (double) total_goal / total_match;
  }

  public void printDetails(){
    System.out.println(getNameTeam());
    System.out.println("Team Role: " + role);
    System.out.println("Total Goal: " + total_goal + ", Total Played: " + total_match);
    System.out.printf("Goal Ratio: %.2f\n", ratio);
    System.out.println("Match Earning: " + (int)earningPerMatch + "K");
  }
}
