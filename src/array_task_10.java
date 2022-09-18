import java.util.Random;
import java.util.Scanner;

public class array_task_10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = scan.nextInt();
        int x[] = new int [n];
        int chetnoe = 0;
        for (int i = 0;i<x.length;i++){
            if(n<3){
                System.out.println("Повторите ввод");
                n = scan.nextInt();
            }
            x[i] = rand.nextInt(n);
            System.out.print(x[i]);
        }
        for(int i = 0;i<x.length;i++){
            if (x[i]%2!=0){
                continue;
            }else{
                System.out.println(x[i]);
            }
        }
    }
}
