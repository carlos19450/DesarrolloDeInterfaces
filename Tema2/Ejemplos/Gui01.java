import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui01 extends JFrame {
    private Container panel;
    private JButton miboton;

    public Gui01() {
        super("Ejemplo 01 con botón");
        //Componentes
        JFrame ventana = new JFrame("Ventana que se cierra");
        ventana.addWindowListener(new EscuchadorVentanaAdaptado());
        miboton = new JButton("Aceptar");
        miboton.addActionListener(new EscuchadoraBoton());
        setLayout(new FlowLayout());
        panel = getContentPane();
        panel.add(miboton);

        setSize(200, 100);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Gui01 aplicacion = new Gui01();
    }
}

