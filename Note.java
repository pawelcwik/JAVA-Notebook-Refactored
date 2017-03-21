/**
 * Note that stores text and has id number.
 */
public class Note
{
    private static int lastId = 0;
    
    private String text;
    private int id;
    
    /**
     * Class Note constructor.
     * Constructs a note with given text.
     * @param text message to be stored in note
     */
    public Note(String text)
    {
        this.text = text;
        lastId++;
        this.id = lastId;
    }
    /**
     * Getter for text field.
     * @return current message stored in note
     */
    public String getText()
    {
        return this.text;
    }
    /**
     * Setter for text field.
     * @param newText new message to set as text field.
     */
    public void setText(String newText)
    {
        this.text = newText;
    }
    /**
     * Getter for note's id number.
     * @return note's id number as int.
     */
    public int getId()
    {
        return this.id;
    }
    /**
     * Setter for note's id number.
     * @param number new number to set as id field.
     */
    public void setId(int number)
    {
        this.id = number;
    }
    /**
     * Getter for static lastId field.
     * @return class variable lastId as int.
     */
    public static int getLastId()
    {
        return lastId;
    }
}