import java.util.Arrays;

public class Fruit {
  public String name;
  public int seedlings, fruitPerSeedling;

  public static String[] nameList = new String[3];
  public static int[] seedlingsArr = new int[3];
  public static int[] fruitPerSeedlingCount = new int[3];
  static int index;

  public Fruit(String name, int seedlings){
    this.name = name;
    this.seedlings = seedlings;
    nameList[index] = name;
    seedlingsArr[index++] = seedlings;
    System.out.println("Willing to plant " + name);    
  }

  public int findIndex(String name){
    for (int i = 0; i < index; i++) {
      if(nameList[i].equals(name)){
        return i;
      }
    }
    return - 1;
  }

  public void FruitsPerSeedling(int num){
    if(findIndex(name) != -1){
      fruitPerSeedlingCount[findIndex(name)] = num;
    }
  }

  public void details(){
    System.out.println(seedlings + " " + name + " seedlings have been planted");
  }

  public static void productionDetails(){
    int production = 0;

    System.out.println(Arrays.toString(nameList));
    System.out.println(Arrays.toString(seedlingsArr));
    System.out.println(Arrays.toString(fruitPerSeedlingCount));
    for (int i = 0; i < index; i++) {
      String n = nameList[i];
      int sc = seedlingsArr[i];
      int fps = fruitPerSeedlingCount[i];
      int ans = sc * fps;
      System.out.printf("%d. %s: %d x %d = %d\n", (i+1), n, sc, fps, ans);
      production += ans;
    }
    System.out.println("Total estimated production = " + production);
  }
}
