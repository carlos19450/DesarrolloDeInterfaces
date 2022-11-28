import javax.swing.*;

public class BattleShip extends JFrame {
    private Tablero tablero1;
    private ConfiguracionBarcos crearBarcos;

    public BattleShip() {
        setSize(850, 850);
        tablero1 = new Tablero();
        crearBarcos = new ConfiguracionBarcos(tablero1);
        add(crearBarcos);
        setVisible(true);
    }
}
