import javax.swing.*;
import java.awt.*;


public class Diana extends JFrame {
    public Diana() {
        JSlider slider = new JSlider(JSlider.CENTER, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel();
        setPreferredSize(new Dimension(960, 80));
        panel.add(slider);
        setLocationRelativeTo(null);
        add(panel);
    }
    public static void main(String[] args) {
        Diana frame = new Diana();
        frame.pack();
        frame.setVisible(true);
    }
}
