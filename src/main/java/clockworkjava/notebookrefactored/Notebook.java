// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

import java.util.ArrayList;
import java.util.List;

/**
 * Notebook that stores up to 10 notes.
 */
public class Notebook
{
    private List<Note> notesArray;
    


    public Notebook()
    {
        this.notesArray = new ArrayList<Note>();
    }
    


    public List<Note> getNotesArray()
    {
        return this.notesArray;
    }
    


    public void addNote(Note newNote)
    {
        this.notesArray.add(newNote);
    }
    


    public boolean remNote(Note newNote)
    {
        if (this.notesArray.remove(newNote))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

