public class Comparador implements  Relaciones{
    public int entero = 5;
    public double doble = 5.5;

    public Comparador(int entero, double doble) {
        this.entero = entero;
        this.doble = doble;
    }

    @Override
    public boolean esMayor(Object b) {
        if (this.entero > ) {
            return true;
        }
        return false;
    }

    @Override
    public boolean esMenor(Object b) {
        return false;
    }

    @Override
    public boolean esIgual(Object b) {
        return false;
    }
}
