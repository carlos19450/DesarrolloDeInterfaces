import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Diana extends JFrame {
    private JSlider slider = new JSlider(JSlider.CENTER, 0, 100, 25);
    private JButton boton = new JButton("Mostrar valor"), botonDialog = new JButton("Volver a empezar");
    private JDialog jd = new JDialog(this,"Resultado", true);
    private JLabel jlInfo = new JLabel();
    private JCheckBox level1 = new JCheckBox("Nivel 1"), level2 = new JCheckBox("Nivel 3"), level3 = new JCheckBox("Nivel 3");
    private ButtonGroup levelGroup = new ButtonGroup();
    public Diana() {
        getContentPane();
        setLayout(new GridLayout(5, 1, 10, 10));
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(slider, BorderLayout.SOUTH);
        add(boton);
        levelGroup.add(level1);
        add(level1);
        levelGroup.add(level2);
        add(level2);
        levelGroup.add(level3);
        add(level3);
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
        boton.setBounds(350, 800, 150, 100);
        setPreferredSize(new Dimension(960, 450));
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
