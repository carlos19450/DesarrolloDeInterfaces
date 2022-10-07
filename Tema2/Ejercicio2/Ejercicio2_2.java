import javax.swing.*;
import java.awt.*;

public class Ejercicio2_2 extends JFrame{
    private Container panel;
    private JButton miboton;
    public Ejercicio2_2() {
        super("Hola");
        miboton = new JButton("Adiós");
        panel = getContentPane();
        panel.add(miboton);

        setSize(200, 100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ejercicio2_2 aplicacion = new Ejercicio2_2();
    }
}
