import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class Reproductor extends JFrame {
    private JPanel jLpanel1 = new JPanel();
    private Icon icon1 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\on_off.jpg"),icon2 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\play.jpg"),icon3 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\record.jpg"), icon4 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\pis_ant.jpg"), icon5 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\pause.jpg"), icon6 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\pis_post.jpg"), icon7 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\atras.jpg"), icon8 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\stop.jpg"), icon9 = new ImageIcon("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema3\\Imagenes\\delante.jpg");
    private JButton jBboton1 = new JButton(),  jBboton2 = new JButton(),  jBboton3 = new JButton(),  jBboton4 = new JButton(),  jBboton5 = new JButton(),  jBboton6 = new JButton(),  jBboton7 = new JButton(),  jBboton8 = new JButton(),  jBboton9 = new JButton();
    public Reproductor() {
        jLpanel1.setLayout(new GridLayout(3, 3));
        jBboton1.setIcon(icon1);
        jBboton1.setFocusable(false);
        jBboton1.setBackground(Color.decode("#e4ecec"));
        jBboton2.setIcon(icon2);
        jBboton2.setFocusable(false);
        jBboton2.setBackground(Color.decode("#e4ecec"));
        jBboton3.setIcon(icon3);
        jBboton3.setFocusable(false);
        jBboton3.setBackground(Color.decode("#e4ecec"));
        jBboton4.setIcon(icon4);
        jBboton4.setFocusable(false);
        jBboton4.setBackground(Color.decode("#e4ecec"));
        jBboton5.setIcon(icon5);
        jBboton5.setFocusable(false);
        jBboton5.setBackground(Color.decode("#e4ecec"));
        jBboton6.setIcon(icon6);
        jBboton6.setFocusable(false);
        jBboton6.setBackground(Color.decode("#e4ecec"));
        jBboton7.setIcon(icon7);
        jBboton7.setFocusable(false);
        jBboton7.setBackground(Color.decode("#e4ecec"));
        jBboton8.setIcon(icon8);
        jBboton8.setFocusable(false);
        jBboton8.setBackground(Color.decode("#e4ecec"));
        jBboton9.setIcon(icon9);
        jBboton9.setFocusable(false);
        jBboton9.setBackground(Color.decode("#e4ecec"));
        jLpanel1.add(jBboton1);
        jLpanel1.add(jBboton2);
        jLpanel1.add(jBboton3);
        jLpanel1.add(jBboton4);
        jLpanel1.add(jBboton5);
        jLpanel1.add(jBboton6);
        jLpanel1.add(jBboton7);
        jLpanel1.add(jBboton8);
        jLpanel1.add(jBboton9);
        jLpanel1.setBackground(Color.gray);
        add(jLpanel1);
        setSize(900, 950);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Reproductor aplicacion = new Reproductor();
    }
}
