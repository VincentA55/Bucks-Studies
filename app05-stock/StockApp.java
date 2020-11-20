import java.util.HashSet;

/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Vincent Assolutissimamente
 * @version 20/11/2020
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;

    private StockManager manager; 

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
    }

    /**
     * 
     */
    public void run()
    {
        getMenuChoice();
    }

    /**
     * takes the input from the user, puts it into a HashSet then
     * calls the assosiated method bases upon the input
     */
    public void getMenuChoice()
    {
        boolean finished = false;

        printHeading();
        printMenuChoices();

        while(!finished)
        {
            HashSet<String> input = this.input.getInput();  

            if(input.contains("quit")){
                finished = true;
                System.out.println("Bye for now......");
            }
            
            else if (input.contains("add")){
                addProduct();
            }
        }
    }

    /**
     * creates and adds a product from the input
     * 
     */
    public void addProduct()
    {
        System.out.println("Please input the name of the product");
        String name = input.getString();
        
        System.out.println("Please input the ID number");
        int iD = input.getInt();
        
        manager.addProduct(new Product(iD, name));
        System.out.println("Product added: " + manager.findProduct(iD));
        
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
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Student Name");
        System.out.println("******************************");
    }
}
