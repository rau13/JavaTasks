import java.util.Scanner;

public class for_task_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (n = 0; n<=100; n++) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
        }
    }

}
