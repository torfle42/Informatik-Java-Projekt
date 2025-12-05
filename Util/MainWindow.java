package Util;
import java.awt.Color;
import javax.swing.*;
public class MainWindow{
    public JFrame window;
    public JButton Settings_button;
    public JLabel title;
    public JPanel header;
    public JPanel body;
    public JPanel settingsmenu;
    public JPanel mainmenu;
    public int LastMenu;
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
    private void whatmenu(String menu){
        if(menu=="MainMenu"){
            MainMenu();
        }
        if(menu=="SettingsMenu"){
            SettingsMenu();
        }
    }
    public void MainMenu(){
        LastMenu = 0;
        System.out.println(DateTime.current()+": Initializing Main Menu.");
        mainmenu = new JPanel();
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
                System.out.println(DateTime.current()+": Pressed Settings Button");
                SettingsMenu();
            }
        });
        System.out.println(DateTime.current()+": Main Menu Initialized.");
    }
    public void SettingsMenu(){
        settingsmenu = new JPanel();
        if(LastMenu == 0){
            window.add(settingsmenu);
            window.setAlwaysOnTop(true);
            window.remove(mainmenu);
        }
        Settings_button.setName("Settings");
        System.out.println(DateTime.current()+": Intitializing Settings Menu");
        settingsmenu.setBackground(Color.orange);
        settingsmenu.setVisible(true);
        System.out.println(DateTime.current()+": Settings Menu Initialized");
    }
}