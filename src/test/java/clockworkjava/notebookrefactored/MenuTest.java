// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

import org.junit.Test;

/**
 * Stores tests for Menu class, actual and 
 * expected answers are printed one after another.
 */
public class MenuTest
{
    @Test(expected = IllegalStateException.class)
    public void newNotebook()
    {
        Menu menu = new Menu();
        menu.getNotebook().showNotes();
    }
}