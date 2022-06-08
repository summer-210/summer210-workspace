package ls00;

import java.util.Scanner;

public class AProgram {

    public static void main(String[] kaki){
        String bobby = "\tka\nki" + "Hello" + 4;
        System.out.println(bobby);

        int[] arr = new int[4];
        int[] arr2 = {1, 2, 3, 4};

        // made a 5x5
        boolean[][] boolGrid = new boolean[5][];
        for (int i = 0; i < 5; i++) {
            boolGrid[i] = new boolean[5];
        }

        boolean[][] boolGrid2 = new boolean[5][];
        for (int i = 0; i < 5; i++) {
            boolGrid2[i] = new boolean[i+1];
        }

        boolean[][] boolGrid3 = new boolean[5][15];

        Dog fido = new Dog();
        System.out.println(fido.age);
        System.out.println(fido.name);
        fido.name = "Fido";
        System.out.println(fido.name);

        Scanner sc = new Scanner(System.in);
        double ex = sc.nextDouble();
        System.out.println(ex+"!!!!");


    }


}
