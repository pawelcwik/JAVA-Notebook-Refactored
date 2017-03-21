// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

/**
 * Stores tests for Note class. Prints message about
 * error only if there is one, also prints summary with
 * information whether tests were good or not.
 */
public class NoteAutomatedTest
{
    public static void main(String[] args)
    {
        boolean isOk = true;
        Note note = new Note("This is test note.");
        String testText = "This is test note.";
        if (! testText.equals(note.getText())) 
        {
            System.out.println("Error in .getText method!");
            isOk = false;
        }
        
        String testId = "1";
        String idString = Integer.toString(note.getId());
        if (! testId.equals(idString))
        {
            System.out.println("Error in .getId method!");
            isOk = false;
        }
        
        Note newNote = new Note("This is second note.");
        if (newNote.getLastId() != 2)
        {
            System.out.println("Error in .getLastId method!");
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