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
        setTitle("Hola");
        setSize(450, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        empezarElJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.setSize(1300, 500);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        MainFrame aplicacion = new MainFrame();
    }
}
