import java.awt.*;
import javax.swing.*;

public class Main extends JPanel{
    public static void main(String[] args) {

        JFrame window = new JFrame("Awesome App");
        JPanel panel = new JPanel();

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(800,600);

        window.add(panel);
        window.setLocationRelativeTo(null);

        panel.setBackground(Color.red);
    }
}