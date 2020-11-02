package AlternativTabella;

import java.util.Arrays;

public class Wiki2Matrix {

    public static void main(String[] args) {

        int[][] kereszt = {
                {0, 0, 0, 1, 0, 3, 2, 3, 3, 2, 0, 0, 0, 2, 2, 3},
                {3, 0, 2, 1, 3, 2, 0, 3, 3, 3, 0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 3, 1, 3, 0, 0, 0, 3, 1, 1, 0, 2, 0},
                {0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 2, 1, 1},
                {3, 3, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0},
                {1, 0, 3, 1, 0, 0, 0, 1, 3, 2, 0, 0, 0, 1, 2, 3},
                {0, 2, 0, 0, 0, 1, 0, 1, 1, 0, 3, 0, 1, 3, 3, 1},
                {0, 0, 1, 1, 3, 0, 0, 0, 0, 1, 3, 1, 1, 1, 3, 0},
                {0, 0, 1, 2, 3, 0, 0, 1, 0, 0, 0, 2, 1, 1, 3, 1},
                {0, 1, 1, 2, 0, 0, 3, 1, 1, 0, 0, 0, 0, 1, 3, 3},
                {2, 3, 0, 2, 1, 1, 0, 0, 1, 2, 0, 1, 0, 0, 0, 2},
                {3, 3, 0, 0, 0, 3, 3, 0, 2, 1, 1, 0, 2, 0, 0, 0},
                {1, 2, 0, 1, 0, 2, 1, 0, 0, 1, 3, 1, 0, 0, 0, 2},
                {2, 1, 2, 0, 1, 2, 1, 0, 0, 0, 3, 1, 1, 0, 0, 0},
                {1, 3, 1, 0, 2, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 1, 0, 1, 0, 3, 1, 1, 0, 0, 1, 2, 1, 3, 0}
        };

        int[][] pontotSzerez = new int[kereszt.length][kereszt.length];

        for (int[] ints : pontotSzerez) {
            Arrays.fill(ints, 0);
        }

        for (int i = 0; i < pontotSzerez.length; ++i) {
            for (int j = 0; j < pontotSzerez[i].length; ++j) {

                if (kereszt[i][j] == 1) { // zφld

                    ++pontotSzerez[i][j];

                } else if (kereszt[i][j] == 2) { // sαrga

                    ++pontotSzerez[i][j];
                    ++pontotSzerez[j][i];

                } else if (kereszt[i][j] == 3) { // piros

                    ++pontotSzerez[j][i];

                } else if (kereszt[i][j] == 0) { // üres

                    ;

                } else {
                    System.out.println("Luke, zavart ιrzek az erυben...");
                }

            }
        }

        System.out.println("A x pontot szerez y-tol matrix");

        nyom(pontotSzerez);

        System.out.println("\nSor és oszlop összegekkel");

        nyom2(pontotSzerez);

        int[] oszlopOsszeg = new int[pontotSzerez.length];

        for (int i = 0; i < pontotSzerez.length; ++i) {

            int o = 0;
            for (int j = 0; j < pontotSzerez[i].length; ++j) {
                o += pontotSzerez[j][i];
            }
            oszlopOsszeg[i] = o;
        }

        System.out.println("\nA \"link\" mαtrix");

        nyom3(pontotSzerez, oszlopOsszeg);

    }

    public static void nyom(int[][] k) {
        for (int[] ints : k) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
        }
    }

    public static void nyom2(int[][] k) {

        for (int[] ints : k) {
            System.out.println();
            int o = 0;
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
                o += anInt;
            }
            System.out.print("  " + o);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < k.length; ++i) {

            int o = 0;
            for (int j = 0; j < k[i].length; ++j) {
                o += k[j][i];
            }
            System.out.print(o + " ");
        }

    }

    public static void nyom3(int[][] k, int[] oszlopOsszeg) {
        for (int[] ints : k) {
            System.out.println();
            System.out.print("{");
            for (int j = 0; j < ints.length; ++j) {

                if (oszlopOsszeg[j] != 0.0) {
                    System.out.print(ints[j] * (1.0 / oszlopOsszeg[j]) + ", ");
                } else {
                    System.out.print(ints[j] + ", ");
                }

            }
            System.out.print("},");

        }
    }
}