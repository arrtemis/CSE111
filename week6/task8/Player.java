package week6.task8;

public class Player {
  public static String[] players = new String[11];
  public static int total;

  public String name;
  public String country;
  public int jerseyNo;

  public Player(String name, String country, int jerseyNo){
    this.name = name;
    this.country = country;
    this.jerseyNo = jerseyNo;
    players[total++] = name;
  }

  public static void info(){
    System.out.println("Total number of players: " + total);
    System.out.print("Players enlisted so far: ");
    for (int i = 0; i < players.length; i++) {
      if(players[i+1] != null){
        System.out.print(players[i] + ", ");
      }else{
        System.out.print(players[i]);
        break;
      }
    }
    System.out.println();
  }

  public String player_detail(){
    String res = "Player Name: " + name + "\nJersey Number: " + jerseyNo + "\nCountry: " + country;
    return res;
  }
}
