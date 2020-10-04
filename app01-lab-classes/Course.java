
/**
 * 
 *
 * @author (Vincent Assolutissimamente)
 * @version (30/9/2020)
 */
public class Course
{
    // the course code
    private String codeNumber;
    // the course title
    private String name;

    /**
     * set the code and name for a course
     */
    public Course(String courseCode, String courseName)
    {
        codeNumber = courseCode;
        name = courseName;
    }

    public String getCode()
    {
     return codeNumber;
    }
    
    public String getName()
    {
     return name; 
    }
    
}
