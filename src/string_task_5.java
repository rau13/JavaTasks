import java.util.Scanner;

public class string_task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.trim().split("\\W+");
        System.out.println(words.length);
    }
}


