import Util.DateTime;
import Util.MainWindow;
import javax.swing.SwingUtilities;

import Util.MainWindow;
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
// !DO NOT DELETE!(Might reuse later)
// import java.awt.*;import javax.swing.*;import java.io.*;public class Main{JFrame mainframe = new JFrame("Informatik Java Projekt");JPanel mainmenu = new JPanel();JLabel title = new JLabel("Mein Informatik Java Projekt");public void main(String[] args){MainMenu();}public void MainMenu(){System.out.println("Opened Main Menu");mainframe.setSize(1920,1080);mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);mainframe.setVisible(true);mainframe.add(mainmenu);mainmenu.setLayout(new BoxLayout(mainmenu, BoxLayout.Y_AXIS));JPanel header = new JPanel();header.setBackground(Color.green);header.add(title);header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));title.setFont(new Font("Arial", Font.PLAIN,50));mainmenu.add(header);header.setVisible(true);JPanel body = new JPanel();body.setBackground(Color.magenta);body.setLayout(new BoxLayout(body, BoxLayout.X_AXIS));body.setAlignmentX(1);mainmenu.add(body);body.setVisible(true);body.setAlignmentX(Component.LEFT_ALIGNMENT);header.setAlignmentX(Component.CENTER_ALIGNMENT);JButton Button = new JButton("This is the hardest button to button!");Button.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){System.out.println("You clicked the hardest button to button!");}});body.add(Button);}public void SettingsMenu(){System.out.println("Opened Settings Menu");}public void PauseMenu(){System.out.println("Opened Pause Menu");}public void CharacterCreationMenu(){System.out.println("Opened Character Creation Menu");}}