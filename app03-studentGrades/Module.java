
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
    
    public Module(String title,String code)
    {
     this.title = title;
     this.code = code;
     this.mark = 0;
    }
    
    public String getCode()
    {
       return code;
    }
}
