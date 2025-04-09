public class Adventurer {
  public String name;
  public Quest[] acceptedQuests = new Quest[3];
  public int completed, accepted;
  int count;

  public Adventurer(String name){
    this.name = name;
  }

  public void acceptedQuest(Quest quest){
    if(quest.isAccepted){
      System.out.println(name + " is already on the quest.");
    }else if(quest.isCompleted){
      System.out.println(name + " has already completed the quest.");
    }else if(count < acceptedQuests.length){
      acceptedQuests[count] = quest;
      accepted++;
      count++;
      quest.isAccepted = true;
      System.out.println(name + " has accepted the quest " + quest.showInfo());
    }else{
      System.out.println(name + " has reached the quest limit (3 quests)");
    }
  }
  
  public void completedQuest(Quest quest){
    if(quest.isCompleted){
      System.out.println(name + " already completed the quest.");
    }else if(!quest.isCompleted){
      System.out.println(name + " has completed the quest " + quest.showInfo());
      completed++;
      quest.isCompleted = true;
    }
  }

  public int getAcceptedCount(){
    return accepted;
  }

  public int getCompletedCount(){
    return completed;
  }
}
