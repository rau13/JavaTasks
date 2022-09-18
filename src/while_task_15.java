import java.util.Scanner;

public class while_task_15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        while(x!=0){
            int c = scan.nextInt();
            if(c!=0&&x<c){
                y+=1;
            }
            x=c;
        }
        System.out.println(y);
    }


}
