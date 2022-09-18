import java.util.Random;

public class array_task_4 {
    public static void main(String[] args){
        Random rand = new Random();
        int x[] = new int[4];
        for(int i = 0;i<x.length;i++){
            x[i] = 10+rand.nextInt(99);
            System.out.println(x[i]);
            if(i==x[i]-1){
                System.out.println("Возрастающая");
            }
        }
    }
}



