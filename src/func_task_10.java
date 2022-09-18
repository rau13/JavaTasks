public class func_task_10 {
    public static void main(String[] args){
        System.out.println(upperArr(new int[]{6,8,9,10,20}));
    }
    static boolean upperArr(int[] arr){
        boolean upper = true;
        for (int i = 1;i< arr.length;i++){
            if (arr[i]<=arr[i-1]){
                upper = false;

            }
        }
        return upper;
    }
}
