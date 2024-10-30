package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift sayıları ekrana yazdıran bir program yazın.
 */

public class Problem14 {

    public static void main(String[] args) {

        int sayi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı: ");
        sayi = sc.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) System.out.println(i);

        }

    }

}
