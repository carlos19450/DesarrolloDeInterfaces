import java.util.Scanner;

public class NoIndexOutOfBoundsExceptions {
    public static void main(String[] args) {
        int[] hardCodedArray = { 3, 2, 4, 5, 1 };
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        if (!coded(hardCodedArray, index)) {
            System.out.println("The index is out of bounds.");
        } else {
            System.out.println(hardCodedArray[index]);
        }
    }

    public static boolean coded(int[] array, int index) {
        boolean correcto = true;
        Scanner scanner = new Scanner(System.in);

        if (index > array.length - 1) {
            return correcto = false;
        }
        return correcto;
    }
}
