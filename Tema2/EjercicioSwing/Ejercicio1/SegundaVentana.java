import javax.swing.*;

public class SegundaVentana extends JFrame {
    public SegundaVentana () {
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SegundaVentana();
    }
}