import java.util.Scanner;

public class while_task_11 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        while(x!=0){
            y+=x;
            x = scan.nextInt();
        }
        System.out.println(y);
    }
}
