import java.util.Arrays;
import java.util.Random;

public class array_task_7 {
    public static void main(String[] args){
        int a[] = new int[10];
        int b[] = new int[10];
        double c[] = new double[10];
        Random rand = new Random();
        int counter = 0;
        for (int i = 0;i<10;i++){
            a[i] = rand.nextInt(10);
            b[i] = rand.nextInt(10);
            c[i] = (double)a[i]/b[i];
        }
        for(int i = 0;i<c.length;i++){
            if (c[i]%1==0){
                counter++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(counter);
    }
}
