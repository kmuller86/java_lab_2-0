import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = scan.next();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj numer albumu: ");
        int album = scan.nextInt();


        System.out.println("Nazywasz się " + imie + " " + nazwisko + ", masz " + wiek + " lat i numer albumu: " + album+"");
        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.print("Podaj liczbę a: ");
        int a = scan.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = scan.nextInt();
        System.out.print("a+b=");
        System.out.println(a+b);
        System.out.print("a-b=");
        System.out.println(a-b);
        System.out.print("a*b=");
        System.out.println(a*b);
        System.out.print("a/b=");
        System.out.println(a/b);
        System.out.print("a%b=");
        System.out.println(a%b);
    }
}
