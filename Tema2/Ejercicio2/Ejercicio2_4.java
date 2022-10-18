import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2_4 extends JFrame {
    private TextField tf1 = new TextField(10);
    private TextField tf2 = new TextField(10);
    private final JButton boton1 = new JButton("Celsius -> Farenheit");
    private final JButton boton2 = new JButton("Farenheit -> Celsius");
    private final JButton botonSalir = new JButton("Salir");
    public Ejercicio2_4 () {
        getContentPane();
        add(tf1);
        add(tf2);
        add(boton1);
        add(boton2);
        add(botonSalir);
        setLayout(new GridLayout(3, 2, 20, 20));
        boton1.addActionListener(new OyenteBoton());
        boton2.addActionListener(new OyenteBoton());
        botonSalir.addActionListener(new OyenteBotonSalir());
        setSize(500, 450);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class OyenteBoton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            try {
                Float f1 = new Float(tf1.getText());
                float valor1 = f1.floatValue();
                String s = ae.getActionCommand();
                if(s.equals("Celsius -> Farenheit")) {
                    valor1 = celsiusAFahrenheit(valor1);
                    tf2.setText(("Resultado: "+ valor1));
                }
                else if(s.equals("Farenheit -> Celsius")) {
                    valor1 = fahrenheitACelsius(valor1);
                    tf2.setText(("Resultado: "+ valor1));
                }
            }catch (NumberFormatException e) {
                e.getMessage();
                tf1.setText(("Error introduce un valor numerico."));
                tf2.setText(("Error introduce un valor numerico."));
            }

        }
    }

    class OyenteBotonSalir implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            String f2 = (botonSalir.getText());
            if (f2.equals("Salir")) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio2_4 aplicacion = new Ejercicio2_4();
    }
    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;
    }
}
