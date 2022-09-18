import java.util.Scanner;

public class while_task_16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = 1;
        int y = 0;
        int c = 1;
        while(x!=0){
            x = scan.nextInt();
            if(x>c){
                c = x;
                y = 1;
            }
            else if(x==c){
                y++;
            }
        }
        System.out.println(y);
    }
}
