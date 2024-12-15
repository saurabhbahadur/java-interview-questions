package MyJava.Array;

public class Array {
    // <------- Print array ------->

    static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    // <---------- Print 2D array ---------->

    static void print2d(int a[][]) {
        int rowLen = a.length;
        int colLen = a[0].length;

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }

    // <---------- Array sum ---------->

    static int sum(int a[]) {
        int n = a.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }

    // <---------- Reverse Array ---------->

    static void reverse(int a[]) {
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
