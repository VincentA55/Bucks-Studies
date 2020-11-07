/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Vincent Assolutissimamente.
 * @version 30.10.2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     * I have hard coded them in to save myslef time while testing
     */
    public StockDemo()
    {
        manager = new StockManager();
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
        manager.addProduct(new Product(1, "Hat"));
        manager.addProduct(new Product(55, "Sock"));
        manager.addProduct(new Product(111, "Electric ruler"));
        manager.addProduct(new Product(97, "Pet Rock"));
        manager.addProduct(new Product(48, "Meat Lamp"));
        manager.addProduct(new Product(12, "Swivle Chair"));
        manager.addProduct(new Product(133, "Radio that tells time"));
        
        this.manager.printAllProductDetails();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void deliveryDemo()
    {
        // Show details of all of the products.
        manager.delivery(132, 5);
        manager.delivery(37, 10);
        manager.delivery(23, 7);
        manager.delivery(1, 3);
        manager.delivery(55, 15);
        manager.delivery(111, 1);
        manager.delivery(97, 6);
        manager.delivery(48, 7);
        manager.delivery(12, 4);
        manager.delivery(133, 3);
        System.out.println("New deliveries:");
        this.manager.printAllProductDetails();
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            showDetails(id);
            product.sellOne();
            showDetails(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
