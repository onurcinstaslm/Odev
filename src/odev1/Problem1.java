package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan iki tamsayı alın ve bu sayıların toplamını, farkını, çarpımını ve bölümünü
    ekrana yazdıran bir program yazın.
 */

public class Problem1 {

    public static void main(String[] args) {

        int sayi1, sayi2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı 1: ");
        sayi1 = sc.nextInt();
        System.out.print("Sayı 2 ");
        sayi2 = sc.nextInt();

        System.out.println("Toplam: " + (sayi1 + sayi2));
        System.out.println("Fark: " + (sayi1 - sayi2));
        System.out.println("Çarpım: " + (sayi1 * sayi2));
        System.out.println("Bölüm: " + (sayi1 / (double) sayi2));

    }

}
