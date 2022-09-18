import java.util.Scanner;

public class string_task_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        boolean hasUppercase = !words.equals(words.toLowerCase());
        boolean hasLowercase = !words.equals(words.toUpperCase());
        boolean isAtLeast8   = words.length() >= 8;
        if(hasUppercase && hasLowercase && isAtLeast8){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
