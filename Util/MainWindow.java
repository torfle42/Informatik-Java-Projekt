package Util;
import java.awt.Color;
import java.awt.event.ActionListener;

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
        // Species Selction Components
        public JComboBox<String> SpeciesSelectJComboBox = new JComboBox<String>();
        public JLabel SpeciesSelectJLabel = new JLabel("Select your species:");

    //Created Character Menu Components
    public JPanel CreatedCharacterMenuJPanel = new JPanel();   
    public JButton CreatedCharacterMenuJButton = new JButton("View created characters");

    //Quit Menu Components
    public JPanel QuitMenuJPanel = new JPanel();
    public JButton QuitMenuJButton = new JButton();

    //Debug-App
    public JFrame DebugAppWindow = new JFrame("Debug App");
    public JPanel DebugAppJPanel = new JPanel();
    public JLabel DebugAppTitleJLabel = new JLabel("Debug App");
    public JButton DebugAppJButton = new JButton("Open Debug App");
    public JLabel MainWindowWidthinfo = new JLabel("Main Window Width: " + window.getWidth());
    public JLabel MainWindowHeightinfo = new JLabel("Main Window Height: " + window.getHeight());
    public JLabel MainWindowCurrentJPanelinfo = new JLabel("Current JPanel: " + CurrentJPanel);
    public JLabel ScreeninfoTotalScreensinfo = new JLabel("Total Screens: " + Screeninfo.total());
    public JLabel ScreeninfoPrimaryScreenWidthinfo = new JLabel("Primary Screen Size: " + Screeninfo.width(0)+"x"+Screeninfo.height(0));
    public JLabel CurrentJPanelsizeinfo = new JLabel("Current JPanel Size: ");

    public void refresh(){ // simpler anstatt immer und immer wieder die gleichen 3 Zeilen zu schreiben
        window.revalidate();
        window.repaint();
        DebugAppWindow.revalidate();
        DebugAppWindow.repaint();
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
        MainMenuJPanel.setBackground(Color.green);
        MainMenuJPanel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuJPanel.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        if(MainMenuJPanel.getWidth()/2 != window.getWidth()/2 || MainMenuJPanel.getHeight()/2 != window.getHeight()/2){
        MainMenuJPanel.setSize(window.getWidth()/2, window.getHeight()/2);
        }

        //adding content
        System.out.println(DateTime.current()+ ": Adding Main Menu JPanel content.");
        MainMenuJPanel.add(MainMenuTitleJLabel);
        MainMenuTitleJLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 50));
        MainMenuTitleJLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuTitleJLabel.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
        MainMenuTitleJLabel.setVisible(true);
        SettingsMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        SettingsMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
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
        CharacterCreationMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
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
        CreatedCharacterMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
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
        CreatedCharacterMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
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
        QuitMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
        QuitMenuJButton.setVisible(true);
        QuitMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    System.out.println(DateTime.current()+ ": Quit Application.");
                    System.exit(0);
                }
            }
        );
        DebugAppJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        DebugAppJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
        DebugAppJButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    DebugAppWindow.setVisible(true);
                }
            }
        );
        MainMenuJPanel.add(DebugAppJButton);
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
        MainMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
        MainMenuJButton.setVisible(true);
        //refreshing window
        refresh();
    }
    public void CharacterCreationMenu(){
        //Setup Character Creation Menu JPanel
        window.getContentPane().removeAll();
        System.out.println(DateTime.current()+ ": Loading Character Creation Menu JPanel.");
        window.getContentPane().add(CharacterCreationMenuJPanel);
        CharacterCreationMenuJPanel.setBackground(Color.magenta);
        CharacterCreationMenuJPanel.setVisible(true);
        CurrentJPanel = "CharacterCreationMenu";
        //content
        CharacterCreationMenuJPanel.add(MainMenuJButton);
        MainMenuJButton.addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    MainMenu();
                }
            }
        );
        MainMenuJButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        MainMenuJButton.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
        MainMenuJButton.setVisible(true);
        CharacterCreationMenuJPanel.add(CharacterCreationMenuTitleJLabel);
        CharacterCreationMenuTitleJLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 50));
        CharacterCreationMenuTitleJLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        CharacterCreationMenuTitleJLabel.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
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
    public void DebugApp(){
        System.out.println(DateTime.current()+ ": Initializing Debug App Window.");
        DebugAppWindow.setLayout(new BoxLayout(DebugAppWindow.getContentPane(), BoxLayout.Y_AXIS));
        DebugAppWindow.setSize(Screeninfo.width(0),Screeninfo.height(0));
        DebugAppWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DebugAppWindow.setVisible(true);
        DebugAppWindow.setAlwaysOnTop(true);

        //adding content
        System.out.println(DateTime.current()+ ": Adding Debug App JPanel content.");
        DebugAppJPanel.add(DebugAppTitleJLabel);
        DebugAppWindow.getContentPane().add(DebugAppJPanel);
        DebugAppTitleJLabel.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 30));
        DebugAppTitleJLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        DebugAppTitleJLabel.setAlignmentY(java.awt.Component.BOTTOM_ALIGNMENT);
        DebugAppTitleJLabel.setVisible(true);
        DebugAppJPanel.add(DebugAppTitleJLabel);

        //refreshing window
        refresh();
        System.out.println(DateTime.current()+ ": Debug App JPanel Loaded.");
    }
}