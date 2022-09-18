public class func_task_3 {
    static int calculate(String input) {
        int result = 0;
        int temp = 0;//512
        boolean isPlus = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);//5
            if (ch == '+' || ch == '-') {
                if (isPlus) {
                    result += temp;
                } else {
                    result -= temp;
                }
                if (ch == '+') {
                    isPlus = true;
                } else {
                    isPlus = false;
                }
                temp = 0;
            } else {
                temp = temp * 10 + Integer.parseInt(ch + "");
            }
        }
        if (isPlus) {
            result += temp;
        } else {
            result -= temp;
        }

        return result;
    }
}
