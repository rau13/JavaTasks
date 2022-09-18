import java.util.Random;

public class func_task_7 {
    public static void main(String[] args){
        System.out.println(getRandarr(10));
    }
    static int[] getRandarr(int n){
        Random rand = new Random();
        int[] a = new int[n];
        for(int i = 1;i<n;i++){
            a[i] = rand.nextInt(10);
            System.out.println(a[i]);
        }
        return null;
    }
}
