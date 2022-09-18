import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int c = x%y;
        int z = x/y;
        System.out.println(z +" " + c +"/" + y);
    }
}
