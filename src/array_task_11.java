import java.util.Random;

public class array_task_11 {
    public static void main(String[] args){
        Random rand = new Random();
        int x[] = new int[10];
        double max = 0;
        double min = Double.MAX_VALUE;
        int summa = 0;
        int chetnoe = 0;
        int nechet = 0;
        for(int i = 0;i<x.length;i++){
            x[i] = rand.nextInt(20);
            System.out.print(x[i] + " ");
            summa += x[i];
            max = Math.max(max,x[i]);
            min = Math.min(min,x[i]);
            if (x[i]%2!=0){
                nechet++;
            }else{
                chetnoe++;
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное знаяение: " + min);
        System.out.println("Сумма элементов массива: " + summa);
        System.out.println("Количество четных чисел: " + chetnoe);
        System.out.println("Количество нечетных чисел: " + nechet);
    }
}
