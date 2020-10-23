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
    //the final grade 
    private String finalGrade;
    
    /**
     *  creates a course with a title and a list for its modules
     */
    public Course(String title)
    {
        this.title = title;
        modules = new ArrayList<Module>();
        this.currentMarks = 0;
        this.finalGrade = null;
    }
    
    /**
     * adds a module to the course
     */
    public void addModule(Module title)
    {
        this.modules.add(title);
    }
    
    /**
     * calculates the final grade and coverts it into a letter
     */
    private void calcFinalGrade()
    {
        if(this.currentMarks >= 0 && this.currentMarks <= 39)
        {
            this.finalGrade = "F";
        }
        
        else if(this.currentMarks >= 40 && this.currentMarks <=49)
        {
            this.finalGrade = "D";
        }
        
        else if(this.currentMarks >= 50 && this.currentMarks <= 59)
        {
            this.finalGrade = "C";
        }
        
        else if(this.currentMarks >= 60 && this.currentMarks <= 69)
        {
            this.finalGrade = "B";
        }
       
        else if(this.currentMarks >= 70 && this.currentMarks <= 100)
        {
            this.finalGrade = "A";
        }
    
        else 
        {
            System.out.println("Unexpected error");
        }
    }
    
    /**
     * gets and prints the  grades per module and the final grade 
     */
    public void getFinalGrade()
    {
       for (Module module: modules)
       {
        System.out.println(module.getDetails());
        this.currentMarks = (currentMarks + module.getMark());
        }
        calcFinalGrade();
        System.out.println("Final Grade: "+ this.finalGrade);
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


