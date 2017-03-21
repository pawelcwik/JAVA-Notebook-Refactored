// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

/**
 * Stores tests for Notebook class. Prints message about
 * error only if there is one, also prints summary with
 * information whether tests were good or not.
 */
public class NotebookAutomatedTest
{
    public static void main(String[] args)
    {
        boolean isOk = true;
        Notebook notebook = new Notebook();
        Note note = new Note("This is test note");
        notebook.addNote(note);
        
        
        if (! note.equals(notebook.getNotesArray().get(0)))
        {
            System.out.println("Error in .addNote or .getBotesArray method!");
            isOk = false;
        }
        
        notebook.remNote(note);
        
        if ( notebook.getNotesArray().size() != 0)
        {
            System.out.println("Error in .remNote method!");
            isOk = false;
        }
        
        if (isOk)
        {
            System.out.println("All tests ok!");
        }
        else
        {
            System.out.println("Some tests failed!");
        }
    }
}