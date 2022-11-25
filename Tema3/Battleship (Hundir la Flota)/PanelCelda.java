import javax.swing.*;
import java.awt.*;

public class PanelCelda extends JPanel {
    Coordenadas coord;

    public PanelCelda(Coordenadas coord) {
        this.coord = coord;
        setPreferredSize(new Dimension(50, 50));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        setBackground(Color.WHITE);
    }
}
