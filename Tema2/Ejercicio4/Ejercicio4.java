import javax.swing.*;
import java.awt.*;

public class Ejercicio4 extends JFrame {
    private JLabel jLnombre = new JLabel("Nombre"), jLapellidos = new JLabel("Apellidos"), jLtelefono = new JLabel("Numero de telefono"), jLdni = new JLabel("DNI"), jLdireccion = new JLabel("Dirección"), jLcodPostal = new JLabel("Codigo Postal"), jLciudad = new JLabel("Ciudad"), jLnumFederado = new JLabel("Numero de Federado"), jLsexo = new JLabel("Sexo"), jLpassword = new JLabel("Contraseña"), jLconfirmPassword = new JLabel("Confirmar contraseña"), jLtipoJugador = new JLabel("Tipo de jugador"), jLtipoArma = new JLabel("Tipo de arma"), jLcompeticionIndividual = new JLabel("Competicion individual"), jLcompeticionEquipo = new JLabel("Competicion en equipo");
    private TextField tFnombre = new TextField(50), tFapellidos = new TextField(70), tFtelefono = new TextField(30), tFdni = new TextField(30), tFdireccion = new TextField(30), tFcodigoPostal = new TextField(20), tFciudad = new TextField(30), tFnumFederado = new TextField(30);
    private JCheckBox jCBhombre = new JCheckBox(), jCBmujer = new JCheckBox(), jCBtipoJugador = new JCheckBox(), jCBtipoArma = new JCheckBox(), jCBcompeticionIndividual = new JCheckBox(), jCBcompeticionEquipos = new JCheckBox();
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
        add(jLsexo);
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
        //Config
        jLnombre.setBounds(10   , 50, 100, 20);
        jLapellidos.setBounds(10   , 100, 100, 20);
        jLtelefono.setBounds(10   , 150, 150, 20);
        jLdni.setBounds(10   , 200, 200, 20);
        jLdireccion.setBounds(10   , 250, 100, 20);
        jLcodPostal.setBounds(10   , 300, 100, 20);
        jLciudad.setBounds(10   , 350, 100, 20);
        jLnumFederado.setBounds(10   , 400, 150, 20);
        jLsexo.setBounds(10   , 450, 100, 20);
        jLpassword.setBounds(10   , 500, 100, 20);
        jLconfirmPassword.setBounds(10   , 550, 150, 20);
        jLtipoJugador.setBounds(10   , 600, 100, 20);
        jLtipoArma.setBounds(10   , 650, 100, 20);
        jLcompeticionIndividual.setBounds(10   , 700, 150, 20);
        jLcompeticionEquipo.setBounds(10   , 750, 150, 20);

        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Ejercicio4 aplicacion = new Ejercicio4();
    }
}
