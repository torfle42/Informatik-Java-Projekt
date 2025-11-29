package Util;
import javax.swing.*;
import java.awt.Color;


public class MainWindow{
    private JFrame window;
    public MainWindow(){
        System.out.println(DateTime.current()+ ": Initializing Main Window.");
        window = new JFrame();
        window.setTitle("Informatik Java Projekt");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(Screeninfo.width(0), Screeninfo.height(0));
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setAlwaysOnTop(false);
        System.out.println(DateTime.current()+": Main Window Initialized.");
        what("MainMenu");
    }
    private Void what(String menu){
        if(menu=="MainMenu"){
            MainMenu();
        }
        return null;
    }
    public void MainMenu(){
        System.out.println(DateTime.current()+": Initializing Main Menu.");
        JPanel mainmenu = new JPanel();
        mainmenu.setBackground(Color.green);
        window.add(mainmenu);
        mainmenu.setVisible(true);
    }
}
