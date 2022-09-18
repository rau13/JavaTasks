import java.util.Scanner;

public class while_task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 1;
        int c = 0;
        while (x>0){
            x/=10;
            y++;
            System.out.println(y);

        }
    }
}
