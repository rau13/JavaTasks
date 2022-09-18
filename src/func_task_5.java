public class func_task_5 {
    public static void main(String[] args){
        System.out.println(removeH("ghggh"));
    }
    static String removeH(String input){
        int one_h = input.indexOf("h");
        int two_h = input.lastIndexOf("h");
        String word_array = input.replace(input.substring(one_h,two_h),"");
        return word_array.replace("h","");
    }
}
