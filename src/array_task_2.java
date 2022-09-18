import java.util.Random;

public class array_task_2 {
    public static void main(String[] args){
        Random rand = new Random();
        int x[] = new int[8];
        for(int i = 0;i<x.length;i++){
            x[i] = rand.nextInt(10);
            System.out.print(x[i]);
        }
        for(int i = 0;i<x.length;i++){
            if (x[i]%2!=0){
                x[i]=0;
            }
            System.out.println(x[i]);
        }
    }
}

