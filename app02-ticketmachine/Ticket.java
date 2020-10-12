
/**
 * A Ticket class for desitnations, including the price and date purchased
 *
 * @author Vincent A.
 * @version 11/10/2020
 */
public class Ticket
{
    private String destination;
    
    private int price;
    
    private String date;
    
    
    public Ticket(String destination, int price, String date)
    {
       this.destination = destination;
       this.price = price;
       this.date = date;
    }
    
    public String getDestination()
    {
      return this.destination;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public String date()
    {
       return this.date; 
    }
    
    public String printTicket()
    {
      return (this.destination + ", Price £" + this.price);  
    }
}
