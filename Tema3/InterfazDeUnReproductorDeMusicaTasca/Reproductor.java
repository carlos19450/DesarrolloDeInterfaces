import javax.swing.*;
import java.awt.*;

public class Reproductor extends JFrame {
    private JPanel jLpanel1 = new JPanel();
    private JButton jBboton1 = new JButton(),  jBboton2 = new JButton(),  jBboton3 = new JButton(),  jBboton4 = new JButton(),  jBboton5 = new JButton(),  jBboton6 = new JButton(),  jBboton7 = new JButton(),  jBboton8 = new JButton(),  jBboton9 = new JButton();
    public Reproductor() {
        jLpanel1.setLayout(new GridLayout(3, 3, 10, 10));
        jLpanel1.add(jBboton1);
        jLpanel1.add(jBboton2);
        jLpanel1.add(jBboton3);
        jLpanel1.add(jBboton4);
        jLpanel1.add(jBboton5);
        jLpanel1.add(jBboton6);
        jLpanel1.add(jBboton7);
        jLpanel1.add(jBboton8);
        jLpanel1.add(jBboton9);
        jLpanel1.setBackground(Color.gray);
        add(jLpanel1);
        setSize(900, 950);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Reproductor aplicacion = new Reproductor();
    }
}
