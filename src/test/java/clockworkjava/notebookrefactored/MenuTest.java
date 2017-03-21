// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;
/**
 * Stores tests for Menu class, actual and 
 * expected answers are printed one after another.
 */
public class MenuTest
{
    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.showNotes();
        System.out.println("Expected: There are no notes in the notebook");
        
        
    }
}