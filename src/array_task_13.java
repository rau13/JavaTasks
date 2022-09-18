public class array_task_13 {
    public static void main(String[] args){
        int n[] = {2002,2001,2004,2003};
        double min = Double.MAX_VALUE;
        for(int i = 0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        for (int i = 0;i<n.length;i++){
            min = Math.min(min,n[i]);
            if (n[i]==min){
                System.out.println(i+1);
            }
        }
    }
}

