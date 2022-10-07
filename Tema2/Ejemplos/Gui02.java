import javax.swing.*;
import java.awt.*;

public class Gui02 extends JFrame {
    private Container panel;
    private JButton miboton, miboton2;

    public Gui02() {
        super("Ejemplo 01 con botón");
        //Componentes
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        for(int i = 1; i <= 10; i++)
            add(new JButton("HOLA "+ i));
        setSize(900, 100);
        setLocationRelativeTo(null);
        setLocation(2,5);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui02 aplicacion = new Gui02();
    }
}


