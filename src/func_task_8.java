public class func_task_8 {
    public static void main(String[] args){
        System.out.println(countEven(new int[]{4,6,6,7,8,9}));
    }
   static int countEven(int[] arr){
        int counter = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2==0){
                counter++;
            }
        }
        return counter;
    }
}
