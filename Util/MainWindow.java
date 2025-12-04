package Util;
import java.awt.Color;
import javax.swing.*;


public class MainWindow{
    private JFrame window;
    private JButton Settings_button;
    private JLabel title;
    private JPanel header;
    private JPanel body;
    private JPanel settingsmenu;
    public MainWindow(){
        System.out.println(DateTime.current()+ ": Initializing Main Window.");
        window = new JFrame();
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
        window.setTitle("Informatik Java Projekt");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(Screeninfo.width(0), Screeninfo.height(0));
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setAlwaysOnTop(false);
        System.out.println(DateTime.current()+": Main Window Initialized.");
        whatmenu("MainMenu");
    }
    private Void whatmenu(String menu){
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
        header = new JPanel();
        header.setBackground(Color.magenta);
        mainmenu.add(header);
        header.setVisible(true);
        title = new JLabel("Undefiend");
        title.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN,50));
        header.add(title);
        body = new JPanel();
        body.setBackground(Color.cyan);
        mainmenu.add(body);
        Settings_button = new JButton("Settings");
        body.add(Settings_button);
        Settings_button.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                System.out.println(DateTime.current()+"Pressed Settings Button");
                settings();
                window.remove(mainmenu);
            }
        });
        System.out.println(DateTime.current()+": Main Menu Initialized.");
    }
    public void settings(){
        Settings_button.setName("Settings");
        System.out.println(DateTime.current()+"Intitializing Settings Menu");
        settingsmenu = new JPanel();
        settingsmenu.setBackground(Color.orange);
        window.add(settingsmenu);
        settingsmenu.setVisible(true);
        System.out.println(DateTime.current()+"Settings Menu Initialized");
    }
}
