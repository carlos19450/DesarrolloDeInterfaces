import javax.swing.*;
import java.awt.*;

public class Celda extends JFrame {
    Coordenadas coord;

    public Celda(Coordenadas coord) {
        System.out.println(coord.y);
        this.coord = coord;
        setPreferredSize(new Dimension(50, 50));
        BorderFactory.createLineBorder(Color.BLACK, 4, true);
        setBackground(Color.WHITE);
    }
}
