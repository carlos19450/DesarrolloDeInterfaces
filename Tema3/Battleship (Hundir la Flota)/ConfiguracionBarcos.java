import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfiguracionBarcos extends JPanel{
    private Tablero tablero;
    private int maxBarcos;
    private PanelTablero panelTablero;
    private JComboBox<String> listaBarcos;
    private JButton botonTerminar;
    private JButton botonCancelar;

    public ConfiguracionBarcos(Tablero tablero) {
        this.tablero = tablero;
        this.maxBarcos = 5;
        setLayout(new BorderLayout());
        add(new PrimerPanel(), BorderLayout.NORTH);
        add(new SegundoPanel(), BorderLayout.CENTER);
        add(new TercerPanel(), BorderLayout.SOUTH);
    }
    private class PrimerPanel extends JPanel {
        public PrimerPanel() {
            String[] lista = new String[] {"Aircraft Carrier", "Battleship", "Submarine", "Cruiser", "Destroyer"};
            listaBarcos = new JComboBox<>(lista);
            add(listaBarcos);
            setBorder(BorderFactory.createTitledBorder("Coloca el tipo de barco en el tablero."));
        }
    }
    private class SegundoPanel extends JPanel {
        public SegundoPanel() {
            panelTablero = new PanelTablero(tablero);
            panelTablero.setTableroModelo();
            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++)
                    panelTablero.celdas[i][j].addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            String codigo = ((String) listaBarcos.getSelectedItem()).substring(0, 2);
                            PanelCelda cel = (PanelCelda) e.getSource();
                            int x = cel.coord.x;
                            int y = cel.coord.y;
                            if (tablero.getTablero()[x][y] == 1) {
                                JOptionPane.showMessageDialog(null, "Ya hay un Barco en esta casilla",
                                        "Colocar Barcos", JOptionPane.WARNING_MESSAGE);
                            }else{
                                String[] opciones = new String[]{"Vertical", "Horizontal"};
                                int orientacion = JOptionPane.showOptionDialog(null, "Elija orientación",
                                        "Colocar Barcos", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);

                                colocarBarco(codigo, orientacion, cel);
                            }
                        }
                        @Override
                        public void mousePressed(MouseEvent e) {
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }
                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }
                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    });
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
                    BattleShip batalla = null;
                    batalla.dispose();
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
    private void colocarBarco(String codigo, int orientacion, PanelCelda celda) {

        boolean colocado;

        if (orientacion == 0) //Vertical
            colocado = colocarVertical(codigo, celda);
        else
            colocado = colocarHorizontal(codigo, celda);

        //Si se ha colocado el Barco, comprobamos si se permite poner más

        if (colocado) {
            limiteBarcos--;

            if (limiteBarcos == 0) {
                listaBarcos.setEnabled(false);
                panelTablero.desactivarListener();
                botonTerminar.setEnabled(true);
            }
            else {
                /*
                 * Se permiten más barcos, pero no el mismo que acabamos de poner.
                 * Solo se puede repetir el Destructor, si estamos en nivel EASY
                 */
                if (codigo.equals("DT")) {
                    if (dificultad != 1) //No es EASY
                        listaBarcos.removeItem("DT-Destructor");
                    else if (tablero.hayDosDestructores()) //EASY, solo si ya hay dos eliminamos DT de la lista
                        listaBarcos.removeItem("DT-Destructor");
                }
                else //No es destructor, eliminamos el Barco correspondiente al código
                    listaBarcos.removeItem(listaBarcos.getSelectedItem());
            }
        }
}
