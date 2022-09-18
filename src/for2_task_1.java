import java.util.Scanner;

public class for2_task_1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i = 10; i < 100; i++) {
            x = i/10;
            y = i%10;
            if (i==(x*y)*2){
                System.out.println(i);
            }
        }
    }

}


