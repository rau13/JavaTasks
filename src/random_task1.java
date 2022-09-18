import java.util.Random;

public class random_task1 {
    public static void main(String[] args) {
        char[] array = new char[8];
        int rand;
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            rand = r.nextInt(10);
            array[i] = (char)rand;
        }
        for (char c : array) {
            System.out.print(c);
        }
    }
}