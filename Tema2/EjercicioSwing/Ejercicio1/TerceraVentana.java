import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class TerceraVentana extends JFrame {
    public TerceraVentana () throws IOException {
        super("Mi primera ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("/home/carpui/Descargas/maxresdefault.jpg")))));
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new TerceraVentana();
    }
}
