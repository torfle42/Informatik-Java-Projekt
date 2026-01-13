package Util;
import java.awt.Color;
import javax.swing.*;
public class MainWindow{
    //Window Components
    public String titleString = "D&D 5th Edition Character Generator";
    public JFrame window = new JFrame(titleString);
    public String CurrentJPanel = null;
    public JLabel title = new JLabel(titleString);

    //Main Menu Components
    public JPanel MainMenuJPanel = new JPanel();
    public JButton MainMenuJButton = new JButton("Main Menu");
    public JLabel MainMenuTitleJLabel = new JLabel(titleString);

    //Settings Menu Components
    public JPanel SettingsMenuJPanel = new JPanel();
    public JButton SettingsMenuJButton = new JButton("Settings");

    //Character Creation Menu Components
    public JPanel CharacterCreationMenuJPanel = new JPanel();
    public JButton CharacterCreationMenuJButton = new JButton("Create new chracter");
    public JLabel CharacterCreationMenuTitleJLabel = new JLabel("Create your Chracter!");

    //Created Character Menu Components
    public JPanel CreatedCharacterMenuJPanel = new JPanel();   
    public JButton CreatedCharacterMenuJButton = new JButton("View created characters");

    //Quit Menu Components
    public JPanel QuitMenuJPanel = new JPanel();
    public JButton QuitMenuJButton = new JButton();
    
    public void refresh(){ // simpler anstatt immer und immer wieder die gleichen 3 zeilen zu schreiben
        window.revalidate();
        window.repaint();
    }
    public MainWindow(){
    System.out.println(DateTime.current()+": Initializing Main Window.");
        window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(Screeninfo.width(0), Screeninfo.height(0));
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setAlwaysOnTop(false);
        window.getContentPane().setBackground(Color.blue);
        System.out.println(DateTime.current()+": Main Window Initialized.");
        MainMenu();   
    }
    public void MainMenu(){

        // Setup Main Menu JPanel
        window.getContentPane().removeAll();
        System.out.println(DateTime.current()+ ": Loading Main Menu JPanel.");
        MainMenuJPanel.setLayout(new BoxLayout(MainMenuJPanel, BoxLayout.Y_AXIS));
        window.getContentPane().add(MainMenuJPanel);
        MainMenuJPanel.setVisible(true);
        MainMenuJPanel.setSize(window.getWidth(), window.getHeight());
        CurrentJPanel = "MainMenu";

        //adding content
        System.out.println(DateTime.current()+ ": Adding Main Menu JPanel content.");
        MainMenuJPanel.add(MainMenuTitleJLabel);
        MainMenuTitleJLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 50));
        MainMenuTitleJLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuTitleJLabel.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuTitleJLabel.setVisible(true);
        SettingsMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        SettingsMenuJButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuJPanel.add(SettingsMenuJButton);
        SettingsMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SettingsMenu();
                }
            }
        );
        SettingsMenuJButton.setVisible(true);
        MainMenuJPanel.add(CharacterCreationMenuJButton);
        CharacterCreationMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        CharacterCreationMenuJButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuJPanel.add(CharacterCreationMenuJButton);
        CharacterCreationMenuJButton.setVisible(true);
        CharacterCreationMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CreatedCharacterMenu();
                    System.out.println(DateTime.current()+": Opened Character Creation Menu JPanel.");
                }
            }
        );
        MainMenuJPanel.add(CreatedCharacterMenuJButton);
        CreatedCharacterMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        CreatedCharacterMenuJButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        CreatedCharacterMenuJButton.setVisible(true);
        CreatedCharacterMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CreatedCharacterMenu();
                }
            }
        );
        MainMenuJPanel.add(CreatedCharacterMenuJButton);
        CreatedCharacterMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        CreatedCharacterMenuJButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        CreatedCharacterMenuJButton.setVisible(true);
        CreatedCharacterMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    CreatedCharacterMenu();
                }
            }
        );
        MainMenuJPanel.add(QuitMenuJButton);
        QuitMenuJButton.setText("Quit");
        QuitMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        QuitMenuJButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        QuitMenuJButton.setVisible(true);
        QuitMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    System.out.println(DateTime.current()+ ": Quit Application.");
                    System.exit(0);
                }
            }
        );
        //refreshing window
        refresh();
        System.out.println(DateTime.current()+ ": Main Menu JPanel Loaded.");
    } 
    public void SettingsMenu(){
        window.getContentPane().removeAll();
        System.out.println(DateTime.current()+ ": Loading Settings Menu JPanel.");
        window.getContentPane().add(SettingsMenuJPanel);
        window.add(SettingsMenuJPanel);
        SettingsMenuJPanel.setVisible(true);
        CurrentJPanel = "SettingsMenu";
        //content
        SettingsMenuJPanel.add(MainMenuJButton);
        MainMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MainMenu();
                }
            }
        );
        MainMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuJButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuJButton.setVisible(true);
        //refreshing window
        refresh();
    }
    public void CharacterCreationMenu(){
        //Setup Character Creation Menu JPanel
        window.getContentPane().removeAll();
        System.out.println(DateTime.current()+ ": Loading Character Creation Menu JPanel.");
        window.getContentPane().add(CharacterCreationMenuJPanel);
        CharacterCreationMenuJPanel.setVisible(true);
        CurrentJPanel = "CharacterCreationMenu";
        //content
        CharacterCreationMenuJPanel.add(CharacterCreationMenuTitleJLabel);
        CharacterCreationMenuTitleJLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 50));
        CharacterCreationMenuTitleJLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        CharacterCreationMenuTitleJLabel.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        CharacterCreationMenuTitleJLabel.setVisible(true);
        //refreshing window
        refresh();
    }
    public void CreatedCharacterMenu(){
        window.getContentPane().removeAll();
        System.out.println(DateTime.current()+ ": Loading Created Character Menu JPanel.");
        window.getContentPane().add(CreatedCharacterMenuJPanel);
        CurrentJPanel = "CreatedCharacterMenu";
        System.out.println(DateTime.current()+ ": Loading Created Character Menu JPanel content.");
        refresh();
    }
}