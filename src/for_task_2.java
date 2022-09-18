import java.util.Scanner;

public class for_task_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int  a = scan.nextInt();
        int  b = scan.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==1){
                System.out.print(i + " ");
            }
        }

    }
}
