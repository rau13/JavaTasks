public class func_task_9 {
    public static void main(String[] args){
        changeNegativeIndexByZero(new int[]{4,5,7,6,9});
    }
    static void changeNegativeIndexByZero(int[] arr){
        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2!=0){
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }
}
