public class Math3 implements Extremos{
    @Override
    public int min(int[] a) {
        int min = 0;
        for (int i = 0; i <= a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    @Override
    public int max(int[] a) {
        int max = 0;
        for (int i = 0; i <= a.length; i++) {
            if (a[i] < max) {
                max = a[i];
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        double min = 0;
        for (int i = 0; i <= a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        double max = 0;
        for (int i = 0; i <= a.length; i++) {
            if (a[i] < max) {
                max = a[i];
            }
        }
        return max;
    }
    public static int[] absEntero(int [] array) {
        int[] vector = new int[0];

        for (int i = 0; i < array.length; i++) {
            vector[i] = (array[i] < 0) ? -array[i] : array[i];
        }
        return vector;
    }

    public static double[] absDecimal(double [] array) {
        double[] vector = new double[0];

        for (int i = 0; i < array.length; i++) {
            vector[i] = (array[i] < 0) ? -array[i] : array[i];
        }
        return vector;
    }
}
