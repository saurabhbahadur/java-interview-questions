package MyJava.Sorting;

public class Sorting {
    // <---------- Selection Sort -------------------------->
    static int[] selection(int a[]) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int mni = i;
            for (int j = i; j < n; j++) {
                if (a[mni] > a[j]) {
                    mni = j;
                }
            }

            int t = a[i];
            a[i] = a[mni];
            a[mni] = t;
        }

        return a;
    }
}
