import java.util.Scanner;

public class for_task_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i=1;i < 10; i++){
            System.out.println("x*"+i+"="+x*i);
        }
    }
}
