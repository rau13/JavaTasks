import java.util.Scanner;

public class while_task_13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        while(x!=0){
            if(x%10==3){
                y+=1;
            }
            x = scan.nextInt();
        }
        System.out.println(y);
    }

}
