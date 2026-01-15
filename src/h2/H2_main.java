package h2;

public int[] fibCache = new int[1000];

public class H2_main {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    // public static int benchmark(int n){

    //  }

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int fibonacciCached(int n) {

        if (n == 0 || n == 1) return n;

        return 0;
    }

}