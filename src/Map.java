import java.util.Random;

public class Map {
    public static void main(String[] args) {

        // print ten random numbers
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }
}