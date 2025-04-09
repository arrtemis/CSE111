public class DragonSlayersGuild{
  public static void main(String[] args) {
    Quest slayDragon = new Quest("Q001", "Slay the Red Dragon");
    Quest gatherScales = new Quest("Q002", "Gather the Dragon Scales");
    Quest craftArmor = new Quest("Q003", "Craft the Dragon Armor");
    Adventurer kirito = new Adventurer("Kirito");
    Adventurer asuna = new Adventurer("Asuna");
    asuna.acceptedQuest(new Quest("Q005", "Retrieve the crest of Yggdrasil"));
    kirito.acceptedQuest(slayDragon);
    kirito.acceptedQuest(craftArmor);
    kirito.acceptedQuest(slayDragon);
    kirito.acceptedQuest(craftArmor);
    kirito.completedQuest(craftArmor);
    System.out.println(kirito.name + "' Total\n" + "Completed Quest: " + kirito.getCompletedCount() + "\nAccepted Quest: " + Adventurer.getAcceptedCount());
  }
}