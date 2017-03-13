import java.util.ArrayList;
/**
 * Notebook that stores up to 10 notes.
 */
public class Notebook
{
    private ArrayList<Note> notesArray = new ArrayList<Note>();
    
    /**
     * Getter for notesArray.
     * @return notesArray of Notebook object.
     */
    public ArrayList<Note> getNotesArray()
    {
        return this.notesArray;
    }
    
    /**
     * Adds note to notesArray.
     * @param newNote given note object to add to notebook.
     */
    public void addNote(Note newNote)
    {
        this.notesArray.add(newNote);
    }
    
    /** Removes note from notesArray, returns true if succeded or 
     * false if not.
     * @param newNote given note object to remove from notebook.
     */
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

