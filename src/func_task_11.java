
public class func_task_11 {
    public static void main(String[] args) {
        fibTotal(fib(5));
    }
    static int[] fib(int n){
        int[] m = new int[n];
        for(int i=0;i<n;i++) {
            if(i<2){
                m[i]=1;
            } else{
                m[i]=m[i-1]+m[i-2];
            }
        }
        return m;
    }
    static void fibTotal(int[] n){
        int z = n.length;
        for (int i =0;i<z;i++){
            System.out.print(n[i] + " ");
        }
    }
}
