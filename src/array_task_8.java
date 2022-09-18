import java.util.Random;

public class array_task_8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x[] = new int[11];
        int counter_negative = 0;
        int counter_one = 0;
        int counter_null = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = -1 + rand.nextInt(3);
            System.out.print(x[i] + "|");
            if (x[i] < 0) {
                counter_negative++;
            }
            else if (x[i] > 0) {
                counter_one++;
            }
            else if (x[i] == 0) {
                counter_null++;
            }
        }
        if(counter_negative>counter_null&&counter_negative>counter_one){
                System.out.println(" -1 больше");
            }
        else if(counter_null>counter_negative&&counter_null>counter_one){
                System.out.println(" 0 больше");
            }
        else if(counter_one>counter_negative&&counter_one>counter_null){
                System.out.println(" 1 больше");
            }
    }
}
