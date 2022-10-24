import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;

public class Ejercicio4 extends JFrame {
    private Path personaFichero = Path.of("/home/carpui/Escritorio/formulario.txt");
    private String[] tipoDeJugador = {"arbitro", "entrenador", "tirador", "director"}, tipoDeArma = {"sable", "espada", "florete"};
    private JLabel jLnombre = new JLabel("Nombre"), jLapellidos = new JLabel("Apellidos"), jLtelefono = new JLabel("Numero de telefono"), jLdni = new JLabel("DNI"), jLdireccion = new JLabel("Dirección"), jLcodPostal = new JLabel("Codigo Postal"), jLciudad = new JLabel("Ciudad"), jLnumFederado = new JLabel("Numero de Federado"), jLpassword = new JLabel("Contraseña"), jLconfirmPassword = new JLabel("Confirmar contraseña"), jLtipoJugador = new JLabel("Tipo de jugador"), jLtipoArma = new JLabel("Tipo de arma"), jLcompeticionIndividual = new JLabel("Competicion individual"), jLcompeticionEquipo = new JLabel("Competicion en equipo"), jLsexo = new JLabel("Sexo");
    private JLabel jLnombreErr = new JLabel(), jLapellidosErr = new JLabel(), jLtelefonoErr = new JLabel(), jLdniErr = new JLabel(), jLdireccionErr = new JLabel(), jLcodPostalErr = new JLabel(), jLciudadErr = new JLabel(), jLnumFederadoErr = new JLabel(), jLpasswordErr = new JLabel(), jLconfirmarPasswordErr = new JLabel(), jLcompeticionIndividualErr = new JLabel(), jLcompeticionEquipoErr = new JLabel(), jLsexoErr = new JLabel();
    private TextField tFnombre = new TextField(50), tFapellidos = new TextField(70), tFtelefono = new TextField(30), tFdni = new TextField(30), tFdireccion = new TextField(30), tFcodPostal = new TextField(20), tFciudad = new TextField(30), tFnumFederado = new TextField(30);
    private JCheckBox jChBhombre = new JCheckBox("Hombre"), jChBmujer = new JCheckBox("Mujer"), jChBcompeticionIndividual = new JCheckBox(), jChBcompeticionEquipos = new JCheckBox();
    private JComboBox jCBtipoJugador = new JComboBox(tipoDeJugador), jCBtipoArma = new JComboBox(tipoDeArma);
    private JPasswordField jPpassword = new JPasswordField(), jPconfirmarPassword = new JPasswordField();
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
        //jLabel Error
        add(jLnombreErr);
        add(jLapellidosErr);
        add(jLtelefonoErr);
        add(jLdniErr);
        add(jLdireccionErr);
        add(jLcodPostalErr);
        add(jLciudadErr);
        add(jLnumFederadoErr);
        add(jLsexoErr);
        add(jLpasswordErr);
        add(jLconfirmarPasswordErr);
        add(jLcompeticionIndividualErr);
        add(jLcompeticionEquipoErr);
        //TextField
        add(tFnombre);
        add(tFapellidos);
        add(tFtelefono);
        add(tFdni);
        add(tFdireccion);
        add(tFcodPostal);
        add(tFciudad);
        add(tFnumFederado);
        //JCheckBox
        add(jChBhombre);
        add(jChBmujer);
        add(jCBtipoJugador);
        add(jCBtipoArma);
        add(jChBcompeticionIndividual);
        add(jChBcompeticionEquipos);
        //JPasswordField
        add(jPpassword);
        add(jPconfirmarPassword);
        //JButton
        add(jBboton1);
        jBboton1.addActionListener(new Ejercicio4.OyenteBoton1());
        //Config Jlabel
        jLnombre.setBounds(10   , 50, 50, 20);
        jLapellidos.setBounds(10   , 100, 60, 20);
        jLtelefono.setBounds(10   , 150, 120, 20);
        jLdni.setBounds(10   , 200, 30, 20);
        jLdireccion.setBounds(10   , 250, 65, 20);
        jLcodPostal.setBounds(10   , 300, 100, 20);
        jLciudad.setBounds(10   , 350, 50, 20);
        jLnumFederado.setBounds(10   , 400, 130, 20);
        jLsexo.setBounds(10   , 450, 100, 20);
        jLpassword.setBounds(10   , 500, 100, 20);
        jLconfirmPassword.setBounds(10   , 550, 150, 20);
        jLtipoJugador.setBounds(10   , 600, 100, 20);
        jLtipoArma.setBounds(10   , 650, 100, 20);
        jLcompeticionIndividual.setBounds(10   , 700, 150, 20);
        jLcompeticionEquipo.setBounds(10   , 750, 150, 20);
        //Config Jlabel Error
        jLnombreErr.setBounds(500   , 50, 200, 20);
        jLapellidosErr.setBounds(500   , 100, 200, 20);
        jLtelefonoErr.setBounds(500   , 150, 200, 20);
        jLdniErr.setBounds(500   , 200, 200, 20);
        jLdireccionErr.setBounds(500   , 250, 200, 20);
        jLcodPostalErr.setBounds(500   , 300, 200, 20);
        jLciudadErr.setBounds(500   , 350, 200, 20);
        jLnumFederadoErr.setBounds(500   , 400, 200, 20);
        jLsexoErr.setBounds(500   , 450, 250, 20);
        jLpasswordErr.setBounds(500   , 500, 200, 20);
        jLconfirmarPasswordErr.setBounds(500   , 550, 200, 20);
        jLcompeticionIndividualErr.setBounds(500   , 700, 250, 20);
        jLcompeticionEquipoErr.setBounds(500   , 750, 250, 20);
        //Config Other
        tFnombre.setBounds(150   , 50, 150, 20);
        tFapellidos.setBounds(150   , 100, 280, 20);
        tFtelefono.setBounds(150   , 150, 100, 20);
        tFdni.setBounds(150   , 200, 100, 20);
        tFdireccion.setBounds(150   , 250, 250, 20);
        tFcodPostal.setBounds(150   , 300, 75, 20);
        tFciudad.setBounds(150   , 350, 200, 20);
        tFnumFederado.setBounds(150   , 400, 150, 20);
        jChBhombre.setBounds(80   , 435, 100, 20);
        jChBmujer.setBounds(80   , 460, 100, 20);
        jPpassword.setBounds(150   , 500, 150, 20);
        jPconfirmarPassword.setBounds(150   , 550, 150, 20);
        jCBtipoJugador.setBounds(150   , 600, 100, 20);
        jCBtipoArma.setBounds(150   , 650, 100, 20);
        jChBcompeticionIndividual.setBounds(170   , 700, 150, 20);
        jChBcompeticionEquipos.setBounds(170   , 750, 150, 20);
        //Config button
        jBboton1.setBounds(350   , 800, 150, 100);
        setSize(900, 950);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class OyenteBoton1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            validarSiEsVacio();
        }
    }
    public void validarSiEsVacio() {
        boolean estaTodoCorrecto = true;
        if (tFnombre.getText().isEmpty() || tFapellidos.getText().isEmpty() || tFtelefono.getText().isEmpty() || tFdni.getText().isEmpty() || tFdireccion.getText().isEmpty() || tFcodPostal.getText().isEmpty() || tFciudad.getText().isEmpty() || tFnumFederado.getText().isEmpty() || jChBhombre.getText().isEmpty() && jChBmujer.getText().isEmpty() || jPpassword.getText().isEmpty() || jPpa.getText().isEmpty()) {
            if (tFnombre.getText().isEmpty()) {
                jLnombreErr.setText("Itroduce un nombre.");
                jLnombreErr.setForeground(Color.red);
                jLnombreErr.setVisible(true);
            } else {
                jLnombreErr.setVisible(false);
            }
            if (tFapellidos.getText().isEmpty()) {
                jLapellidosErr.setText("Itroduce tus Apellidos.");
                jLapellidosErr.setForeground(Color.red);
                jLapellidosErr.setVisible(true);
            } else {
                jLapellidosErr.setVisible(false);
            }
            if (tFtelefono.getText().isEmpty()) {
                jLtelefonoErr.setText("Itroduce un telefono.");
                jLtelefonoErr.setForeground(Color.red);
                jLtelefonoErr.setVisible(true);
            } else {
                jLtelefonoErr.setVisible(false);
            }
            if (tFdni.getText().isEmpty()) {
                jLdniErr.setText("Itroduce un DNI.");
                jLdniErr.setForeground(Color.red);
                jLdniErr.setVisible(true);
            } else {
                jLdniErr.setVisible(false);
            }
            if (tFdireccion.getText().isEmpty()) {
                jLdireccionErr.setText("Itroduce tu dirección.");
                jLdireccionErr.setForeground(Color.red);
                jLdireccionErr.setVisible(true);
            } else {
                jLdireccionErr.setVisible(false);
            }
            if (tFcodPostal.getText().isEmpty()) {
                jLcodPostalErr.setText("Itroduce un código postal.");
                jLcodPostalErr.setForeground(Color.red);
                jLcodPostalErr.setVisible(true);
            } else {
                jLcodPostalErr.setVisible(false);
            }
            if (tFciudad.getText().isEmpty()) {
                jLciudadErr.setText("Itroduce una nombre ciudad.");
                jLciudadErr.setForeground(Color.red);
                jLciudadErr.setVisible(true);
            } else {
                jLciudadErr.setVisible(false);
            }
            if (tFnumFederado.getText().isEmpty()) {
                jLnumFederadoErr.setText("Itroduce tu número de federado.");
                jLnumFederadoErr.setForeground(Color.red);
                jLnumFederadoErr.setVisible(true);
            } else {
                jLnumFederadoErr.setVisible(false);
            }
            if (jChBhombre.getText().isEmpty() && jChBmujer.getText().isEmpty()) {
                jLsexoErr.setText("Selecciona por lo menos una casilla.");
                jLsexoErr.setForeground(Color.red);
                jLsexoErr.setVisible(true);
            } else {
                jLsexoErr.setVisible(false);
            }
            if (jPpassword.getText().isEmpty()) {
                jLpasswordErr.setText("Itroduce una contraseña.");
                jLpasswordErr.setForeground(Color.red);
                jLpasswordErr.setVisible(true);
            } else {
                jLpasswordErr.setVisible(false);
            }
            if (jPconfirmarPassword.getText().isEmpty()) {
                jLconfirmarPasswordErr.setText("Itroduce una contraseña.");
                jLconfirmarPasswordErr.setForeground(Color.red);
                jLconfirmarPasswordErr.setVisible(true);
            } else {
                jLconfirmarPasswordErr.setVisible(false);
            }
            if (jChBcompeticionIndividual.getText().isEmpty() && jChBcompeticionEquipos.getText().isEmpty()) {
                jLcompeticionIndividualErr.setText("Selecciona por lo menos una casilla.");
                jLcompeticionIndividualErr.setForeground(Color.red);
                jLcompeticionIndividualErr.setVisible(true);
                jLcompeticionEquipoErr.setText("Selecciona por lo menos una casilla.");
                jLcompeticionEquipoErr.setForeground(Color.red);
                jLcompeticionEquipoErr.setVisible(true);
            } else {
                jLcompeticionIndividualErr.setVisible(false);
                jLcompeticionEquipoErr.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio4 aplicacion = new Ejercicio4();
    }
}
