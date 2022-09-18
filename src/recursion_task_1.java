public class recursion_task_1 {
    public static void main(String [] args){
        System.out.println(nums(5));
    }
    static int nums(int n ){
        return nums(n-1);
    }
}
