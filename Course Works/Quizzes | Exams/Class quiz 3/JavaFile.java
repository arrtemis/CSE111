public class JavaFile {
  public static String[] names = new String[5];
  public static int count;
  public int id;
  public String name;
  private String location;

  public JavaFile(String name){
    this.name = name;
    location = "Desktop";
    addFile();
  }
  public JavaFile(String name, String location){
    this(name);
    this.location = location;
  }

  public void addFile(){
    if(count < names.length){
      names[count] = "File " + (++count) + ": " + name;
      id = count;

    }
  }

  public String getFolder(){
    return location;
  }

  public void renameFile(String newName){
    if(newName.equals(name)){
      System.out.println("New name cannot be the same as previous one");
    }else{
      System.out.println("Successfully renamed!");
      name = newName;
      names[id - 1] = "File " + id + ": " + newName;
    }
  }

  public void fileDetails(){
    System.out.printf("File %d: %s\n", id, name);
    System.out.printf("File location: %s\n", location);
  }
}
