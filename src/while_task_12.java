import java.util.Scanner;

public class while_task_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        while (x!=0){
            x = scan.nextInt();
            if(x%3==0){
                y++;
            }
        }
        System.out.println(y);

    }


}
