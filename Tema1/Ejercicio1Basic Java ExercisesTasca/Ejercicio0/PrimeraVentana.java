import javax.swing.*;
import java.awt.*;

public class PrimeraVentana extends JFrame {
    private Icon icon1 = new ImageIcon("/home/carpui/IdeaProjects/DesarrolloDeInterfaces/Tema1/Ejercicio1Basic Java ExercisesTasca/Ejercicio0/img/atras2.jpg");
    private JButton jBboton1 = new JButton();
    public PrimeraVentana() {
        super("Mi primera ventana");
        setLayout(null);
        this.getContentPane().setBackground(Color.orange);
        jBboton1.setIcon(icon1);
        jBboton1.setBounds(50,50,250,250);
        add(jBboton1);
        setSize(600, 600);
        setBackground(new Color(24,54,3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PrimeraVentana();
    }
}