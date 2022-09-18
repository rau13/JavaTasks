import java.util.Scanner;

public class string_task_9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    }

}
