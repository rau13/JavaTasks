import java.util.Scanner;

public class task4_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x>y){
            System.out.println(x*3 + " " + y*2);
        } else{
            System.out.println(y*3 + " " + x*2 );
        }

    }

}
