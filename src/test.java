public class test {
    public static void main(String[] args){
        int x = 5, y = 5;
        boolean b = (x - 2 >= y + 4) || !(x == y * 2 || y * y <= 100) && ((x + 7 * y < 50) == (4 / x < 1));
        System.out.println(b);
    }

}
