
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Vincent Assolutissimamente
 * @version 14/11/2020
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;
    
    //the stock manager 
    private StockManager manager;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        this.manager = new StockManager();
    }

    /**
     * 
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }
    
    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getInput();
            finished = true;
        }
    }
    
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("*****************************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Vincent Assolutissimamente");
        System.out.println("*****************************************");
    }
}
