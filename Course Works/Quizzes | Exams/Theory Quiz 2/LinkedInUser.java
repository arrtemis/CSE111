public class LinkedInUser {
  public String username;
  public LinkedInUser[] connections = new LinkedInUser[7];
  int accepted;
  public LinkedInUser[] connected = new LinkedInUser[4];

  public LinkedInUser() {
    username = null;
	}
	public LinkedInUser(String name) {
    username = name;
    System.out.println("A LinkedIn user has been created!");
	}

  public void receiveConnectionRequest(LinkedInUser[] users) {
    int index = 0;
    for (int i = 0; i < 7; i++) {
      connections[index++] = users[i];
      System.out.println(this.username + " has recieved a connection request from " + users[i].username);
    }
    if(index == 7){
      System.out.println("A user can recieve maximum 7 connection requests");
    }
  }

  public void acceptConnectionRequest(LinkedInUser user) {
    boolean hasSent = false;
    for (int i = 0; i < connections.length; i++) {
      if(user == connections[i]){
        hasSent = true;
        break;
      }
    }
    if(hasSent){
      if(accepted < 4){
        connected[accepted++] = user;
        System.out.println(this.username + " has accepted the connection request from " + user.username);
      }else{
        System.out.println("A user can accept maximum 4 connection requests");
      }
    }else{
      System.out.println(this.username + " did not recieve a connection request from " + user.username);
    }
  }

  public void acceptConnectionRequest(LinkedInUser user1, LinkedInUser user2) {
    acceptConnectionRequest(user1);
    acceptConnectionRequest(user2);
  }

  public String connectionDetails() {
    String res = this.username + " connected with the following: \n";
    for (int i = 0; i < connected.length; i++) {
      if(i == connected.length - 1){
        res += connected[i].username;
      }else{
        res += connected[i].username + ", ";
      }
    }
    return res;
  }
  
}
 