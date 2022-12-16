import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VentanaPrincipal extends JFrame {
    private JLabel labelTexto = new JLabel("TÍTULO: Actualización del BIOS del sistema de portátiles HP (AMD\n" +
            "Procesadores\n" +
            "VERSIÓN: F.22\n" +
            "DESORIPCIÓN\n" +
            "Este paquete proporciona una actualización del BIOS del sistema,\n" +
            "La actualización se instala en los modelos de portátiles compatibles mediante\n" +
            "un sistema operativo Windows Miarosoft compatible\n" +
            "Reinicie el sistema para completar la instalación.\n" +
            "PROPÓSITO: Recomendado\n" +
            "NÚMERO de SoftPaq: SP91873I\n" +
            "REEMPLAZA: SP74373, Ninguno\n" +
            "FECHA EFECTIVA 9/14/2018\n" +
            "CATEGORÍA: BIOS\n" +
            "COMPATIBLE CON SSM: Sí\n" +
            "TIPO(S) DE PRODUCTO(S):\n" +
            "NotaDooka\n" +
            "MODELO(S) DE PRODUCTO DE HARDWARE:\n" +
            "PC portátil HP 245 G4\n" +
            "Portátil HP (modelos compatibles)\n");
    private JButton botonAceptar = new JButton("Aceptar");
    private JButton botonRechazar = new JButton("Rechazar");

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
        labelTexto.setBounds(350   , 0, 250, 100);
        botonAceptar.setBounds(100   , 630, 200, 100);
        botonRechazar.setBounds(400   , 630, 200, 100);

        setSize(650, 780);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        VentanaPrincipal aplicacion = new VentanaPrincipal();
    }
}
