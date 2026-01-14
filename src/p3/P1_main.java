package p3;

public class P1_main {
    public static void main(String[] args) {
        int kapital = 10000;
        int jahre = 10;
        System.out.println(zinsesZins(kapital, jahre));
    }

    public static int zinsesZins (int kapital, int jahre) {
        if (jahre == 0) return kapital;
        int zinsen = (int) (kapital * 0.05);
        kapital += zinsen;
        return zinsesZins(kapital, jahre -1);
    }
}