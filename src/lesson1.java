public class lesson1 {
    public static void main(String[] args){
        String time1 = "15:48";
        String time2 = "14:35";
        String[] time1_array = time1.split(":");
        String[] time2_array = time2.split(":");
        for(int i = 0;i<time1_array.length;i++){
            System.out.println(time1_array[i]);
        }
    }

}