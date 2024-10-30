package odev1;

import java.util.Arrays;
import java.util.Scanner;

/*
    5 elemanlı bir dizi oluşturun, kullanıcıdan elemanları alın ve bu dizinin ortalamasını hesaplayın.
 */

public class Problem16 {

    public static void main(String[] args) {

        int[] dizi = new int[5];
        double ort;
        int toplam = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". sayı: ");
            dizi[i] = sc.nextInt();
            toplam += dizi[i];
        }

        ort = toplam / 5.0;

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Ortalama: " + ort);

    }

}
