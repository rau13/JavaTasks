import java.util.Scanner;

public class while_task_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        while (y<100) {
            y++;
            if (y%x == 0){
                System.out.println(y);
            }

        }
    }
}
