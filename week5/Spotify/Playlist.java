package week5.Spotify;

import java.util.LinkedList;

public class Playlist {
  public String name;
  public Song start;

  //-----------------------------------------task2 start------------------------
  public Playlist(String playlistName){
    name = playlistName;
    System.out.println(name + " created");
  }
  //-----------------------------------------task2 end--------------------------

  //-----------------------------------------task3 start------------------------
  public void info(){
    System.out.println(name + " has the following songs: ");
    Song currentSong = start;
    int songCount = 1;

    if(currentSong == null){
      System.out.println("No songs in " + name);
      return;
    }

    while(currentSong != null){
      System.out.println("Song-" + songCount);
      currentSong.songInfo();
      currentSong = currentSong.next;
      songCount++;
    }
  }
  //-----------------------------------------task3 end--------------------------

  //-----------------------------------------task4 start------------------------
  public void addSong(Song song){
    if(start == null){
      start = song;
      System.out.println(song.name + " added to " + name);
      return;
    }
    Song currentSong = start;
    while (currentSong.next != null) {
      currentSong = currentSong.next;
    }
    currentSong.next = song;
    System.out.println(song.name + " added to " + name);
  }
  //-----------------------------------------task4 end--------------------------

  //-----------------------------------------task5 start------------------------
  public void addSong(Song song, int index){
    Song currentSong = start;
    if(index == 0){
      song.next = start;
      start = song;
      System.out.println(song.name + " added to " + name);
    }else{
      for(int i = 0; i < index - 1; i++){
        if (currentSong.next != null) {
          currentSong = currentSong.next;
        }else{
          System.out.println("Cannot add to Index " + index + ".");
          return;
        } 
      }
      System.out.println(song.name + " added to " + name);
      song.next = currentSong.next;
      currentSong.next = song;
    }
  }
  //-----------------------------------------task5 end--------------------------

  //-----------------------------------------task6 start------------------------
  public void playSong(String songName){
    Song currentSong = start;
    while (currentSong.next != null) {
      if(currentSong.name.equals(songName)){
        System.out.println("Playing " + songName + " by " + currentSong.artist);
        break;
      }
      currentSong = currentSong.next;
    }
    if(currentSong.next == null){
      System.out.println(songName + " not found in " + name);
    }
  }
  //-----------------------------------------task6 end--------------------------
  
  //-----------------------------------------task7 start------------------------
  public void playSong(int index){
    Song currentSong = start;
    for(int i = 0; i < index; i++){
      if(currentSong == null){
        System.out.println("Song at Index " + index + " not found in " + name);
        return;
      }
      currentSong = currentSong.next;
    }
    System.out.println("Playing " + currentSong.name + " by " + currentSong.artist);
  }
  //-----------------------------------------task7 end--------------------------

  //-----------------------------------------task8 start------------------------
  public void deleteSong(String songName){
    Song currentSong = start;
    if(currentSong.name.equals(songName)){
      System.out.println(currentSong.name + " deleted from " + name);
      start = currentSong.next;
      return;
    }
    boolean found = false;
    while (currentSong.next != null) {
      if(currentSong.next.name.equals(songName)){
        System.out.println(currentSong.next.name + " deleted from " + name);
        currentSong.next = currentSong.next.next;
        found = true;
        break;
      }
      currentSong = currentSong.next;
    }
    if(!found){
      System.out.println(songName + " not found in " + name);
    }
  }
  //-----------------------------------------task8 end--------------------------

  //-----------------------------------------task9 start------------------------
  public int totalSong(){
    int count = 0;
    Song currentSong = start;
    while(currentSong.next != null){
      count++;
      currentSong = currentSong.next;
    }
    count++;
    return count;
  }
  //-----------------------------------------task9 end--------------------------

  //----------------------------------------task10 start------------------------
  public void merge(Playlist playlistName){
    Song currentSong = this.start;
    while(currentSong.next != null){
      currentSong = currentSong.next;
    }
    if(currentSong.next == null){
      currentSong.next = playlistName.start;
    }
    currentSong = playlistName.start;
    while(currentSong.next != null){
      LinkedList ls = new LinkedList<>();
      ls.add(currentSong);
      ls.
    }
  }
}
