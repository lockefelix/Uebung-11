package h3;

public class H3_main {

    public static void main(String[] args) {
        int[] testArray = {4, 1, 534, 345, 6765, 23, 46, 888, 654, 321, 324, 1, 1, 1, 1, 4};

        testArray = mergeSort(testArray);

        for (int i = 0; i < testArray.length; i++) {
            System.out.print("[" + testArray[i] + "] ");
        }
    }

    public static int[] mergeSort(int[] a) {
        if (a == null || a.length <= 1) return a;

        int mid = a.length / 2;

        int[] left = new int[mid];
        int[] right = new int[a.length - mid];

        // Linke Seite kopieren
        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        // Rechte Seite kopieren
        for (int i = mid; i < a.length; i++) {
            right[i - mid] = a[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // solange beide noch Elemente haben
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // Rest von a
        while (i < a.length) {
            result[k++] = a[i++];
        }

        // Rest von b
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}