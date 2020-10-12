/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Vincent Assolutissimamente
 */

import java.util.ArrayList;


public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private static final Ticket aylesburyTicket = new Ticket("Aylesbury", 220, "21st October");
    
    private static final Ticket amershamTicket = new Ticket("Amersham", 300, "12th October");
    
    private static final Ticket highWycombeTicket = new Ticket("High Wycombe", 330, "10th October");
    
   
    private ArrayList<Ticket> availableTickets;
    
    private Ticket selectedTicket;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        price = 0;
        balance = 0;
        total = 0;
        availableTickets = new ArrayList<Ticket>();
        this.availableTickets.add(aylesburyTicket);
        this.availableTickets.add(amershamTicket);
        this.availableTickets.add(highWycombeTicket);
        printAvailableTickets();
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
       return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    public void selectTicket(String destination)
    {
        if (destination == "aylesbury")
        {
            this.selectedTicket = this.aylesburyTicket;
            setPrice();
            printSelectedTicket();
        }
        else if (destination == "amersham")
        {
            this.selectedTicket = this.amershamTicket;
            setPrice();
            printSelectedTicket();
        }
        else if (destination == "high wycombe")
        {
            this.selectedTicket = this.highWycombeTicket;
            setPrice();
            printSelectedTicket();
        }
        else 
        {
            System.out.println("Please type your destination again");
        }
    }
    
    
    
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount == 10 || amount == 20 || 
            amount == 100 || amount == 200)
        {
            balance = balance + amount;
            printTicket();
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(this.balance >= this.price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
            
            refundBalance();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    public void printAvailableTickets()
    {
        for(Ticket ticket : availableTickets)
        {
            System.out.println(ticket.printTicket());    
        }
    }
    
    
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    private void printSelectedTicket()
    {
        System.out.println("Selected Ticket: " + this.selectedTicket.printTicket());
        System.out.println("Please insert coins to purchase this ticket!");
    }
    
    private void setPrice()
    {
        if(this.selectedTicket != null)
        {
            this.price = this.selectedTicket.getPrice();
        }
    }
    
    
    
    
}

