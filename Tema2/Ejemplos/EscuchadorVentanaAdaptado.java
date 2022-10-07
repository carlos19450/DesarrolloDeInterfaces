import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EscuchadorVentanaAdaptado extends WindowAdapter {
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Adios");
        System.exit(0);
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Hola");
        System.exit(0);
    }
}
