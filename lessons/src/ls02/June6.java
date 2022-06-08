package ls02;

public class June6 {
    public static void main(String[] args) {
        int x = 6;
        if (!(x > 2 && x % 3 == 0) || true) {
            System.out.println("Yay");
        } else {
            System.out.println("Nay");
        }

        if ("hello".equals("bye")) {
            System.out.println("lol");
        }

        String[] a = {"a", "b", "c"};
        for (String s : a) {
            System.out.println("\twow " + s );
        }

        String res = stringClean("kakkki says hello");
        System.out.println(res);
    }

    public static String stringClean(String input){
        if (input.length() <= 1) {
            return input;
        }
        // .charAt String method
        if (input.charAt(0) == input.charAt(1)) {
            // .substring()
            return stringClean(input.substring(1));
        } else {
            return input.charAt(0) + stringClean(input.substring(1));
        }

    }
}
