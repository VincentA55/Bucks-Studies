import java.util.ArrayList;
/**
 * A class for the Course with its modules
 *
 * @author Vincent Assolutissimamente
 * @version 2020.21.10
 */
public class Course
{
    //the name of the course
    private String title;
    // the modules of a given course
    private ArrayList<Module> modules;
    
    /**
     *  creates a course with a title and a list for its modules
     */
    public Course(String title)
    {
        this.title = title;
        modules = new ArrayList<Module>();
    }
    
    /**
     * adds a module to the course
     */
    public void addModule(Module title)
    {
        this.modules.add(title);
    }
    
    /**
     * prints out all the current modules
     */
    public void printModules()
    {
     for(Module module : modules)
     {
         System.out.println(module.printModule());
     }
    }
    
    
    
    
}


