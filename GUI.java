import javax.swing.JFrame;
public class GUI extends JFrame{
    private int width;
    private int height;

    public GUI(int w, int h){
        width = w;
        height = h;
    }

    public void setUpGUI(){
        setSize(width, height);
        setTitle("Mein Fenster");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}