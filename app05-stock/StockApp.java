
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
        String choice = getMenuChoice();
        acceptMenuChoice(choice);
    }

    /**
     * 
     */
    public String getMenuChoice()
    {
        boolean finished = false;
        String choice =" ";
        while(!finished)
        {
            printHeading();
            printMenuChoices();

            choice = input.getString();
            finished = true;
        }
        return choice;
    }

    /**
     * accepts the input and directs it to each method
     */
    public void acceptMenuChoice(String choice){
        if (choice.equals("add"))
        {
            addProduct();
        }
    }
    
    /**
     * adds the input as a product
     */
    public void addProduct(){
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        System.out.println("Please enter the ID number");
        int id = input.getInt();
        
        manager.addProduct(new Product(id, name));
        System.out.println("Product :" + id + " " + name + " added");
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
