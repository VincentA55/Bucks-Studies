import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Vincent Assolutissimamente
 * @version    14/11/2020
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getString()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        return inputLine;
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as an integer.
     *
     * @return  an int typed by the user.
     */
    public int getInt(){
        System.out.println("> ");
        int inputInt = reader.nextInt();
        return inputInt;
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine().trim().toLowerCase();

        String[] wordArray = inputLine.split(" ");

        HashSet<String> words = new HashSet<String>();
        for (String word : wordArray) {
            words.add(word);
        }
        return words;
    }
}

    

