import javax.swing.*;
import java.awt.*;

public class Reproductor extends JFrame {
    private JPanel jLpanel1 = new JPanel();
    public Reproductor() {
        add(jLpanel1);
        jLpanel1.setBackground(Color.gray);
        setSize(900, 950);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Reproductor aplicacion = new Reproductor();
    }
}
