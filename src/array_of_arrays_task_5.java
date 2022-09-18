public class array_of_arrays_task_5 {
    public static void main(String[] args){
        int[][] n = {{1, 2, 3}, {4, 5, 5 }, {6, 7, 8}};
        System.out.println(SumArray2(n));
    }
    static int SumArray2(int[][]TwoArray){
        int sum = 0;
        for (int i = 0; i < TwoArray.length; i++) {
            for (int j =  i+1; j < TwoArray[i].length; j++) {
                sum += TwoArray[i][j];
            }
        }
        return sum;
    }
}
