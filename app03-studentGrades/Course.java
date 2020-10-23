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
    // the total current marks
    private int currentMarks;
    
    /**
     *  creates a course with a title and a list for its modules
     */
    public Course(String title)
    {
        this.title = title;
        modules = new ArrayList<Module>();
        this.currentMarks = 0;
    }
    
    /**
     * adds a module to the course
     */
    public void addModule(Module title)
    {
        this.modules.add(title);
    }
    
    /**
     * calculates and prints the final grade
     */
    public void getFinalGrade()
    {
       for (Module module: modules)
       {
        System.out.println(module.getDetails());
        this.currentMarks = (currentMarks + module.getMark());
        }
        System.out.println("Final Grade: "+ currentMarks);
    }
    
    
    
    
    
    
    
    
    
    /**
     * prints out all the current modules
     */
    public void printModules()
    {
     for(Module module : modules)
     {
         System.out.println(module.getDetails());
     }
    }
    
    
    
    
}


