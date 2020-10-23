
/**
 * Modules that a part of a given course
 *
 * @author Vincent Assolutissimamente 
 * @version 2020.21.10
 */
public class Module
{
    // the title of the module
    private String title;
    //the code for the module
    private String code;
    //the students marks for each module;
    private int marks;
    
    /**
     * Creates a Module with a title and code, and default marks at 0
     */
    public Module(String title,String code)
    {
     this.title = title;
     this.code = code;
     this.marks = 0;
    }
    
    /**
     * returns the code of a module
     */
    public String getCode()
    {
       return code;
    }
    
    /**
     * returns the title of a module
     */
    public String getTitle()
    {
        return title;
    }
    
    public void addMarks(int marks)
    {
       this.marks = (this.marks + marks);
    }
    
    /**
     * returns the mark of a module
     */
    public int getMark()
    {
        return marks;
    }
    
    /**
     * returns the code and title as a string
     */
    public String getDetails()
    {
        return (this.code + ": " + this.title + " " +this.marks + "/100");
    }
}
