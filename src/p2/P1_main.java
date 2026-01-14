package p2;

public class P1_main {

    public static int pot = 1;

    public static void main(String[] args) {
        int zahl = 64;
        System.out.println(logIterativ(zahl));
        System.out.println(logRekursiv(zahl));
    }

    public static int logIterativ (int zahl) {
        if (zahl == 1) return 0;
        while (zahl > 2) {
            zahl = zahl / 2;
            pot++;
        }
        return pot;
    }

    public static int logRekursiv (int zahl) {
        if (zahl == 2 || zahl == 0) return 1;
        return 1 + logRekursiv(zahl / 2);
    }
}