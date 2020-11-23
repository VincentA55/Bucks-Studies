import java.util.ArrayList;
import java.util.HashSet;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Vincent Assolutissimamente 
 * @version 30.10.2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList< Product > stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        this.stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        int iD = item.getID();
        if(checkProduct(iD) != iD){
            stock.add(item);
        }
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        for (Product product : stock){
            if (id == product.getID()){
                product.increaseQuantity(amount);
            }
        }
    }   

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for (Product product : stock) {
            if (id == product.getID())
            {
                return product;
            }
        }   
        System.out.println("Product with id: " + id + " cannot be found");
        return null;
    }   

    /**
     * returns product whos stock levels are low
     */
    public void lowStock()
    {
        for (Product product : stock){
            if (product.getQuantity() <= 10){
                System.out.println(product.toString());
            }
        }
    }

    /**
     * restocks products up to the minimum of 10 if below
     */
    public void reStock()
    {
        for(Product product : stock){
            int toAdd = (10 - product.getQuantity());
            if (product.getQuantity() < 10){
                delivery(product.getID(), toAdd);
            }
        }
    }

    /**
     * finds a product based on its name
     */
    public String searchName(HashSet<String> search)
    {
        for (Product product : stock){
            if (search.contains(product.getName())){
                return product.toString();
            }
            return "Product not found ";
        }
        return "Product cant be found";
    }

    /**
     * checks to see if an id for a product already exists
     */
    public int checkProduct(int id)
    {
        for (Product product : stock){
            if (id != product.getID()){
                int fID = id+ 1;
                return fID;
            }

            else {
                System.out.println("Error : that ID already exists!");
                int fID = id;
                return fID;
            }
        }
       return id+1;
    }

    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = findProduct(id);
        if(product == null) 
        {
            System.out.println();
        }
        System.out.println(product);
        return product;
    }

    /**
     * removes a product based on ID
     */
    public void removeProduct(int id)
    {
        Product rProduct = findProduct(id);
        String name = rProduct.getName();
        this.stock.remove(findProduct(id));
        System.out.println(name + " has been deleted");
    }

    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id,int amount)
    {
        Product product = findProduct(id);
        if(product != null) 
        {
            product.sell(amount);
        }
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public void numberInStock(int id)
    {
        for (Product product : stock){
            int pID = product.getID();
            if (pID == id){
                System.out.println(product.toString());
                break;
            } 
        }
    }

    /** 
     * renames a product
     */
    public void renameProduct(int id, String newName)
    {
        Product product = findProduct(id);
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                " is not recognised.");
        }
        else if (id == product.getID())
        {
            String oldName = product.getName();
            product.setName(newName);
            System.out.println("Product " + oldName +" was renamed: " + product.getName());
        }
    }

    /**
     * Print details of all the products.
     */
    public void printAllProductDetails()
    {
        System.out.println("Vinnys Stock List");
        System.out.println("=================");
        for (Product product : stock){
            System.out.println(product.toString());
        }
        System.out.println("=================");
    }
}