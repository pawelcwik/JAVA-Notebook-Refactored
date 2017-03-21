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