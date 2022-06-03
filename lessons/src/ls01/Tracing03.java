package ls01;

public class Tracing03 {
    public static void main(String[] args) {

        int[] a;

        a = new int[3];
        a[0] = 3;
        a[1] = 5;
        a[2] = 10;

        int[] b = a;

        int c = swapAndSum(a, 0, 1);
        int d = swapAndSum(b, 1, 2);

        b = a.clone();

        b[2] = c+d+a.length;

        a[0] = swapAndSum(b, 1, 2);

        System.out.println("a[0] = " + a[0]);
        System.out.println("a[1] = " + a[1]);
        System.out.println("a[2] = " + a[2]);
        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);
    }

    static int swapAndSum(int[] iarray, int i, int j) {
        int tmp = iarray[i];
        iarray[i] = iarray[j];
        iarray[j] = tmp;

        return iarray[i] + iarray[j];
    }
}
