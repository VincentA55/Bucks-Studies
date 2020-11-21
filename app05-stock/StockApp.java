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
        printHeading();
        getMenuChoice();
    }

    /**
     * takes the input from the user, puts it into a HashSet then
     * calls the assosiated method bases upon the input
     */
    public void getMenuChoice()
    {
        boolean finished = false;

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
                finished = true;

            }

            else if(input.contains("remove")){
                removeProduct();
            }

            else if (input.contains("print")){
               manager.printAllProductDetails();
            }
            else {

            }
        }
        getMenuChoice();
        
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
     * removes a product from the array list stock
     */
    public void removeProduct()
    {
        System.out.println(" ");
        System.out.println("Please enter the ID number");
        System.out.println("of the product you would like to remove");
        int iD = input.getInt();

        System.out.println("Would you like to remove:");
        System.out.println("----» " + manager.findProduct(iD) + " ?");
        System.out.println("Yes / No");
        String descision = input.getString();

        boolean finished = false;
        while (!finished){
            if (descision.contains("yes")){
                System.out.println(manager.findProduct(iD) + " successfully removed");
                manager.removeProduct(iD);
                finished = true;
            }

            else if (descision.contains("no")){
                System.out.println("Ok then");
                finished = true;
            }

            else {
                System.out.println("Test else output");
                finished = true;
            }

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
        System.out.println("******************************************");
    }
}
