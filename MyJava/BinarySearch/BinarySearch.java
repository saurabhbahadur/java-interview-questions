package MyJava.BinarySearch;

public class BinarySearch {
    // <---------------------- find Index ----------------------------->
    static int findIdx(int key, int a[]) {
        int n = a.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // <------------- first index duplicate element ------------------------>
    static int firstIndex(int key, int a[]) {
        int n = a.length;
        int startIdx = 0;
        int endIdx = n - 1;

        int firstIdx = -1;

        while (startIdx <= endIdx) {
            int mid = (startIdx + endIdx) / 2;

            if (a[mid] == key) {
                firstIdx = mid;
                endIdx = mid - 1;
            } else if (a[mid] > key) {
                endIdx = mid - 1;
            } else {
                startIdx = mid + 1;
            }

        }

        return firstIdx;

    }

    // <------------- last index duplicate element ---------------->
    static int lastIndex(int key, int a[]) {
        int n = a.length;
        int startIdx = 0;
        int endIdx = n - 1;

        int lastIdx = -1;

        while (startIdx <= endIdx) {
            int mid = (startIdx + endIdx) / 2;

            if (a[mid] == key) {
                lastIdx = mid;
                startIdx = mid + 1;
            } else if (a[mid] > key) {
                endIdx = mid - 1;
            } else {
                startIdx = mid + 1;
            }

        }

        return lastIdx;
    }

    // <----------------- Square Root --------------->

    static int sqrt(int n) {
        long ans = -1;
        long startIdx = 0;
        long endIdx = (long) n;

        while (startIdx <= endIdx) {
            long mid = startIdx + (endIdx - startIdx) / 2;
            if (mid * mid == n) {
                return (int) mid;
            } else if (mid * mid > n) {
                endIdx = mid - 1;
            } else {
                ans = mid;
                startIdx = mid + 1;
            }
        }

        return (int) ans;

    }

}
