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
    private JFrame frame2 = new JFrame();

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
            "Portátil HP (modelos compatibles)</body></html>");
    private JLabel labelTexto1 = new JLabel("This is the HP BIOS update and recovery utility. It can:");
    private JLabel labelTexto2 = new JLabel("<html><body>1.Update the system BIOS on this device.<br><br>" +
            "2.Create a recovery USB flash drive to use on devices with<br>computed BIOS<br><br>" +
            "3.Copy the BIOS image in order to use it on other devices.</body></html>");
    private JLabel labelTexto3 = new JLabel("Software instalado con exito, gracias por confiar en troyan.es ahora todo su dinero de su cuenta banciaria con IBAN: ES2820958297603648596978 va a ser retirado de su cuenta. Gracias.");
    private JButton botonAceptar = new JButton("Aceptar");
    private JButton botonRechazar = new JButton("Cancelar");
    private JButton botonAceptar2 = new JButton("Seguir");
    private JButton botonRechazar2 = new JButton("Salir");
    //Ventana 1
    public VentanaPrincipal() {
        super("No es un VIRUS");
        getContentPane();
        setLayout(null);
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(new File("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema4\\Proceso de instalacion\\img\\aaa.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        //Añadir
        add(picLabel);
        add(labelTexto);
        add(botonAceptar);
        add(botonRechazar);
        //Posicionar
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
    //ActionListener para parar el programa
    class OyenteBoton1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    }
    //Ventana 2
    class OyenteBoton2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            dispose();
            frame1.getContentPane();
            frame1.setLayout(null);
            BufferedImage myPicture2 = null;
            try {
                myPicture2 = ImageIO.read(new File("C:\\Users\\carlo\\IdeaProjects\\DesarrolloDeInterfaces\\Tema4\\Proceso de instalacion\\img\\hp.jpg"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            JLabel picLabel2 = new JLabel(new ImageIcon(myPicture2));
            //Añadir
            frame1.add(picLabel2);
            frame1.add(labelTexto1);
            frame1.add(labelTexto2);
            frame1.add(botonAceptar2);
            frame1.add(botonRechazar2);
            //Posicionar
            picLabel2.setBounds(0   , -270, 520, 600);
            labelTexto1.setBounds(50   , 50, 320, 300);
            labelTexto2.setBounds(100   , 150, 320, 300);
            botonAceptar2.setBounds(100   , 400, 100, 50);
            botonRechazar2.setBounds(300   , 400, 100, 50);

            botonRechazar2.addActionListener(new VentanaPrincipal.OyenteBoton1());
            botonAceptar2.addActionListener(new VentanaPrincipal.OyenteBoton3());
            frame1.setSize(500, 550);
            frame1.setLocationRelativeTo(null);
            frame1.setVisible(true);
        }
    }
    //Ventana 3
    class OyenteBoton3 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            frame1.dispose();
            frame2.getContentPane();
            frame2.setLayout(null);
            //Añadir
            frame2.add(labelTexto3);
            frame2.add(botonAceptar);
            //Posicionar
            labelTexto3.setBounds(0   , 0, 1500, 50);
            botonAceptar.setBounds(1080   , 0, 85, 50);
            botonAceptar.addActionListener(new VentanaPrincipal.OyenteBoton1());
            frame2.setSize(1200, 100);
            frame2.setLocationRelativeTo(null);
            frame2.setVisible(true);
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal aplicacion = new VentanaPrincipal();
    }
}
