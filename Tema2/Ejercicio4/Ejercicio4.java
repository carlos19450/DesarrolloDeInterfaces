import javax.swing.*;
import java.awt.*;

public class Ejercicio4 extends JFrame {
    private JLabel jLnombre = new JLabel("Nombre"), jLapellidos = new JLabel("Apellidos"), jLtelefono = new JLabel("Numero de telefono"), jLdni = new JLabel("DNI"), jLdireccion = new JLabel("Dirección"), jLcodPostal = new JLabel("Codigo Postal"), jLciudad = new JLabel("Ciudad"), jLnumFederado = new JLabel("Numero de Federado"), jLpassword = new JLabel("Contraseña"), jLconfirmPassword = new JLabel("Confirmar contraseña"), jLtipoJugador = new JLabel("Tipo de jugador"), jLtipoArma = new JLabel("Tipo de arma"), jLcompeticionIndividual = new JLabel("Competicion individual"), jLcompeticionEquipo = new JLabel("Competicion en equipo");
    private TextField tFnombre = new TextField(50), tFapellidos = new TextField(70), tFtelefono = new TextField(30), tFdni = new TextField(30), tFdireccion = new TextField(30), tFcodigoPostal = new TextField(20), tFciudad = new TextField(30), tFnumFederado = new TextField(30);
    private JCheckBox jCBhombre = new JCheckBox("Hombre"), jCBmujer = new JCheckBox("Mujer"), jCBtipoJugador = new JCheckBox(), jCBtipoArma = new JCheckBox(), jCBcompeticionIndividual = new JCheckBox(), jCBcompeticionEquipos = new JCheckBox();
    private JPasswordField jPcontrasenna = new JPasswordField(), jPconfirmarContrasenna = new JPasswordField();
    private JButton jBboton1 = new JButton("Guardar");

    public Ejercicio4 () {
        super("Agenda");
        getContentPane();
        setLayout(null);
        //jLabel
        add(jLnombre);
        add(jLapellidos);
        add(jLtelefono);
        add(jLdni);
        add(jLdireccion);
        add(jLcodPostal);
        add(jLciudad);
        add(jLnumFederado);
        add(jLpassword);
        add(jLconfirmPassword);
        add(jLtipoJugador);
        add(jLtipoArma);
        add(jLcompeticionIndividual);
        add(jLcompeticionEquipo);
        //TextField
        add(tFnombre);
        add(tFapellidos);
        add(tFtelefono);
        add(tFdni);
        add(tFdireccion);
        add(tFcodigoPostal);
        add(tFciudad);
        add(tFnumFederado);
        //JCheckBox
        add(jCBhombre);
        add(jCBmujer);
        add(jCBtipoJugador);
        add(jCBtipoArma);
        add(jCBcompeticionIndividual);
        add(jCBcompeticionEquipos);
        //JPasswordField
        add(jPcontrasenna);
        add(jPconfirmarContrasenna);
        //JButton
        add(jBboton1);
        //Config Jlabel
        jLnombre.setBounds(10   , 50, 50, 20);
        jLapellidos.setBounds(10   , 100, 60, 20);
        jLtelefono.setBounds(10   , 150, 120, 20);
        jLdni.setBounds(10   , 200, 30, 20);
        jLdireccion.setBounds(10   , 250, 65, 20);
        jLcodPostal.setBounds(10   , 300, 100, 20);
        jLciudad.setBounds(10   , 350, 50, 20);
        jLnumFederado.setBounds(10   , 400, 130, 20);
        jLpassword.setBounds(10   , 500, 100, 20);
        jLconfirmPassword.setBounds(10   , 550, 150, 20);
        jLtipoJugador.setBounds(10   , 600, 100, 20);
        jLtipoArma.setBounds(10   , 650, 100, 20);
        jLcompeticionIndividual.setBounds(10   , 700, 150, 20);
        jLcompeticionEquipo.setBounds(10   , 750, 150, 20);
        //Config Other
        tFnombre.setBounds(10   , 50, 100, 20);
        tFnombre.setBackground(Color.red);
        tFapellidos.setBounds(10   , 100, 100, 20);
        tFtelefono.setBounds(10   , 150, 150, 20);
        tFdni.setBounds(10   , 200, 200, 20);
        tFdireccion.setBounds(10   , 250, 100, 20);
        tFcodigoPostal.setBounds(10   , 300, 100, 20);
        tFciudad.setBounds(10   , 350, 100, 20);
        tFnumFederado.setBounds(10   , 400, 150, 20);
        jCBhombre.setBounds(60   , 450, 100, 20);
        jCBmujer.setBounds(100   , 490, 100, 20);
        jPcontrasenna.setBounds(10   , 500, 100, 20);
        jPconfirmarContrasenna.setBounds(10   , 550, 150, 20);
        jCBtipoJugador.setBounds(10   , 600, 100, 20);
        jCBtipoArma.setBounds(10   , 650, 100, 20);
        jCBcompeticionIndividual.setBounds(10   , 700, 150, 20);
        jCBcompeticionEquipos.setBounds(10   , 750, 150, 20);
        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ejercicio4 aplicacion = new Ejercicio4();
    }
}
