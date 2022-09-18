public class func_task_4 {
    public static void main(String[] args) {
        System.out.println(isEncrypted("Rauan1310"));
    }
    static boolean isEncrypted(String password){
        boolean isVlid = true;
        String upperChars = "(.*[A-Z].*)";
        String loweChars = "(.*[a-z].*)";
        String numbers = "(.*[1-9].*)";
        if(password.length() < 8){
            isVlid = false;
        }
        if(!password.matches(upperChars)){
            isVlid = false;
        }
        if (!password.matches(loweChars)){
            isVlid = false;
        }
        if(!password.matches(numbers)){
            isVlid = false;
    }
    return isVlid;
    }
}
