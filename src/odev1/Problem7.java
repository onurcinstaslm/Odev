package odev1;

import java.util.Scanner;

/*
    Bir öğrencinin notunu (0-100 arası) kullanıcıdan alın ve 50’den büyükse “Geçti”, küçükse “Kaldı”
    şeklinde sonuç yazdırın.
 */

public class Problem7 {

    public static void main(String[] args) {

        int not;
        String sonuc;
        Scanner sc = new Scanner(System.in);

        System.out.print("0-100 arası bir sayı: ");
        not = sc.nextInt();
        sonuc = not >= 50 ? "Geçti" : "Kaldı";

        System.out.println("Sonuç: " + sonuc);

    }

}
