import java.util.Scanner;

public class while_task_14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        int max = x;
        while(x!=0){
            if(x>max){
                max = x;
            }
        x = scan.nextInt();
        }
        System.out.println(max);
    }

}
