import java.util.Scanner;

public class string_task_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int one_h = word.indexOf("h");
        int two_h = word.lastIndexOf("h");
        String word_array = word.replace(word.substring(one_h,two_h),"");
        System.out.println(word_array.replace("h",""));//второй раз вызвал replace чтобы убрать первую 'h'
    }
}
