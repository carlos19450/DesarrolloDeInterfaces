import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Diana extends JFrame {
    JSlider slider = new JSlider(JSlider.CENTER, 0, 100, 25);
    JButton boton = new JButton("Mostrar valor"), botonDialog = new JButton("Volver a empezar");
    JDialog jd = new JDialog(this,"Resultado", true);
    JLabel jlInfo = new JLabel();
    public Diana() {

        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jd.setSize(300, 200);
                jlInfo.setText("Su valor es: " + slider.getValue());
                jd.add(jlInfo);
                jd.add(botonDialog);
                jd.setLocationRelativeTo(null);
                jd.setVisible(true);
            }
        });
        setPreferredSize(new Dimension(960, 150));
        add(slider, BorderLayout.SOUTH);
        add(boton);
        boton.setBounds(350, 800, 150, 100);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        Diana frame = new Diana();
        frame.pack();
        frame.setVisible(true);
    }
}
