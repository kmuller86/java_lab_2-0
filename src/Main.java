import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("Operatory arytmetyczne:" +
            "\na = true\tb = false\tc = true");
        System.out.println("(a && b) : " + (a && b));
        System.out.println("(a && c) : " + (a && c));
        System.out.println();
        System.out.println("(a || b) : " + (a || b));
        System.out.println("(a || c) : " + (a || c));
        System.out.println();
        System.out.println("!a : " + !a);
        System.out.println("!b : " + !b);
        System.out.println();
        System.out.println("!(a || b) : " + !(a || b));
        System.out.println("!(a || b) && (a && c) : " + !((a || b) && (a && c)));
        System.out.println();

        int w = 7;
        int x = 7;
        int y = 5;
        int z = 21;

        System.out.printf("Operatory porónawcze:" +
                "\nw = %d\tx = %d\ty = %d\tz = %d\n", w, x, y, z);

        System.out.println("(x > y) : " + (x > y));
        System.out.println("(x == w) : " + (x == w));
        System.out.println("(z == w) : " + (z == w));
        System.out.println("(w != z) && (x > y) && (z > (w + x)) : " + (((w != z) && (x > y) && (z < (w + x)))));


    }
}
