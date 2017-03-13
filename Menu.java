import java.util.Scanner;
/**
 * Holds menu for notebook program.
 */
public class Menu
{
    private Notebook notebook = new Notebook();
    private static String menuText = 
    "Menu.\n" +
    "1.Show all notes\n" +
    "2.Show note by id\n" +
    "3.Add note\n" +
    "4.Remove note\n" +
    "5.Modify note";
    
    public void runMenu() 
    {
        while (true) 
        {
             System.out.println(menuText);
             Scanner in = new Scanner(System.in);
             System.out.print("What would you like to do? "); 
             int answer = in.nextInt();
             switch (answer)
             {
                case 1: this.showNotes();
                break;
                case 2: this.showNoteById();
                break;
                case 3: this.addNote();
                break;
                default: break;
             }
        }
    }
    
    public void showNotes()
    {
        if  (this.notebook.getNotesArray().size() == 0)
        {
            System.out.println("\nThere are no notes in the notebook\n");
        }
        else
        {
            for (Note element : this.notebook.getNotesArray())
            {
                System.out.print(element.getId());
                System.out.println(element.getText());
            }
        }
    }
    
    public void showNoteById()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Note id number? "); 
        int answer = in.nextInt();
        for (Note element : this.notebook.getNotesArray())
            {
                if (answer == element.getId())
                {
                    System.out.println(element.getText());
                    return;
                }
                
            }
        System.out.println("\nThere is no note with "+answer+" id\n");
    }
    
    public void addNote()
    {
        int newNoteId = Note.getLastId();
        newNoteId += 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Write note (id number "+ newNoteId + "): "); 
        //ERROR! Only takes first word from string!
        String newNoteText = in.next();
        Note newNote = new Note(newNoteText);
        notebook.addNote(newNote);
    }
}