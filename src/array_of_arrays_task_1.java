public class array_of_arrays_task_1 {
    public static void main(String[] args){
        int[][] n = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println(ArraySum(n));

    }
    static int ArraySum(int[][] n){
        int sum = 0;
        for (int[] x : n) {
            for (int i : x) {
                sum+=i;
    }
        }
        return sum;
    }
}

