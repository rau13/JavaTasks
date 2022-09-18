import java.util.Scanner;

public class while_task_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 0;
        int c = 0;
        while(c<=x){
            sum+=c;
            System.out.println(sum);
            c++;
        }

    }
}
