import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfiguracionBarcos extends JDialog{
    private Tablero tablero;
    private int maxBarcos;
    private PanelTablero panelTablero;
    private JComboBox<String> listaBarcos;
    private JButton botonTerminar;
    private JButton botonCancelar;

    public ConfiguracionBarcos(Frame parent, Tablero tablero) {
        super(parent);
        this.tablero = tablero;
        maxBarcos = 5;
        setLayout(new BorderLayout());
        add(new PrimerPanel(), BorderLayout.NORTH);
        add(new SegundoPanel(), BorderLayout.CENTER);
        add(new TercerPanel(), BorderLayout.SOUTH);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private class PrimerPanel extends JPanel {
        public PrimerPanel() {
            String[] lista = new String[] {"Aircraft Carrier", "Battleship",
                    "Submarine", "Cruiser", "Destroyer"};
            listaBarcos = new JComboBox<String>(lista);
            add(listaBarcos);
            setBorder(BorderFactory.createTitledBorder("Selecciona el tipo de Barco y pulsa una casilla para colocarlo"));

        }
    }

    private class SegundoPanel extends JPanel {
        public SegundoPanel() {
            panelTablero = new PanelTablero(tablero);
            panelTablero.setTableroModelo();
            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++)
                    panelTablero.celdas[i][j].addMouseListener(new ClickCelda());
            add(panelTablero);
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(20, 20, 20, 20),
                    BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        }
    }

    private class TercerPanel extends JPanel {
        public TercerPanel() {
            botonTerminar = new JButton("Terminar");
            botonTerminar.setEnabled(false);
            botonCancelar = new JButton("Cancelar");
            botonCancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    cerrarDialogo();
                }
            });
            JPanel panelTerminar = new JPanel();
            panelTerminar.add(botonTerminar);
            JPanel panelCancelar = new JPanel();
            panelCancelar.add(botonCancelar);
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(panelTerminar);
            add(panelCancelar);
            setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        }
    }

    private void cerrarDialogo() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea Cancelar?", "Colocar Barcos", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    class ClickCelda implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            String codigo = ((String) listaBarcos.getSelectedItem()).substring(0, 2);
            PanelCelda cel = (PanelCelda) e.getSource();
            System.out.println("X: " + cel.coord.x + " Y: " + cel.coord.y);
        }
        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
}
