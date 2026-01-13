import Util.DateTime;
import Util.MainWindow;
import javax.swing.SwingUtilities;
public class Main{
    public static void main(String[] args){
        System.out.println(DateTime.current()+": Starting Informatik Java Projekt.");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main = new MainWindow();
            }
        });
    }
}