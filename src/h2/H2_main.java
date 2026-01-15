package h2;

public class H2_main {

    private static final int[] fibCache = new int[1000];

    public static void main(String[] args) {

        int n = 10;

        benchmark(n);

    }

    public static void benchmark(int n) {

        long startA = System.nanoTime();
        int resultA = fibonacci(n);
        long endA = System.nanoTime();
        System.out.println("Fibonacci normal: n =: " + resultA);
        System.out.println("Vergangene Zeit: " + (endA - startA));

        long startB = System.nanoTime();
        int resultB = fibonacciCached(n);
        long endB = System.nanoTime();
        System.out.println("Fibonacci cached: n =: " + resultB);
        System.out.println("Vergangene Zeit: " + (endB - startB));

        long startC = System.nanoTime();
        int resultC = fibonacciIterativ(n);
        long endC = System.nanoTime();
        System.out.println("Fibonacci iterativ: n =: " + resultC);
        System.out.println("Vergangene Zeit: " + (endC - startC));
    }

    public static int fibonacci(int n) {

        if (n == 0) throw new IllegalArgumentException("n muss > 0 sein");
        if (n == 1 || n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int fibonacciCached(int n) {
        if (n <= 0) throw new IllegalArgumentException("n muss > 0 sein");
        if (n == 1 || n == 2) return 1;

        if (fibCache[n] != 0) return fibCache[n];

        fibCache[n] = fibonacciCached(n - 1) + fibonacciCached(n - 2);
        return fibCache[n];
    }


    public static int fibonacciIterativ(int n) {

        int a = 1;
        int b = 1;

        if (n == 0) throw new IllegalArgumentException("n muss > 0 sein");
        if (n == 1 || n == 2) return 1;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;

    }

}