import javax.swing.*;
import java.awt.*;

public class TableroFrame extends JFrame {
    public Celda[][] celdas;
    private JPanel tableroFrame;

    public TableroFrame() {
        setContentPane(tableroFrame);
        setTitle("BattleShip");
        setSize(450, 300);
        celdas = new Celda[10][10];
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas.length; j++) {
                celdas[i][j] = new Celda(new Coordenadas(i, j));
            }
        }
        Celda[] celdasX = new Celda[10];
        Celda[] celdasY = new Celda[10];
        setLayout(new GridLayout(10, 10, 4, 4));
        for (Celda valorEjeY : celdasY)
            add(valorEjeY);

        for (int i = 0; i < 10; i++) {
            add(celdasX[i]);
            for (Celda agua : celdas[i]) {
                add(agua);
            }
        }
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        TableroFrame aplicacion = new TableroFrame();
    }
}
