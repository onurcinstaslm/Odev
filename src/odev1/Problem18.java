package odev1;

/*
    Bir dizi oluşturun ve dizideki elemanları küçükten büyüğe sıralayan bir program yazın.
 */

import java.util.Arrays;

public class Problem18 {

    public static void main(String[] args) {

        int[] sayilar = {78, 34, 90, 34, -1, 6, -65};

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = i + 1; j < sayilar.length; j++) {

                int tmp = 0;

                if (sayilar[i] > sayilar[j]) {

                    tmp = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = tmp;

                }

            }

            System.out.println(sayilar[i]);

        }

    }

}
