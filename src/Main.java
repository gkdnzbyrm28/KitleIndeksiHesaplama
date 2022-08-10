import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner utp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz.");
        boy = utp.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz.");
        kilo = utp.nextDouble();

        indeks = kilo / boy * boy;
        System.out.print("Vucut Kitle Indeksiniz ="+ indeks);

    }
}
