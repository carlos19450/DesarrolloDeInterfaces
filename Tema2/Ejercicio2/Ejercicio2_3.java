import javax.swing.*;
import java.awt.*;

public class Ejercicio2_3 extends JFrame{
    private Container panel;
    private TextField miField;
    public Ejercicio2_3() {
        super("Prueba");
        miField = new TextField("Introduce un texto");
        panel = getContentPane();
        panel.add(miField);

        setSize(200, 100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ejercicio2_3 aplicacion = new Ejercicio2_3();
    }
}
