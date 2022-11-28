import javax.swing.*;
import java.awt.*;

public class PanelTablero extends JPanel {
    public PanelCelda[][] celdas;
    private Tablero tab;
    public PanelTablero(Tablero tab) {
        this.tab = tab;
        celdas = new PanelCelda[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                celdas[i][j] = new PanelCelda(new Coordenadas(i, j));
            }
        }
        setLayout(new GridLayout(10, 10));
        for (int i = 0; i < 10; i++) {
            for (PanelCelda agua : celdas[i]) {
                add(agua);
            }
        }
    }

    public void setTableroModelo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (tab.getTablero()[i][j]) {
                    case 0: //Casilla sin desvelar
                        celdas[i][j].setBackground(Color.WHITE);
                        break;
                    case 1: //Barco
                        celdas[i][j].setBackground(Color.DARK_GRAY);
                        break;
                    case 2: //Barco Tocado
                        celdas[i][j].setBackground(Color.RED);
                        break;
                    case 3: //Agua/Disparo fallido
                        celdas[i][j].setBackground(Color.CYAN);
                        break;
                }
            }
        }
    }
}
