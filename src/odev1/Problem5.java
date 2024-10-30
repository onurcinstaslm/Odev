package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir ürünün fiyatını alın ve %18 KDV eklenmiş halini ekrana yazdıran bir program yazın.
 */

public class Problem5 {

    public static void main(String[] args) {

        int fiyat;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ürün fiyatı: ");
        fiyat = sc.nextInt();

        System.out.println("KDV'li hali: " + (fiyat * 1.18));


    }

}
