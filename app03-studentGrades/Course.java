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
    
    public Course(String title)
    {
        this.title = title;
        modules = new ArrayList<Module>();
    }
    
    public void addModule(Module code)
    {
        
    }
}
