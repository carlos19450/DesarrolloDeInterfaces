import javax.swing.*;
import java.awt.*;

public class Celda extends JFrame {
    Coordenadas coord;

    public Celda(Coordenadas coord) {
        this.coord = coord;
        setPreferredSize(new Dimension(50, 50));
        setBackground(Color.WHITE);
    }

    public Celda(JLabel numCelda) {
        setPreferredSize(new Dimension(25, 25));
        numCelda.setFont(new Font("Verdana", Font.BOLD, 22));
        numCelda.setForeground(Color.WHITE);
        add(numCelda);
        setBackground(new Color(120, 118, 118));
    }
}
