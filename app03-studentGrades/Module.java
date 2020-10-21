
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
    //the students mark for each module;
    private int mark;
    
    /**
     * Creates a Module with a title and code, and default marks at 0
     */
    public Module(String title,String code)
    {
     this.title = title;
     this.code = code;
     this.mark = 0;
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
    
    /**
     * returns the mark of a module
     */
    private int getMark()
    {
        return mark;
    }
    
    public String printModule()
    {
        return (this.code + ": " + this.title);
    }
}
