package MyJava.String;

public class String {
    // Reverse in string
    public static void reverse(java.lang.String str) {
        int lastLetterOfString = str.length() - 1;
        for (int i = lastLetterOfString; i >= 0; i--) {
            java.lang.String rev = "";
            rev = rev + str.charAt(i);
            System.out.print(rev);
        }
    }
}
