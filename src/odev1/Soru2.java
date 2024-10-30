package odev1;

import java.util.Scanner;

/*
Bir yolculuk için toplam maliyeti hesaplayan kodu yazınız. Kurallar;

- L: LPG için H: Hibrit için kullanılacaktır.
- Arabanın yaşı ve yolculuğun KM si için 2 tam sayı değeri alın
- Kullanıcı L veya H girmez ise hata verin
- Toplam maliyet motor tipine göre hesaplanacaktır
- LPG 100km de 3.3lt
- HIBRIT 100km de 4.2lt
- LPG yakıtı 1.6₺ 1 litre için
- Aracın yaşı 7 den küçük ve eşit ise toplam maliyeti yazdırmanız yeterli
- Arabanın yaşı 7 den fazla ve 12 ye eşit ve küçük ise maliyet %3 arttırılmalı
- Arabanın yaşı 12 de n büyük ise toplam maliyet %7 arttırılmalıdır.
 */

public class Soru2 {

    public static void main(String[] args) {

        char yakitTipi;
        int yas, km;
        double toplamMaliyet, oran, lpg100kmLt = 3.3, hibrit100kmLt = 4.2, lpgLtFiyat = 1.6, hibritLtFiyat = 2.8;
        Scanner sc = new Scanner(System.in);
        double lpgKmLt = lpg100kmLt / 100;
        double hibritKmLt = hibrit100kmLt / 100;

        System.out.print("KM: ");
        km = sc.nextInt();
        System.out.print("Yaş: ");
        yas = sc.nextInt();
        System.out.print("Yakıt tipi (L: LPG , H: Hibrit) : ");
        yakitTipi = sc.next().charAt(0);

        if (yas > 12) {
            oran = 1.07;
        } else if (yas > 7) {
            oran = 1.03;
        } else {
            oran = 1;
        }

        switch (yakitTipi) {
            case 'L':

                toplamMaliyet = km * lpgKmLt * lpgLtFiyat * oran;

                System.out.println("Toplam Maliyet: " + toplamMaliyet + " TL");
                break;
            case 'H':

                toplamMaliyet = km * hibritKmLt * hibritLtFiyat * oran;

                System.out.println("Toplam Maliyet: " + toplamMaliyet + " TL");

                break;
            default:
                System.out.println("Yakıt tipi geçerli değildir.");
        }

    }

}
