//Stunden am Versuch der Optimierung von Leserlichkeit und Struktur verschwendet: 15

//Noch zu tun:
// Theme Toggle Funktionalität implementieren
// Create Character Menu implementieren
// Created Character Menu implementieren
// Charakterdatenstruktur und Speicherung implementieren
// Flexibles Layout für verschiedene Bildschirmgrößen implementieren
    // East South und Center Panel tauchen nocht nicht auf
    // Komponenten Größenanpassung bei Fenstergrößenänderung implementieren
// Fehlerbehandlung und Validierung hinzufügen
// Swich Methode für Menüs implementieren
//Credits Fenster implementieren
// west Panel Buttons Stylen
// West Panel Buttons im West Panel zentrieren
// West Panel Buttons interaktiv machen (Hover Effekte etc.)

//Done:
// Grundlegende GUI Struktur mit BorderLayout erstellt
// Hauptmenü mit Buttons erstellt


import com.sun.tools.javac.Main;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import Util.*;
import com.sun.source.tree.WhileLoopTree;
import java.util.Set;

import javax.swing.*;
import javax.swing.border.Border;
public class gui_program{
    
    static {
        System.out.println(DateTime.current()+": Deklaration und Initialisierung der gui_program Componenten");
    }
    //General Components

    private static JFrame Main_Window_Frame = new JFrame("D&D 5th Edition Character Creator");

    private static final JLabel Program_Title_String = new JLabel("D&D 5th Edition Character Creator"); // "final" => nachdem die Variable initialisiert wurde, kann sie nicht mehr verändert werden

    private JPanel West_Panel = new JPanel();
    private JPanel North_Panel = new JPanel();
    private JPanel South_Panel = new JPanel();
    private JPanel East_Panel = new JPanel();
    private JPanel Current_Center_Panel = null;

    //Buttons and their ActionListeners

        //Created Characters Menu Button and ActionListener
        private JButton Created_Characters_Menu_Button = new JButton("View Created Characters");
        private final ActionListener Created_Characters_Menu_ActionListener = new ActionListener() { //definiert einen ActionListener, ohne an einen Button gebunden zu sein das erlaubt es ihn an mehreren Buttons zu verwenden ohne den Code zu duplizieren 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Created_Character_Menu();
            }
        };
    
        //Create New Character Button and ActionListener
        private final JButton Create_Character_Button = new JButton("Create New Character");
        private final ActionListener Create_Character_ActionListener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Create_Character_Menu();
            }
        };
        
        //Exit Program Button and ActionListener
        private JButton Exit_Program_Button = new JButton("Exit Program");
        private final ActionListener Exit_Program_ActionListener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.exit(0);
            }
        };

        //Toggle Light/Dark Theme Button and ActionListener
        private final JButton Toggle_Theme_Button = new JButton("Toggle to Dark Theme");
        private final ActionListener Toggle_Theme_ActionListener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Toggle_Theme();
            }
        };
        private final JButton Credits_Button = new JButton("See Credits");
        private final ActionListener Credits_ActionListener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Credits_Menu();
            }
        };

        //Main Menu Button and ActionListener
        private final JButton Main_Menu_Button = new JButton("Main Menu");
        private final ActionListener Main_Menu_ActionListener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Main_Menu();
            }
        };
    
    // Menu Panels & Componenten
    static {
        System.out.println(DateTime.current()+": Beginne mit der Deklaration und Initialisierung der Menu Componenten");
    }
        // Main Menu
        private final JPanel Main_Menu_Panel = new JPanel();
        private final JLabel Main_Menu_Description_Title = new JLabel("Willkommen zum D&D 5th Edition Character Creator! ");
        private final JPanel Main_Menu_Description_Panel = new JPanel();
        private final JLabel Main_Menu_Description_Text = new JLabel("Dieses Programm hilft dir dabei, Charaktere für das Dungeons & Dragons 5th Edition Rollenspiel zu erstellen. Klicke auf , um zu beginnen.");
        private final JPanel Main_Menu_Information_Panel = new JPanel();
        private final JLabel Main_Menu_Information_Text = new JLabel ("Der Creator ist noch sehr basisch es fehlen noch Features, um einen DnD 5E Character komplett zu erstellen: Startequipment (), Hintergrund, Subclasses, Einige Völker, Sprachen, (Klassen/Volk-)Fertigkeiten (+ Übung und Expertise), Zauber, Feats, Rüstungsklasse, andere Wert Berechnungsmethoden(Standardarray und Point-Buy), und erweiterte Startoptionen (Characterlevel, Startgold etc.)</p></body></html>");

        static {
            System.out.println(DateTime.current()+": Main Menu Componenten deklariert und initialisiert");
        }

        // Create Character Menu
        private final JPanel Create_Character_Menu = new JPanel();

    // Variables
    private final double Width_Mod = 0.4; //Prozentualer Anteil der Breite des West und East Panels am Main Window Frame
    
    static {
        System.out.println(DateTime.current()+": gui_program Componenten deklariert und initialisiert");
    }

    public static final void refresh(){
        Main_Window_Frame.revalidate();
        Main_Window_Frame.repaint();
    }
    private void setCenterPanel(JPanel panel){
        if(Current_Center_Panel!=null){
            Main_Window_Frame.remove(Current_Center_Panel);
        }
        Current_Center_Panel = panel;
        Main_Window_Frame.add(Current_Center_Panel, BorderLayout.CENTER);
        Current_Center_Panel.setVisible(true);
        Current_Center_Panel.revalidate();
        Current_Center_Panel.repaint();
        refresh();
    }
    public void Intialize_Program(){
        System.out.println(DateTime.current()+": einfügen der gui_program Componenten");
        //Main Window "Backbone" intialization
        Main_Window_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main_Window_Frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width/2, Toolkit.getDefaultToolkit().getScreenSize().height/2);
        Main_Window_Frame.setLayout(new BorderLayout());
        Main_Window_Frame.setLocationRelativeTo(null); //zentriert das Fenster auf dem Bildschirm
        Main_Window_Frame.setResizable(true);

        System.out.println(Util.DateTime.current()+": Hinzufügen der BorderLayout Componenten zum Main Window Frame");
        //BorderLayout Components intialization

            // North Panel intialization
            Main_Window_Frame.add(North_Panel, BorderLayout.NORTH);
            North_Panel.setBackground(Color.green);
            North_Panel.setVisible(true);
            North_Panel.setSize((int)Main_Window_Frame.getWidth(),(int)(Main_Window_Frame.getHeight()*0.2));

                    // North Panel Components intialization
                    Program_Title_String.setHorizontalAlignment(SwingConstants.CENTER);
                    Program_Title_String.setFont(new Font("Serif", Font.BOLD,(int)(North_Panel.getHeight()*0.5)));
                    Program_Title_String.setVisible(true);
                    Program_Title_String.setBackground(Color.BLACK);
                    North_Panel.add(Program_Title_String);

            System.out.println(Util.DateTime.current()+": North Panel Componenten hinzufügt");

            // West Panel intialization
            Main_Window_Frame.add(West_Panel, BorderLayout.WEST);
            West_Panel.setBackground(Color.cyan);
            West_Panel.setVisible(true);
            West_Panel.setSize((int)(Main_Window_Frame.getWidth()*Width_Mod), Main_Window_Frame.getHeight()-(North_Panel.getHeight()+South_Panel.getHeight())); // + benötigt noch Flex

                // West Panel Components intialization
                // Use a BoxLayout for vertical stacking instead of passing BoxLayout constants to add()
                West_Panel.setLayout(new BoxLayout(West_Panel, BoxLayout.Y_AXIS));

                West_Panel.add(Main_Menu_Button);
                Main_Menu_Button.addActionListener(Main_Menu_ActionListener);
                Main_Menu_Button.setAlignmentX(Component.LEFT_ALIGNMENT);
                Main_Menu_Button.setAlignmentY(Component.CENTER_ALIGNMENT);

                West_Panel.add(Create_Character_Button);
                Create_Character_Button.addActionListener(Create_Character_ActionListener);
                Create_Character_Button.setAlignmentX(Component.LEFT_ALIGNMENT);
                Create_Character_Button.setAlignmentY(Component.CENTER_ALIGNMENT);
                
                West_Panel.add(Created_Characters_Menu_Button);
                Created_Characters_Menu_Button.addActionListener(Created_Characters_Menu_ActionListener);
                Created_Characters_Menu_Button.setAlignmentX(Component.LEFT_ALIGNMENT);
                Created_Characters_Menu_Button.setAlignmentY(Component.CENTER_ALIGNMENT);

                West_Panel.add(Toggle_Theme_Button);
                Toggle_Theme_Button.addActionListener(Toggle_Theme_ActionListener);
                Toggle_Theme_Button.setAlignmentX(Component.LEFT_ALIGNMENT);
                Toggle_Theme_Button.setAlignmentY(Component.CENTER_ALIGNMENT);

                West_Panel.add(Exit_Program_Button);
                Exit_Program_Button.addActionListener(Exit_Program_ActionListener);
                Exit_Program_Button.setAlignmentX(Component.LEFT_ALIGNMENT);
                Exit_Program_Button.setAlignmentY(Component.CENTER_ALIGNMENT);

            System.out.println(DateTime.current()+": West Panel Componenten hinzufügt");

            // South Panel intialization
            Main_Window_Frame.add(South_Panel, BorderLayout.SOUTH);
            South_Panel.setBackground(Color.magenta);
            South_Panel.setVisible(true);
            South_Panel.setSize((int)Main_Window_Frame.getWidth(),(int)(Main_Window_Frame.getHeight()*0.2));

            System.out.println(DateTime.current()+": South Panel Componenten hinzufügt");

            // East Panel intialization
            Main_Window_Frame.add(East_Panel, BorderLayout.EAST);
            East_Panel.setBackground(Color.orange);
            East_Panel.setVisible(true);
            East_Panel.setSize((int)(Main_Window_Frame.getWidth()*Width_Mod), Main_Window_Frame.getHeight()-(North_Panel.getHeight()+South_Panel.getHeight())); // + benötigt noch Flex

            System.out.println(DateTime.current()+": East Panel Componenten hinzufügt");

        refresh();
        Main_Window_Frame.setVisible(true);
        System.out.println(DateTime.current()+": gui_program Componenten eingefügt");
        Main_Menu();
    }
    public void Main_Menu(){
        System.out.println(DateTime.current()+": Öffne Main Menu");

        // hinzufügen des Main Menu Panels zum Center Panel
        System.out.println(DateTime.current()+": füge Main Menu dem Main Window Center Panel hinzu");
        setCenterPanel(Main_Menu_Panel);
        Main_Menu_Panel.setBackground(Color.lightGray);
        Main_Menu_Panel.setSize((int)(Main_Window_Frame.getWidth()-(West_Panel.getWidth()+East_Panel.getWidth())), (int)(Main_Window_Frame.getHeight()-(North_Panel.getHeight()+South_Panel.getHeight()))); // Größe des Main Menus an die Größe des Center Panels anpassen
        Main_Menu_Panel.setLayout(new BoxLayout(Main_Menu_Panel, BoxLayout.Y_AXIS));

            //hinzufügen der Main Menu Componenten
            System.out.println(DateTime.current()+": füge Main Menu Componenten ein");
            Main_Menu_Panel.add(Main_Menu_Description_Title);
            Main_Menu_Description_Title.setFont(new Font("Serif", Font.BOLD,24));
            Main_Menu_Description_Title.setBackground(Color.black);
            Main_Menu_Description_Title.setAlignmentX(Component.CENTER_ALIGNMENT);
            Main_Menu_Description_Title.setVisible(true);

                //Main Menu Description & Information
                Main_Menu_Panel.add(Main_Menu_Description_Panel);
                Main_Menu_Description_Panel.setBackground(Color.blue);
                Main_Menu_Description_Panel.add(Main_Menu_Description_Text);
                Main_Menu_Description_Text.setFont(new Font("Serif", Font.BOLD,16));
                Main_Menu_Description_Text.setAlignmentX(Component.CENTER_ALIGNMENT);
                Main_Menu_Description_Text.setVisible(true);

                Main_Menu_Description_Panel.add(Main_Menu_Information_Panel);
                Main_Menu_Information_Panel.setLayout(new FlowLayout());
                Main_Menu_Information_Panel.add(Main_Menu_Information_Text);
                Main_Menu_Information_Text.setFont(new Font("Serif", Font.BOLD,16));
                Main_Menu_Information_Text.setBackground(Color.red);
                Main_Menu_Information_Text.setVisible(true);
            System.out.println(DateTime.current()+": Main Menu Componenten eingefügt");
        Main_Menu_Panel.revalidate();
        Main_Menu_Panel.repaint();
        Main_Menu_Panel.setVisible(true);
        refresh();
        System.out.println(DateTime.current()+": Main Menu dem Main Window Center Panel hinzugefügt");
    }
    public void Created_Character_Menu(){
        System.out.println(DateTime.current()+": Öffne Created Characters Menu");
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Created Characters will appear here."));
        setCenterPanel(panel);
    }
    public void Create_Character_Menu(){
        System.out.println(DateTime.current()+": Öffne Create Character Menu");
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Create a new character here."));
        setCenterPanel(panel);
    }
    public void Toggle_Theme(){}
    public void Credits_Menu(){}
}