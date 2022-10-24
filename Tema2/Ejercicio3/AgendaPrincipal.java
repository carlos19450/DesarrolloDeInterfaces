import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AgendaPrincipal  extends JFrame{
    private JFrame frame1 = new JFrame("Añadir personas"), frame2 = new JFrame("Buscar personas"), frame3 = new JFrame("Mostrar personas");
    private Persona person;
    private Path personaFichero = Path.of("C:\\Users\\carlo\\Desktop\\personas.dat");
    private List<Persona> listaPersonas = new ArrayList<>();
    private JLabel jLnombre = new JLabel("Nombre"), jLmail = new JLabel("Mail"), jLfecha = new JLabel("Fecha");
    private JLabel jLnombreErr = new JLabel(), jLmailErr = new JLabel(), jLfechaErr = new JLabel();
    private TextField tFNombre = new TextField(50), tFmail = new TextField(70), tFfecha = new TextField(30), tFNombre2 = new TextField(50), tFmail2 = new TextField(70), tFfecha2 = new TextField(30);
    private final JButton jBboton1 = new JButton("Introducir personas"), jBboton2 = new JButton("Buscar persona"), jBboton3 = new JButton("Crear persona"), jBboton4 = new JButton("Buscar persona");
    private final JButton jBbotonSalir1 = new JButton("Salir"), jBbotonSalir2 = new JButton("Salir"), jBbotonSalir3 = new JButton("Salir"), jBbotonSalir4 = new JButton("Salir");
    public AgendaPrincipal () {
        super("Agenda");
        if (Files.exists(personaFichero)) {
            listaPersonas = cargarListaPersona(personaFichero);
        }
        getContentPane();
        add(jBboton1);
        add(jBboton2);
        add(jBbotonSalir1);
        setLayout(new GridLayout(3, 2, 20, 20));
        jBboton1.addActionListener(new AgendaPrincipal.OyenteBoton1());
        jBboton2.addActionListener(new AgendaPrincipal.OyenteBoton2());
        jBbotonSalir1.addActionListener(new AgendaPrincipal.OyenteBotonSalir1());
        jBbotonSalir2.addActionListener(new AgendaPrincipal.OyenteBotonSalir2());
        jBbotonSalir3.addActionListener(new AgendaPrincipal.OyenteBotonSalir3());
        jBbotonSalir4.addActionListener(new AgendaPrincipal.OyenteBotonSalir4());
        setSize(900, 850);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class OyenteBoton1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
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
            frame1.add(jBbotonSalir2);
            jBboton3.addActionListener(new OyenteBoton3());
            frame1.setSize(1300, 500);
            frame1.setLocationRelativeTo(null);
            frame1.setVisible(true);
        }
    }

    class OyenteBoton2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (listaPersonas.isEmpty()) {
                jBboton2.setEnabled(false);
            }else {
                frame2.setLayout(new FlowLayout());
                frame2.add(jLnombre);
                frame2.add(tFNombre);
                frame2.add(jLnombreErr);
                frame2.add(jBboton4);
                frame2.add(jBbotonSalir3);
                jBboton4.addActionListener(new OyenteBoton4());
                frame2.setSize(1300, 500);
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
            }
        }
    }

    class OyenteBoton3 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (tFNombre.getText().isEmpty() || tFmail.getText().isEmpty() || tFfecha.getText().isEmpty()) {
                if (tFNombre.getText().isEmpty()) {
                    jLnombreErr.setVisible(true);
                    jLnombreErr.setText("Introduce un nombre.");
                    jLnombreErr.setForeground(Color.red);
                }else {
                    jLnombreErr.setVisible(false);
                }
                if (tFmail.getText().isEmpty()) {
                    jLmailErr.setVisible(true);
                    jLmailErr.setText("Introduce un mail.");
                    jLmailErr.setForeground(Color.red);
                }else {
                    jLmailErr.setVisible(false);
                }
                if (tFfecha.getText().isEmpty()) {
                    jLfechaErr.setVisible(true);
                    jLfechaErr.setText("Introduce una fecha con formato dd/MM/yyyy.");
                    jLfechaErr.setForeground(Color.red);
                }else {
                    jLfechaErr.setVisible(false);
                }
            }else {
                jLfechaErr.setVisible(false);
                jLmailErr.setVisible(false);
                jLnombreErr.setVisible(false);
                person = crearPersona(tFNombre.getText(), tFmail.getText(), tFfecha.getText());
                listaPersonas.add(person);
                tFNombre.setText("");
                tFmail.setText("");
                tFfecha.setText("");
                jBboton2.setEnabled(true);
            }
        }
    }
    class OyenteBoton4 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (tFNombre.getText().isEmpty()) {
                jLnombreErr.setVisible(true);
                jLnombreErr.setText("Nombre no permitido.");
                jLnombreErr.setForeground(Color.red);
            }else {
                jLnombreErr.setVisible(false);
                person = buscaPersona(listaPersonas, tFNombre.getText());
                tFNombre.setText("");
                if (person != null) {
                    jLnombreErr.setVisible(false);
                    frame3.setLayout(new FlowLayout());
                    frame3.add(jLnombre);
                    frame3.add(tFNombre2);
                    frame3.add(jLmail);
                    frame3.add(tFmail2);
                    frame3.add(jLfecha);
                    frame3.add(tFfecha2);
                    frame3.add(jBbotonSalir4);
                    tFNombre2.setText(person.getNombre());
                    tFmail2.setText(person.getMail());
                    tFfecha2.setText(person.getAnnoNacimiento());
                    frame3.setSize(1300, 500);
                    frame3.setLocationRelativeTo(null);
                    frame3.setVisible(true);
                }
            }
        }
    }
    class OyenteBotonSalir1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String f2 = (jBbotonSalir1.getText());
            if (f2.equals("Salir")) {
                introducirEnFichero(personaFichero, listaPersonas);
                System.exit(0);
            }
        }
    }
    class OyenteBotonSalir2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String f2 = (jBbotonSalir2.getText());
            if (f2.equals("Salir")) {
                jLfechaErr.setVisible(false);
                jLmailErr.setVisible(false);
                jLnombreErr.setVisible(false);
                frame1.dispose();
            }
        }
    }
    class OyenteBotonSalir3 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String f2 = (jBbotonSalir3.getText());
            if (f2.equals("Salir")) {
                jLnombreErr.setVisible(false);
                frame2.dispose();
            }
        }
    }
    class OyenteBotonSalir4 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String f2 = (jBbotonSalir3.getText());
            if (f2.equals("Salir")) {
                frame3.dispose();
            }
        }
    }
    public List<Persona> cargarListaPersona(Path personaFichero) {
        List<Persona> listaPersonasCargadas = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(personaFichero.toFile());
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            listaPersonasCargadas = (List) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaPersonasCargadas;
    }
    public void introducirEnFichero(Path personaFichero ,List<Persona> listaPersonas) {
        try (FileOutputStream fos = new FileOutputStream(personaFichero.toFile(), true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(listaPersonas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Persona buscaPersona(List<Persona> listaPersonas, String nombre) {
        for (Persona person: listaPersonas) {
            if (person.getNombre().equals(nombre)) {
                return person;
            }else {
                jLnombreErr.setText("Persona no encontrada en la agenda.");
                jLnombreErr.setForeground(Color.red);
                jLnombreErr.setVisible(true);
            }
        }
        return null;
    }
    public Persona crearPersona(String nombre, String mail, String anno) {
        Persona personaCreada = new Persona(nombre,mail,anno);
        return personaCreada;
    }
    public static void main(String[] args) {
        AgendaPrincipal aplicacion = new AgendaPrincipal();
    }
}


