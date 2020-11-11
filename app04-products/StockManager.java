import java.util.ArrayList;
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
    private ArrayList<Product> stock;

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
        stock.add(item);
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
     * removes a product based on ID
     */
    public void removeProduct(int id)
    {
        Product rProduct = findProduct(id);
        this.stock.remove(rProduct);
        System.out.println("Product has been deleted");
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
            }
            else {
                System.out.println("ID not found");
            }  
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