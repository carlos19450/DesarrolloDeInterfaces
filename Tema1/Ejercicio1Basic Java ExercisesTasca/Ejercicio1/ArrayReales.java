public class ArrayReales implements Estadisticas {
    public double[] vector;

    public ArrayReales(double[] vector) {
        this.vector = vector;
    }

    @Override
    public double minimo() {
        double min = 0;
        for (int i = 0; i <= this.vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = 0;
        for (int i = 0; i <= this.vector.length; i++) {
            if (vector[i] < max) {
                max = vector[i];
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double sum = 0;
        for (int i = 0; i <= this.vector.length; i++) {
            if (vector[i] < sum) {
                sum += vector[i];
            }
        }
        return sum;
    }
}
