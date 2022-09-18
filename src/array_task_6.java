import java.util.Random;

public class array_task_6 {
    public static void main(String[] args){
        int x[] = new int[12];
        Random rand = new Random();
        double max = 0;
        for(int i = 0;i<x.length;i++){
            x[i] = -15+rand.nextInt(30);
            System.out.print(x[i]+" ");
        }
        for (int i = 0;i<x.length;i++){
            max = Math.max(max,x[i]);
        }
        for(int i = 0;i<x.length;i++){
            if (x[i] == max){
                System.out.println("Индекс максимального элемента в массиве: " + i);
                break;
            }
        }
    }
}
