public class Quest {
  public String questID, questName;
  public boolean isAccepted, isCompleted;
  
  public Quest(String qID, String qName){
    questID = qID;
    questName = qName;
  }
  public String showInfo(){
    return questID + ": " + questName;
  }
}
