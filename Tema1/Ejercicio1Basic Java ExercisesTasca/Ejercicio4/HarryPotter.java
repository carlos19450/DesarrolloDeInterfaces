import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarryPotter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String casa;

        System.out.println("Introduce su casa");
        casa = br.readLine();

        switch (casa) {
            case "gryffindor" -> System.out.println("bravery");
            case "hufflepuff" -> System.out.println("loyalty");
            case "slytherin" -> System.out.println("cunning");
            case "ravenclaw" -> System.out.println("intellect");
            default -> System.out.println("not a valid house");
        }
    }
}
