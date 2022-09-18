public class array_of_arrays_task_2 {
    public static void main(String[] args){
        int[][] n = {{0, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println(MaxMinNumberInArray(n));
    }
    static int MaxMinNumberInArray(int[][] n ){
        int max = 0;
        int min = 1;
        int[] max_min = {max,min};
        for (int x[]:n) {
            for (int i:x){
                if (i>max){
                    max = i;
                }
                else if (i<min){
                    min = i;
                }
            }
        }
        System.out.println(min);
        return max;
    }
}
