package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın.
 */

public class Problem12 {

    public static void main(String[] args) {

        int sayi, sonuc = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı: ");
        sayi = sc.nextInt();

        for (int i = sayi; i > 0; i--) {
            sonuc *= i;
        }

        System.out.println("Sonuç: " + sonuc);


    }

}
