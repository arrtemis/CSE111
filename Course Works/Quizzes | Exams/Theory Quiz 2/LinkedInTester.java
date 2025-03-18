public class LinkedInTester {
  public static void main(String[] args) {
    LinkedInUser l1 = new LinkedInUser("Iron man");
    LinkedInUser l2 = new LinkedInUser("Spider man");
    LinkedInUser l3 = new LinkedInUser("Deadpool");
    LinkedInUser l4 = new LinkedInUser("Wolverine");
    LinkedInUser l5 = new LinkedInUser("Thor");
    LinkedInUser l6 = new LinkedInUser("Ant man");
    LinkedInUser l7 = new LinkedInUser("Captain America");
    LinkedInUser l8 = new LinkedInUser("Ultron");
    LinkedInUser l9 = new LinkedInUser("Loki");
    LinkedInUser l10 = new LinkedInUser("Dr. Strange");

    System.out.println("1=========================");
    LinkedInUser userList[] = { l2, l3, l4, l5, l6, l7, l8, l9, l10 };
    l1.receiveConnectionRequest(userList);

    System.out.println("2=========================");
    l1.acceptConnectionRequest(l3);

    System.out.println("3=========================");
    l1.acceptConnectionRequest(l9);

    System.out.println("4=========================");
    l1.acceptConnectionRequest(l4, l10);

    System.out.println("5=========================");
    l1.acceptConnectionRequest(l8, l2);

    System.out.println("6=========================");
    l1.acceptConnectionRequest(l5);

    System.out.println("7=========================");
    System.out.println(l1.connectionDetails());
  }
}