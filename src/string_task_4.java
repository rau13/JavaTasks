import java.util.Scanner;

public class string_task_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        char[] words_char = words.toCharArray();
        for(int i = 0;i< words_char.length;i++){
            switch (words_char[i]){
                case 'a':
                    words_char[i] = 'b';
                    break;
                case 'b':
                    words_char[i] = 'a';
                    break;
                case 'A':
                    words_char[i] = 'B';
                    break;
                case 'B':
                    words_char[i] = 'A';
                    break;
            }
        }
        System.out.println(words_char);
    }

}

