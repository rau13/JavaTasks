public class array_task_5 {
    public static void main(String[] args){
        int x[] = new int[20];
        x[0] = 1;
        x[1] = 1;
        for(int i = 3;i<x.length;i++){
            if(i>2){
                x[i] = x[i-2] + x[i-1];
            }
            System.out.println(x[i]);
        }
    }
}
