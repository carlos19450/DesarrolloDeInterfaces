import javax.swing.*;
import java.awt.*;

public class PrimeraVentana extends JFrame {
    public PrimeraVentana () {
        super("Mi primera ventana");
        setSize(300,100);
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new PrimeraVentana();
    }
}
