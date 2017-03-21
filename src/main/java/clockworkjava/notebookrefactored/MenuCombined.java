package clockworkjava.notebookrefactored;

import java.util.Scanner;
/**
 * Holds menu for notebook program.
 */
public class MenuCombined
{
    private Notebook notebook;
    private static String menuText;
    
    /**
     * class Menu constructor.
     */
    public MenuCombined()
    {
        this.notebook = new Notebook();
        this.menuText = 
        "Menu.\n" +
        "1.Show all notes\n" +
        "2.Show note by id\n" +
        "3.Add note\n" +
        "4.Remove note\n" +
        "5.Modify note\n" +
        "6.Exit";
        
    }
    
    /**
     * Runs menu in loop.
     */
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
                case 2: this.handleNote("show");
                break;
                case 3: this.addNote();
                break;
                case 4: this.handleNote("remove");
                break;
                case 5: this.handleNote("modify");
                break;
                case 6: System.exit(1);
                default: break;
             }
        }
    }
    
    /**
     * Shows all notes in notebook, together with id numbers.
     */
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
                System.out.print("\n"+element.getId()+" ");
                System.out.println(element.getText());
            }
            System.out.println("\n");
        }
    }
     
    /**
     * Adds note to notebook.
     */
    public void addNote()
    {
        int newNoteId = Note.getLastId();
        newNoteId += 1;
        Scanner console = new Scanner(System.in);
        System.out.print("\nWrite note (id number "+ newNoteId + "): "); 
        String newNoteText = console.nextLine();
        Note newNote = new Note(newNoteText);
        notebook.addNote(newNote);
        System.out.println("\n");
    }
    
    /**
     * Handles showing, removing and modifying note, based on parameter.
     * @param task Decides about action. Can be show/remove/modify strin
     */
    public void handleNote(String task)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nNote id number to "+task+"? "); 
        int answer = in.nextInt();
        for (Note element : this.notebook.getNotesArray())
            {
                if (answer == element.getId())
                { if (task.equals("show")) 
                    {
                        System.out.println("\n"+element.getText()+"\n");
                        return;
                    } else if (task.equals("remove"))
                    {
                        this.notebook.remNote(element);
                        System.out.println("\nNote removed.\n");
                        return;
                    } else if (task.equals("modify"))
                    {
                         Scanner console2 = new Scanner(System.in);
                         System.out.print("\nWrite new text: ");
                         String newText = console2.nextLine();
                         element.setText(newText);
                         System.out.println("\n");
                         return;
                    }
                }
            }
        System.out.println("\nThere is no note with "+answer+" id.\n");
    }
}