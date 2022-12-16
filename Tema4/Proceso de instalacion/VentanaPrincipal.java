import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VentanaPrincipal extends JFrame {
    private JFrame frame1 = new JFrame();
    private JLabel labelTexto = new JLabel("<html><body>TÍTULO: Actualización del BIOS del sistema de portátiles HP (AMD<br>" +
            "Procesadores<br>" +
            "VERSIÓN: F.22<br>" +
            "DESORIPCIÓN<br>" +
            "Este paquete proporciona una actualización del BIOS del sistema,<br>" +
            "La actualización se instala en los modelos de portátiles compatibles mediante<br>" +
            "un sistema operativo Windows Miarosoft compatible<br>" +
            "Reinicie el sistema para completar la instalación.<br>" +
            "PROPÓSITO: Recomendado<br>" +
            "NÚMERO de SoftPaq: SP91873I<br>" +
            "REEMPLAZA: SP74373, Ninguno<br>" +
            "FECHA EFECTIVA 9/14/2018<br>" +
            "CATEGORÍA: BIOS<br>" +
            "COMPATIBLE CON SSM: Sí<br>" +
            "TIPO(S) DE PRODUCTO(S):<br>" +
            "NotaDooka<br>" +
            "MODELO(S) DE PRODUCTO DE HARDWARE:<br>" +
            "PC portátil HP 245 G4<br>" +
            "Portátil HP (modelos compatibles)<br></body></html>");
    private JButton botonAceptar = new JButton("Aceptar");
    private JButton botonRechazar = new JButton("Cancelar");

    public VentanaPrincipal() {
        super("No es un VIRUS");
        getContentPane();
        setLayout(null);
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("/home/carpui/IdeaProjects/DesarrolloDeInterfaces/Tema4/Proceso de instalacion/img/aaa.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        add(picLabel);
        add(labelTexto);
        add(botonAceptar);
        add(botonRechazar);

        picLabel.setBounds(0   , 0, 320, 600);
        labelTexto.setBounds(350   , 0, 250, 500);
        botonAceptar.setBounds(100   , 630, 100, 50);
        botonRechazar.setBounds(400   , 630, 100, 50);

        botonRechazar.addActionListener(new VentanaPrincipal.OyenteBoton1());
        botonAceptar.addActionListener(new VentanaPrincipal.OyenteBoton2());

        setSize(650, 740);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class OyenteBoton1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    }

    class OyenteBoton2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            BufferedImage myPicture = null;
            try {
                myPicture = ImageIO.read(new File("/home/carpui/IdeaProjects/DesarrolloDeInterfaces/Tema4/Proceso de instalacion/img/hp.jpg"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            frame1.add(picLabel);
            frame1.setSize(650, 740);
            frame1.setLocationRelativeTo(null);
            frame1.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal aplicacion = new VentanaPrincipal();
    }
}
