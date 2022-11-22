import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JFrame {
    public Celda[][] celdas;

    public PanelTablero() {
        celdas = new Celda[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                celdas[i][j] = new Celda(new Coordenadas(i, j));

        Celda[] celdasX = new Celda[8];
        Celda[] celdasY = new Celda[8];
        for (int i = 0; i < 8; i++) {
            celdasX[i] = new Celda(new JLabel(Integer.toString(i)));
            celdasY[i] = new Celda(new JLabel(Integer.toString(i)));
        }
        setLayout(new GridLayout(9, 9, 4, 4));

        add(new JPanel());
        for (Celda valorEjeY : celdasY)
            add(valorEjeY);

        for (int i = 0; i < 8; i++) {
            add(celdasX[i]);
            for (Celda agua : celdas[i]) {
                add(agua);
            }
        }
    }

    public static void main(String[] args) {
        PanelTablero aplicacion = new PanelTablero();
    }
}