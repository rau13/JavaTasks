import java.util.Scanner;

public class string_task_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split("//|/");
        for(int i = 0;i< words.length;i++){
            System.out.println(words[i]);
        }
    }
}
