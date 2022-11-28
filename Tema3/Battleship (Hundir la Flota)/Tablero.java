import java.util.ArrayList;

public class Tablero {
    private int[][] tablero;
    private ArrayList<Barco> barcos;

    public Tablero() {
        tablero = new int[10][10];
        barcos = new ArrayList<Barco>();
    }
    public int[][] getTablero() {
        return tablero;
    }
    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    public ArrayList<Barco> getBarcos() {
        return barcos;
    }
    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }
}