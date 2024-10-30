package odev1;

/*
    Kullanıcıdan bir dizi alın ve dizide tekrar eden elemanları bulun.
 */

public class Problem19 {

    public static void main(String[] args) {

        int[] sayilar = {1, 45, 65, 1, 36, 45};

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = i+1; j < sayilar.length; j++) {

                if (sayilar[i] == sayilar[j]) {
                    System.out.println(sayilar[i]);
                }
            }

        }
    }

}
