import java.util.Scanner;

public class task4_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x<0) {
            System.out.println("-");
        } else{
            System.out.println("+");
        }
    }
}
