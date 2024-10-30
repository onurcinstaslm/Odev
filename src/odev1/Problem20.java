package odev1;

/*
    10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.
 */

public class Problem20 {

    public static void main(String[] args) {

        int[] sayilar = {22, 33, 45, 24, 3763, 12, 1, 5, 99, 10000};

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] % 2 == 0) System.out.println(sayilar[i]);

        }

    }

}
