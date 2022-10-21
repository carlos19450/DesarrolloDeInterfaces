import javax.swing.*;
import java.awt.*;

/**
 * Clase pp que extiende JFrame.
 */
public class pp extends JFrame {
    /**
     * Constructor de la clase pp.
     */
    public pp () {
        //Titulo para la primera ventana.
        super("Mi primera ventana");
        //Extiende la pantalla a esta resolución.
        setSize(300,300);
        //Pone un color de fondo.
        setBackground(new Color(0, 64, 128));
        //Extiende la pantalla a esta resolución.
        setSize(600, 600);
        //Creación de un boton que poner 'Pulsa aqui'.
        JButton button = new JButton("Pulsa aquí");
        //Modifica la fuente del boton a 'Arial', con un formato plano y una letra de 11px.
        button.setFont(new Font("Arial", Font.PLAIN, 11));
        //Coloca las coordenadas al boton y configura el tamaño.
        button.setBounds(20, 30, 30, 30);
        //Cambia el color de la letra del boton a azul.
        button.setForeground(Color.BLUE);
        //Cambia el color de fondo del boton a blanco.
        button.setBackground(Color.white);
        //Al estar encima del boton sale un texto con inforamción.
        button.setToolTipText("Esto es una prueba");
        //Añade un componente con el boton eextendido.
        getContentPane().add(button, BorderLayout.NORTH);
        //Añade un campo de texto.
        JTextField textField1 = new JTextField();
        //Coloca las coordenadas al campo de texto y configura el tamaño.
        textField1.setBounds(90, 60, 100, 30);
        //Posiciona el contenido del campo a la derecha.
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        //Muestra en el campo de texto 'Y aún otra prueba'.
        textField1.setText("Y aún otra prueba");
        //Cambia el color de fondo del campo de texto a morado.
        textField1.setBackground(Color.pink);
        //Añade el campo de texto.
        add(textField1);
        //Al cerrar la ventana termina el programa.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Muestra la ventana.
        setVisible(true);
    }

    /**
     * Clase principal main del programa.
     * @param args
     */
    public static void main(String[] args) {
        //Crea un onbjeto pp.
        pp i= new pp();
        //Creacion del objeto 'toolkit'.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //Creacion del objeto 'screenSize'.
        Dimension screenSize = toolkit.getScreenSize();
        //Muestra en la ventana 'La resolución de la pantalla es de *resolucion*'
        String resolucion = "La resolución de la pantalla es de " +
                (int)screenSize.getWidth() + " x " +
                (int)screenSize.getHeight();
        //Crea una ventana que muestra un mensaje entregado en el parámetro de mensaje.
        JOptionPane.showMessageDialog(null, resolucion,
                "Resolución de la pantalla",
                JOptionPane.INFORMATION_MESSAGE);
    }
}