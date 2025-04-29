package week7.task8;

public class Manager extends SportsPerson {
  public int match_win;

  public Manager(String team, String name, String role, int num){
    super(team, name, role);
    match_win = num;
    earningPerMatch = match_win * 1000;
  }

  public void printDetails(){
    System.out.println(getNameTeam());
    System.out.println("Team Role: " + role);
    System.out.println("Total Win: " + match_win);
    System.out.println("Match Earning: " + (int)earningPerMatch + "K");
  }
}
