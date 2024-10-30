package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir cümle alın ve cümlenin karakter sayısını ekrana yazdıran bir program yazın.
 */

public class Problem4 {

    public static void main(String[] args) {

        String cumle;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cümle: ");
        cumle = sc.nextLine();

        System.out.println("Karakter sayısı: " + cumle.length());


    }

}
