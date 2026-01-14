package p1;

public class P1_main {
    public static void main (String[] args) {
        double a = 5.5;
        int b = 2;
        System.out.println(rekursivPot(a, b));
        System.out.println(iterativPot(a, b));
    }

    public static double iterativPot(double a, int b) {
        double result = 1.0;

        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }

    public static double rekursivPot(double a, int b) {
        if (b == 0) return 1;
        return (double) (a * rekursivPot(a, b - 1));
    }
}