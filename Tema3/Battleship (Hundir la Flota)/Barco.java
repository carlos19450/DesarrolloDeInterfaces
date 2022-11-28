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
    public void setCoordenada(Coordenadas coord) {
        listaCoordenadas.add(coord);
    }
}