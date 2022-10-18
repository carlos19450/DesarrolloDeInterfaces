import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaPrincipal  extends JFrame{
    private boolean correcto;
    private String opc, nombre, mail, fechaNacimiento;
    private JLabel jLnombre = new JLabel("Nombre"), jLmail = new JLabel("Mail"), jLfecha = new JLabel("Fecha");
    private JLabel jLnombreErr = new JLabel(), jLmailErr = new JLabel(), jLfechaErr = new JLabel();
    private TextField tFNombre = new TextField(50), tFmail = new TextField(70), tFfecha = new TextField(30);
    private final JButton jBboton1 = new JButton("Introducir personas"), jBboton2 = new JButton("Buscar personas"), jBboton3 = new JButton("Crear persona");
    private final JButton jBbotonSalir = new JButton("Salir");
    public AgendaPrincipal () {
        super("Agenda");
        correcto = true;
        getContentPane();
        add(jBboton1);
        add(jBboton2);
        add(jBbotonSalir);
        setLayout(new GridLayout(3, 2, 20, 20));
        jBboton1.addActionListener(new AgendaPrincipal.OyenteBoton1());
        jBboton2.addActionListener(new AgendaPrincipal.OyenteBoton2());
        jBbotonSalir.addActionListener(new AgendaPrincipal.OyenteBotonSalir());
        setSize(900, 850);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class OyenteBoton1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            do {
                correcto = true;
                JFrame frame1 = new JFrame("Añadir personas");
                frame1.setLayout(new FlowLayout());

                frame1.add(jLnombre);
                frame1.add(tFNombre);
                frame1.add(jLnombreErr);
                frame1.add(jLmail);
                frame1.add(tFmail);
                frame1.add(jLmailErr);
                frame1.add(jLfecha);
                frame1.add(tFfecha);
                frame1.add(jLfechaErr);
                frame1.add(jBboton3);

                jBboton3.addActionListener(new OyenteBoton3());

                frame1.setSize(1300, 500);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }while (!correcto);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    }

    class OyenteBoton2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            JFrame frame2 = new JFrame("Buscar personas");
            frame2.setSize(900, 850);
            frame2.setLocationRelativeTo(null);
            frame2.setVisible(true);
        }
    }

    class OyenteBoton3 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (tFNombre.getText().isEmpty() || tFmail.getText().isEmpty() || tFfecha.getText().isEmpty()) {
                if (tFNombre.getText().isEmpty()) {
                    jLnombreErr.setVisible(true);
                    correcto = false;
                    jLnombreErr.setText("Nombre no permitido.");
                    jLnombreErr.setForeground(Color.red);
                }else {
                    jLnombreErr.setVisible(false);
                }
                if (tFmail.getText().isEmpty()) {
                    jLmailErr.setVisible(true);
                    correcto = false;
                    jLmailErr.setText("Mail no permitido.");
                    jLmailErr.setForeground(Color.red);
                }else {
                    jLmailErr.setVisible(false);
                }
                if (tFfecha.getText().isEmpty()) {
                    jLfechaErr.setVisible(true);
                    correcto = false;
                    jLfechaErr.setText("Fecha no permitida.");
                    jLfechaErr.setForeground(Color.red);
                }else {
                    jLfechaErr.setVisible(false);
                }
            }else {
                correcto = true;
                jLfechaErr.setVisible(false);
                jLmailErr.setVisible(false);
                jLnombreErr.setVisible(false);
            }
        }
    }

    class OyenteBotonSalir implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String f2 = (jBbotonSalir.getText());
            if (f2.equals("Salir")) {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        AgendaPrincipal aplicacion = new AgendaPrincipal();
    }
}


