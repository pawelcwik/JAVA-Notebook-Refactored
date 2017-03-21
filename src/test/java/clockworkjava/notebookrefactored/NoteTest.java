// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Stores tests for Note class, actual and expected
 * answers are printed one after another.
 */
public class NoteTest
{

    @Test
    public void basicTest() {

        Note note = new Note("This is test note.");

        assertEquals("This is test note.",note.getText());
        assertEquals(1,note.getId());
        assertEquals(1,Note.getLastId());
        
        note.setText("This is a new text.");
        assertEquals("This is a new text.",note.getText());

        // and so on..
//        note.setId(99);
//        System.out.println(note.getId());
//        System.out.println("Expected: 99");
//
//        Note nextNote = new Note("Second note");
//        System.out.println(Note.getLastId());
//        System.out.println("Expected: 2");
    }
}