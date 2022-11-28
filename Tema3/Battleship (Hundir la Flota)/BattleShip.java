import javax.swing.*;

public class BattleShip extends JPanel {
    private Tablero tablero1;
    private final ConfiguracionBarcos crearBarcos;

    public BattleShip() {
        tablero1 = new Tablero();
        crearBarcos = new ConfiguracionBarcos(null, tablero1);
    }
}
