/**
 * Stores tests for Note class, actual and expected
 * answers are printed one after another.
 */
public class NoteTest
{
    public static void main(String[] args)
    {
        Note note = new Note("This is test note.");
        
        System.out.println(note.getText());
        System.out.println("Expected: This is test note");
        System.out.println(note.getId());
        System.out.println("Expected: 1");
        System.out.println(Note.getLastId());
        System.out.println("Expected: 1");
        
        note.setText("This is a new text.");
        System.out.println(note.getText());
        System.out.println("Expected: This is a new text.");
        note.setId(99);
        System.out.println(note.getId());
        System.out.println("Expected: 99");
        
        Note nextNote = new Note("Second note");
        System.out.println(Note.getLastId());
        System.out.println("Expected: 2");
    }
}