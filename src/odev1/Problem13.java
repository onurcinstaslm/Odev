package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
 */

public class Problem13 {

    public static void main(String[] args) {

        int sayi;
        String asal = "asaldır.";
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı: ");
        sayi = sc.nextInt();

        if (sayi == 0 || sayi == 1) {
            asal = "asal değildir.";
        } else {
            for (int i = 2; i < sayi / 2; i++) {

                if (sayi % i == 0) {
                    asal = "asal değildir.";
                    break;
                }

            }
        }


        System.out.println("Sayı: " + asal);

    }

}
