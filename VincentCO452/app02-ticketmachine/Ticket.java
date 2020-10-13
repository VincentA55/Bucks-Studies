
/**
 * A Ticket class for desitnations, including the price and date purchased
 *
 * @author Vincent A.
 * @version 11/10/2020
 */
public class Ticket
{
    //The tickets destination
    private String destination;
    //The tickets price
    private int price;
    //The date purchased of the ticket
    private String date;
   
    /**
     * the constructor of the class
     */
    public Ticket(String destination, int price, String date)
    {
       this.destination = destination;
       this.price = price;
       this.date = date;
    }
    
   /**
    * returns the destination of the ticket
    */
    public String getDestination()
    {
      return this.destination;
    }
    
    /**
     * returns the price of the ticket
     */
    public int getPrice()
    {
        return this.price;
    }
    
    /**
     * returns the date purchased of the ticket
     */
    public String date()
    {
       return this.date; 
    }
    
    /**
     * returns the destination and price of a ticket in as a single string
     */
    public String printTicket()
    {
      return (this.destination + ", Price: £" + this.price);  
    }
}
