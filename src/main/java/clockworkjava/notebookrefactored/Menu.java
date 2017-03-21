// Refactored by pawel cwik
//
// https://www.youtube.com/channel/UCTQKVB4Co0fGfyjNJky6kPg
// https://www.facebook.com/clockworkjava
package clockworkjava.notebookrefactored;

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

             System.out.print("What would you like to do? "); 
             int answer = in.nextInt();
             switch (answer)
             {
                case 1:
                    notebook.showNotes();
                    break;
                case 2:
                    notebook.showNoteById(in);
                    break;
                case 3:
                    notebook.addNote();
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
}