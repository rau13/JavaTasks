import java.util.Random;

public class array_task_3 {
    public static void main(String[] args) {
        int x[] = new int[5];
        int y[] = new int[5];
        Random rand = new Random();
        int total_x = 0;
        int total_y = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(5);
            total_x += x[i];
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = rand.nextInt(5);
            total_y += y[i];
        }
        if ((total_x/x.length)>(total_y/y.length)){
            System.out.println("Среднее арифмитическое x больше чем y");
        }
        else if((total_x/x.length)<(total_y/y.length)){
            System.out.println("Среднее арифмитическое у больше х");
        }
    }
}

