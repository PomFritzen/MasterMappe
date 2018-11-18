package Responstid;

public class Respons {
    public static void main(String[] args) {


        long tæller = 0;
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            tæller += i;
            //if (i % 1000 == 0) System.out.println(i);
        }
        long t1 = System.currentTimeMillis();
        System.out.println("Det tog " + (t1 - t0) + "ms");
    }
}