public class Coordenadas {
    public int x;
    public int y;
    private boolean tocado;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
        this.tocado = false;
    }
    public boolean esTocado() {
        return tocado;
    }
    public void setTocado(boolean tocado) {
        this.tocado = tocado;
    }
}
