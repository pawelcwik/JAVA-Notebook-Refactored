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
    public void showNoteById(Scanner in)
    {
        System.out.print("\nNote id number? ");
        int answer = in.nextInt();
        for (Note element : this.notesArray)
        {
            if (answer == element.getId())
            {
                System.out.println("\n"+element.getText()+"\n");
                return;
            }

        }
        System.out.println("\nThere is no note with "+answer+" id.\n");
    }

    public void addNote()
    {
        int newNoteId = Note.getLastId();
        newNoteId += 1;
        Scanner console = new Scanner(System.in);
        System.out.print("\nWrite note (id number "+ newNoteId + "): ");
        String newNoteText = console.nextLine();
        Note newNote = new Note(newNoteText);
        addNote(newNote);
        System.out.println("\n");
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

