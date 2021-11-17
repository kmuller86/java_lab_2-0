import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int z = 21 % 3;
        if (z == 0) {
            System.out.println("Twój wiek jest podzielny przez 3");
        } else if (z != 0){
            System.out.println("Twój wiek nie jest podzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int y = 60727;
        int album = (y % 2 == 0) ? 0 : 1;
        System.out.println("3) album: " + album);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.print("Podaj swój wiek: ");
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();


        if (liczba >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else if (liczba < 18) {
            System.out.println("Jesteś niepełnoletni");
        }
    }
}
