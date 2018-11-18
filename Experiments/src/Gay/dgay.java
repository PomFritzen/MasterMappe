package Gay;

public class dgay {
    public static void main(String[] args) {


        int p, q;
        int ctr = 0;
        int myArray[][] = new int[10][10];
        for (p = 0; p < 10; p++)
            for (q = 0; q < 10; q++) {
                myArray[q][p] = ctr;

                ++ctr;

            }
        System.out.println(myArray[1][9]);
    }
}
