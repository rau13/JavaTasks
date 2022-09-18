import java.util.Scanner;

public class task4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x % y == 0) {
            System.out.println(x / y);
        } else {
            System.out.println("not completely divisible");
        }

    }
}
