import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("file.txt");
        int current = reader.read();
        while (current != -1) {
            System.out.print((char) current);
            current = reader.read();
        }
        reader.close();
    }
}