// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    private void addNote(Note newNote)
    {
        this.notesArray.add(newNote);
    }

    private boolean remNote(Note newNote)
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

    /**
     * Shows all notes in notebook, together with id numbers.
     */
    public List<Note> showNotes()
    {
        if  (this.notesArray.size() == 0)
        {
            throw new IllegalStateException();
        }
        else
        {
            return this.notesArray;
        }
    }

    /**
     * Asks about id and shows note if such exists.
     */
    public Note showNoteById(int id)
    {
        for (Note element : this.notesArray)
        {
            if (id == element.getId())
            {
                return element;
            }
        }
        return null;
    }

    public Note addNote(String newNoteText)
    {
        Note newNote = new Note(newNoteText);
        addNote(newNote);
        return newNote;
    }

    public void removeNote()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("\nWrite id number to remove note: ");
        int answer = console.nextInt();
        for (Note element : this.notesArray)
        {
            if (answer == element.getId())
            {
                this.remNote(element);
                System.out.println("\nNote removed.\n");
                return;
            }
        }
        System.out.println("\nThere is no note with id "+answer+".\n");
    }

    /**
     * Asks about id and modifies note if such exists.
     */
    public void modifyNote()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("\nWrite id number to modify note: ");
        int answer = console.nextInt();
        for (Note element : this.notesArray)
        {
            if (answer == element.getId())
            {
                Scanner console2 = new Scanner(System.in);
                System.out.print("\nWrite new text: ");
                String newText = console2.nextLine();
                element.setText(newText);
                System.out.println("\n");
                return;
            }
        }
        System.out.println("\nThere is no note with id "+answer+".\n");
    }
}

