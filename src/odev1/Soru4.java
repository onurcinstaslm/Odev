package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan 0-100 arası bir sayı girmesini isteyeceksiniz.
    Bu sayılar dışında bir değer girer ise girilen sayı sınır dışında bir sayıdır uyarısı vereceksiniz.
    Temel kural olarak Kullanıcının girdiği geçerli sayıların toplamı 100 ü geçtiğinde sayı istemeyi durduracaksınız.
    Kullanıcıdan alınan sayıların en büyük olanı, en küçük olanı ve ortalamasını hesaplayan kodu yazınız
 */

public class Soru4 {

    public static void main(String[] args) {

        int sayi, enk = 100, enb = 0, toplam = 0;
        double adet = 0.0;
        Scanner sc = new Scanner(System.in);

        while (toplam <= 100) {

            System.out.print("Sayı (1-100) : ");
            sayi = sc.nextInt();

            if (sayi > 100 || sayi < 0) {
                System.out.println("Sayı sınır dışındadır.");
                continue;
            }

            if (sayi > enb) enb = sayi;

            if (enk > sayi) enk = sayi;

            toplam += sayi;
            adet++;

        }

        System.out.println("Ortalama: " + (toplam / adet));
        System.out.println("En büyük sayı: " + enb);
        System.out.println("En küçük sayı: " + enk);
    }

}
