package binaryvsliniartimesearch;

public class BinaryVSLiniarTimeSearch {

    public static void main(String[] args) {

        getTime(1300000);
        getTime(56000000);
        getTime(890000000);

    }

    public static void getTime(long n) {
        long startTime = System.currentTimeMillis();
        long k = 0;
        for (int i = 1; i <= n; i++) {
            k = k + 5;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n
                + " is " + (endTime - startTime) + " milliseconds");
    }
}
