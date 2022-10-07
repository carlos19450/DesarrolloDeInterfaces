import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio2_1 extends JFrame {
    private int numVentanas;
    public Ejercicio2_1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuatas ventanas quieres crear?");
        numVentanas = sc.nextInt();

        for (int i = 0; i < numVentanas; i++) {
            JFrame frame = new JFrame();
            frame.setBounds(numAleatorio(), numAleatorio(), numAleatorio(), numAleatorio());
            frame.getContentPane().setBackground(Color.getHSBColor(numAleatorio(),numAleatorio(),numAleatorio()));
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }
    public int numAleatorio() {
        int numRandom;
        numRandom = (int) (Math.random()*800);
        return numRandom;
    }
    public static void main(String[] args) {
        Ejercicio2_1 aplicacion = new Ejercicio2_1();
    }
}
