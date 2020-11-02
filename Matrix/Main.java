package Matrix;

public class Main {
    public static void main(String[] args) {
        Matrix mx1 = Matrix.random(2, 2);
        Matrix mx2 = Matrix.random(2, 2);


        mx1.show();
        System.out.println();
        mx2.show();
        System.out.println();
        System.out.println(mx1.eq(mx2));
        System.out.println();
        Matrix mx3 = mx1.times(mx2);
        mx3.show();
    }
}
