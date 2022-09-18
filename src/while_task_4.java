import java.util.Scanner;

public class while_task_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 0;
        while(x>0){
            sum+=x%10;
            x/=10;

        }
        System.out.println(sum);
    }
}


