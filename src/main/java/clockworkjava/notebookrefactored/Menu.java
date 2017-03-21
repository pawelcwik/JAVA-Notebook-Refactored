// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

import java.util.List;
import java.util.Scanner;

/**
 * Holds menu for notebook program.
 */
public class Menu
{
    private Notebook notebook;
    private static String menuText;

    public Menu()
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

    public void runMenu() 
    {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running)
        {
             System.out.println(menuText);

             System.out.println("What would you like to do? ");
             int answer = in.nextInt();
             // http://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input
             in.nextLine();
             switch (answer)
             {
                case 1:
                    try {
                        List<Note> notes = notebook.showNotes();
                        for (Note element : notes)
                        {
                            System.out.print("\n"+element.getId()+" ");
                            System.out.println(element.getText());
                        }
                        System.out.println("\n");
                    } catch(IllegalStateException e) {
                        System.out.println("\nThere are no notes in the notebook\n");
                    }
                    break;
                case 2:
                    System.out.println("\nNote id number? ");
                    Note note = notebook.showNoteById(in.nextInt());
                    if (note!=null) {
                        System.out.println(note.getText());
                    } else {
                        System.out.println("\nThere is no note with " + answer + " id.\n");
                    }
                    break;
                case 3:
                    System.out.println("Note text: ");
                    String newNoteText = in.nextLine();
                    Note n = notebook.addNote(newNoteText);
                    System.out.println("Note added with id " + n.getId() + "\n");
                    break;
                case 4:
                    notebook.removeNote();
                    break;
                case 5:
                    notebook.modifyNote();
                    break;
                case 6:
                    running = false;
                    break;
                 default:
                     System.out.println("Unknown command. Use numbers 1 to 6");
             }
        }
        in.close();
    }

    Notebook getNotebook() {
        return notebook;
    }
}