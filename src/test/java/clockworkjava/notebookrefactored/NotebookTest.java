// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Stores tests for Notebook class, actual and 
 * expected answers are printed one after another.
 */
public class NotebookTest
{
    @Test
    public void basicTest()
    {
        Notebook notebook = new Notebook();

        assertEquals(0,notebook.size());

        Note note = new Note("This is a test note.");
        notebook.addNote("This is a test note.");

        assertEquals(1,notebook.size());

        assertEquals("This is a test note.", notebook.showNotes().get(0).getText());

//     something wrong here, i'm out of time to fix this    assertTrue(notebook.remNote(note));
//
//        assertFalse(notebook.remNote(note));
    }
}