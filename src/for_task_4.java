import java.util.Scanner;

public class for_task_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = 0;
        for(int i = a;i<=b;i++){
            x+=i*i;
        }
        System.out.println("Сумма квадратов целых чисел: " + x);
    }

}
