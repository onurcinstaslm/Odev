package odev1;

/*
    Bir dizideki en küçük elemanı ve indeksini bulan bir program yazın.
 */

public class Problem17 {

    public static void main(String[] args) {

        int[] sayilar = {10,24,13,4,45};
        int index = 0, enk = sayilar[index];

        for (int i = 1; i < sayilar.length; i++) {

            if (enk > sayilar[i]) {
                enk = sayilar[i];
                index = i;
            }

        }

        System.out.println("En küçük sayı: " + (index + 1) + ". sıradaki "+ enk + " sayısıdır." );

    }

}
