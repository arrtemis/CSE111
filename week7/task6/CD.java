package week7.task6;

public class CD extends Product {
  public String band, genre;
  public int duration;

  public CD(int id, String title, int price, String band, int duration, String genre) {
    super(id, title, price);
    this.band = band;
    this.duration = duration;
    this.genre = genre;
  }

  public String printDetail(){
    return getIdTitlePrice() + " Band: " + band + " Duration: " + duration + " minutes " + " Genre: " + genre;
  }
}
