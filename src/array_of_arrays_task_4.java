public class array_of_arrays_task_4 {
    public static void main(String[] args){
        int[][] n = {{1, 2, 3}, {4, 5, 5 }, {6, 7, 8}};
        System.out.println(sumArray(n));

        for (int i = 0;i< n.length;i++){
            for (int j = 0;j< n[i].length;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int sumArray(int[][]twodimarray){
        int sum = 0;
        for (int i = 0;i< twodimarray.length;i++){
            sum+=twodimarray[i][i];
        }
        return sum;
    }

}


