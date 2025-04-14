package week5.Spotify;

public class Song {
  public String name, artist;
  public Song next;
  public int duration;

  //-----------------------------------------task1 start------------------------
  public Song(String name, String artist, int duration){
    this.name = name;
    this.artist = artist;
    this.duration = duration;
  }

  public void songInfo(){
    System.out.println("Title: " + name + ", Artist: " + artist + "\nLength: " + duration + " minutes");
  }
  //-----------------------------------------task1 end---------------------------
}
