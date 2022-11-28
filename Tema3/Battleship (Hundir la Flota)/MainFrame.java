import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JButton salirDelJuegoButton;
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
                BattleShip batalla = new BattleShip();
            }
        });
        salirDelJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        MainFrame aplicacion = new MainFrame();
    }
}
