import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JFrame frame1 = new JFrame("Batalla");
    private JPanel mainPanel;
    private JButton reanudarElJuegoButton;
    private JButton empezarElJuegoButton;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("BattleShip");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        empezarElJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableroFrame tablero = new TableroFrame();
            }
        });
    }

    public static void main(String[] args) {
        MainFrame aplicacion = new MainFrame();
    }
}
