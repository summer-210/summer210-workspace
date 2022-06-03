package ls01;

public class Tracing00 {
    public static void main(String[] args) {

        String[] names = {"Joe", "Bob", "Bill"};

        int longest = 0;

        for (int i=1; i<names.length; i++) {
            if (isLonger(names[i], names[longest])) {
                longest = i;
            }
        }

        System.out.println("Longest: " + names[longest]);

    }

    static boolean isLonger(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        return (a_len > b_len);
    }
}
