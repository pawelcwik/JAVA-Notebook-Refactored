// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

public class Note
{
    private static int lastId = 0;
    
    private String text;
    private int id;

    public Note(String text)
    {
        this.text = text;
        lastId++;
        this.id = lastId;
    }

    public String getText()
    {
        return this.text;
    }


    public void setText(String newText)
    {
        this.text = newText;
    }


    public int getId()
    {
        return this.id;
    }


    public void setId(int number)
    {
        this.id = number;
    }


    public static int getLastId()
    {
        return lastId;
    }
}