import java.util.ArrayList;

public class Tablero {
    private int[][] tablero;
    private ArrayList<Barco> barcos;

    public Tablero() {
        tablero = new int[10][10];
        barcos = new ArrayList<Barco>();
    }

    public void anadirBarco(Barco barco) {
        barcos.add(barco);
        for (Coordenadas coord: barco.listaCoordenadas)
            tablero[coord.x][coord.y] = 1;
    }

    public boolean comprobarDisparo(Coordenadas disparo) {
        tablero[disparo.x][disparo.y] = 3;
        for (Barco barco: barcos) {
            if (barco.comprobarDisparo(disparo)) {
                tablero[disparo.x][disparo.y] = 2;
                return true;
            }
        }
        return false;
    }

}