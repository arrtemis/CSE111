package week8.task7;

public class CinemexTicket extends MovieTicket {
  private static int totalTickets;
  public String genre;
  public String ticketID;
  public boolean isPaid;

  public CinemexTicket(String movie, String time, String genre, String date){
    super(movie, date, time, seatPrices[findSeatPriceIdx("Regular")]);
    seat = seatTypes[0];
    this.genre = genre;
    totalTickets++;
    ticketID = movie + "-" + seat.charAt(0) + "-" + totalTickets;
  }

  public CinemexTicket(String movie, String time, String genre, String date, String seatType){
    super(movie, date, time, seatPrices[findSeatPriceIdx(seatType)]);
    seat = seatTypes[findSeatPriceIdx(seatType)];
    this.genre = genre;
    totalTickets++;
    ticketID = movie + "-" + seat.charAt(0) + "-" + totalTickets;
  }

  public void calculateTicketPrice(){
    System.out.println("Ticket price is calculated successfully.");
    if(getTime() >= 1800 && getTime() <= 2300){
      setPrice(getPrice() * (1 + (double)nightShowCharge / 100));
    }
  }

  public int getTime(){
    String[] times = showtime.split(":");
    return (Integer.parseInt(times[0]) * 100 + Integer.parseInt(times[1]));
  }

  public static int findSeatPriceIdx(String type){
    for (int i = 0; i < seatPrices.length; i++) {
      if(seatTypes[i].equals(type)){
        return i;
      }
    }
    return -1;
  }

  public static int getTotalTickets(){
    return totalTickets;
  }

  public String confirmPayment() {
    if(!isPaid){
      isPaid = true;
      return "Payment successful.";
    }
    return "Ticket price is already paid!";
  } 
  
  @Override
  public String toString(){
    String info = "Ticket ID: " + ticketID + "\n" + super.toString() + "\nGenre: " + genre + "\nSeat Type: " + seat + "\nPrice(tk): " + getPrice() + "\nStatus: " + paidStatus(isPaid);
    return info; 
  }

  public String paidStatus(boolean paid){
    if(paid){
      return "Paid";
    }
    return "Not Paid";
  }
}
