import java.util.ArrayList;

public class Barco {

    private String codigo;
    public ArrayList<Coordenadas> listaCoordenadas;

    public Barco(String codigo) {
        this.codigo = codigo;
        listaCoordenadas = new ArrayList<Coordenadas>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void anadirCoordenada(Coordenadas coord) {
        listaCoordenadas.add(coord);
    }

    public boolean comprobarDisparo(Coordenadas disparo) {
        for (Coordenadas coord: listaCoordenadas)
            if (coord.equals(disparo)) {
                coord.setTocado(true);
                return true;
            }
        return false;
    }

    public boolean estaHundido() {
        for (Coordenadas coord: listaCoordenadas)
            if (!coord.esTocado()) {
                return false;
            }
        return true;
    }

}