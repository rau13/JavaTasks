public class Random extends java.util.Random {
    public int nextint(int from, int to){
        return super.nextInt(from)+to;
    }
}
