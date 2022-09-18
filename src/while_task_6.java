import java.util.Scanner;

public class while_task_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt();
        int x =1;
        int i =0;
        while(N>0){
            x=N%10;
            if(k==x){
                i++;
            }
            N/=10;

        }
        System.out.println(i);
    }

}
