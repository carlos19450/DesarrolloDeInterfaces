import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Diana extends JFrame {
    private JFrame frame1 = new JFrame("Información");
    private JSlider slider = new JSlider(JSlider.CENTER, 0, 100, 0);
    private JButton boton = new JButton("Mostrar valor"), botonDialog = new JButton("Volver a empezar"), botonInfo = new JButton("Acerca de");
    private JDialog jd = new JDialog(this,"Resultado", true);
    private JLabel jlInfo = new JLabel(), jlAcercaDe = new JLabel();
    private JCheckBox level1 = new JCheckBox("Nivel 1"), level2 = new JCheckBox("Nivel 2"), level3 = new JCheckBox("Nivel 3");
    private ButtonGroup levelGroup = new ButtonGroup();
    public Diana() {
        getContentPane();
        setLayout(null);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(250, 0, 480, 150);
        boton.setBounds(400, 150, 150, 100);
        botonInfo.setBounds(850, 0, 100, 25);
        level1.setBounds(350, 300, 100, 50);
        level2.setBounds(450, 300, 100, 50);
        level3.setBounds(550, 300, 100, 50);
        add(slider, BorderLayout.SOUTH);
        add(boton);
        add(botonInfo);
        levelGroup.add(level1);
        add(level1);
        levelGroup.add(level2);
        add(level2);
        levelGroup.add(level3);
        add(level3);
        level2.setSelected(true);
        level1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slider.setMinorTickSpacing(1);
                slider.setMajorTickSpacing(25);
                slider.setBounds(425, 0, 96, 150);
            }
        });
        level2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slider.setMinorTickSpacing(1);
                slider.setMajorTickSpacing(25);
                slider.setBounds(250, 0, 480, 150);
            }
        });
        level3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slider.setMinorTickSpacing(1);
                slider.setMajorTickSpacing(25);
                slider.setBounds(0, 0, 940, 150);
            }
        });
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jd.setSize(300, 200);
                jd.setLayout(new GridLayout(2, 1, 10, 10));

                if (slider.getValue() == 50) {
                    jlInfo.setText("¡Enhorabuena, acertaste!");
                    jlInfo.setForeground(Color.red);
                }else if (slider.getValue() > 40 && slider.getValue() < 60) {
                    jlInfo.setText("Ha estado cerca, prueba otra vez");
                    jlInfo.setForeground(Color.orange);
                }else {
                    jlInfo.setText("Su valor es: " + slider.getValue());
                    jlInfo.setForeground(Color.green);
                }
                jd.add(jlInfo);
                botonDialog.addActionListener(new Diana.OyenteBoton());
                jd.add(botonDialog);
                jd.setLocationRelativeTo(null);
                jd.setVisible(true);
            }
        });
        botonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String informacion = "<html>Carlos Expósito<br><br>" +
                        "Elementos usados en esta practica: <br>" +
                        "JFrame -> Para crear esta ventana. <br>" +
                        "JSlider -> Para crear la barra. <br>" +
                        "JButton -> Para crear la interaccion con la barra. <br>" +
                        "JDialog -> Para crear una ventana, diciendo si has acertado o no el número. <br>" +
                        "JLabel -> Para crear comentarios dentro del programa. <br>" +
                        "JCheckBox -> Para implementar los tipos de nivel. <br>" +
                        "ButtonGroup -> Para elegir solo un nivel.</html>";
                jlAcercaDe.setText(informacion);
                frame1.add(jlAcercaDe);
                frame1.setSize(500, 400);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);
            }
        });
        setPreferredSize(new Dimension(960, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class OyenteBoton implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (botonDialog.getText().equals("Volver a empezar")) {
                jd.dispose();
            }
        }
    }
    public static void main(String[] args) {
        Diana frame = new Diana();
        frame.pack();
        frame.setVisible(true);
    }
}
