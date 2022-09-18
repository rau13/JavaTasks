import java.util.Scanner;

public class while_task_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = x%10;
        int c = x/10;
        while(x>0){
            if (x%10 > y){
                y = x%10;
            }
            else if(x%10<c){
                c = x%10;
            }
            x/=10;
        }
        System.out.println("Наибольшая цифра: " + y);
        System.out.println("Наименьшая цифра: " + c);
    }

}
