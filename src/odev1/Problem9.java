package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
 */

public class Problem9 {

    public static void main(String[] args) {

        int sayi1, sayi2, sayi3, enb;
        Scanner sc = new Scanner(System.in);

        System.out.print("Üç sayı giriniz: ");
        sayi1 = sc.nextInt();
        sayi2 = sc.nextInt();
        sayi3 = sc.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) enb = sayi1;
        else if (sayi2 > sayi1 && sayi2 > sayi3) enb = sayi2;
        else enb = sayi3;

        System.out.println("En büyük sayı: " + enb);
    }

}
