// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

/**
 * Stores tests for Notebook class, actual and 
 * expected answers are printed one after another.
 */
public class NotebookTest
{
    public static void main(String[] args)
    {
        Notebook notebook = new Notebook();
        
        System.out.println(notebook.getNotesArray().size());
        System.out.println("Expected: 0");
        
        Note note = new Note("This is a test note.");
        notebook.addNote(note);
        
        System.out.println(notebook.getNotesArray().size());
        System.out.println("Expected: 1");
        System.out.println(notebook.getNotesArray().get(0).getText());
        System.out.println("Expected: This is a test note.");
        System.out.println(notebook.remNote(note));
        System.out.println("Expected: true");
        System.out.println(notebook.remNote(note));
        System.out.println("Expected: false");
        System.out.println(notebook.getNotesArray().size());
        System.out.println("Expected: 0");
        
    }
}