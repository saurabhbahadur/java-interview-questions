package MyJava.Recursion;

public class BinarySearch {
    // <-------- binarySearch ------------>
    static int binarySearch(int key, int[] a, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return -1;
        }

        int mid = startIdx + (endIdx - startIdx) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] > key) {
            return binarySearch(key, a, startIdx, mid - 1);
        }
        return binarySearch(key, a, mid + 1, endIdx);
    }
}
