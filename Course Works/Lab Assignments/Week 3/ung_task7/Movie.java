public class Movie {
  public String title, director;
  public String[] actors = new String[3];
  public double rating;
  int index;

  public void setMovieDetails(String title, String director, double rating) {
    this.title = title;
    this.director = director;
    this.rating = rating;
  }

  public void setMovieDetails(String title, String director) {
    this.title = title;
    this.director = director;
  }

  public void updateRating(double rating) {
    this.rating = rating;
    System.out.println("Updated rating of ''" + title + "'' to " + rating);
  }
  public void addActors(String actor){
    if(index < actors.length){
      actors[index++] = actor;
      System.out.println("Added actor ''" + actor + "'' to ''" + title + "''");
    }
  }
  public void addActors(String actor1, String actor2){
    addActors(actor1);
    addActors(actor2);
  }
  public void addActors(String actor1, String actor2, String actor3){
    addActors(actor1, actor2);
    addActors(actor3);
  }
  public void showInfo(){
    System.out.println("Title: " + title);
    System.out.println("Director: " + director);
    System.out.println("Rating: " + rating);
    System.out.print("Actors: ");
    for (int i = 0; i < index; i++) {
      if(i != index - 1){
        System.out.print(actors[i] + ", ");
      } else {
        System.out.println(actors[i]);
      }
    }
  }
}
