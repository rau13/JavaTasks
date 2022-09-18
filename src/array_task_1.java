import java.util.Random;

public class array_task_1 {
    public static void main(String[] args){
        Random rand = new Random();
        int x[] = new int[10];
        int counter = 0;
        for(int i = 0;i<x.length;i++){
            x[i] = rand.nextInt(9);
            System.out.println(x[i]);
            if (x[i]%2==0){
                counter+=1;
            }
        }
        System.out.println("Четных элементов в массиве: " + counter);
    }

}
