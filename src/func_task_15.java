public class func_task_15 {
    public static void main(String[] args){
        System.out.println(getDistinctCount(new int[] {1,2,3,4,5,6,6,6,7,8,9}));
    }
    static int getDistinctCount(int[] arr){
        int Counter = 0;
        int firsElem = arr[0];
        for(int i : arr){
            if (i!=firsElem){
                firsElem = i;
                Counter++;
            }
        }
        return Counter;
    }
}
