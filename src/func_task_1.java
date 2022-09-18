import java.util.Random;

public class func_task_1 {
    public static void main(String[] args){
        System.out.println(getRandomPassword(8));
    }
    static String getRandomPassword(int n){
        Random rand = new Random();
        String total = "";
        String source = "aBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz123456789";
        for(int i = 0;i<n;i++){
            int x = rand.nextInt(source.length());
            char ch = source.charAt(x);
            total+=ch;
        }
        return total;
    }
}


