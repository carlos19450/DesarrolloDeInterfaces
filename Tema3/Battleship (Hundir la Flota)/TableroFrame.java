import javax.swing.*;

public class TableroFrame extends JFrame {
    private JPanel tableroPanel;
    private JPasswordField passwordField1;
    private JTextField textField1;

    public TableroFrame() {
        setContentPane(tableroPanel);
        setTitle("BattleShip");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        TableroFrame aplicacion = new TableroFrame();
    }
}
