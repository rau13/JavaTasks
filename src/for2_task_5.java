import java.util.Scanner;

public class for2_task_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        for(int i = 0;i!=n;i++) {
            for (int j = 0; j != i; j++) {
                n = scan.nextInt();
                if (n>i){
                    System.out.println(j);
                }
            }
        }
    }
}
