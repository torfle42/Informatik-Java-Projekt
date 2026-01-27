import Util.DateTime;
import javax.swing.SwingUtilities;
public class Main{
    public static void main(String[] args){
        System.out.println(DateTime.current()+": Starting Informatik Java Projekt.");
        gui_program program = new gui_program();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                program.Intialize_Program();
            }
        });
    }
}