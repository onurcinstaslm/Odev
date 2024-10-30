package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir tamsayı alın ve bu sayının çift mi, tek mi olduğunu belirleyin.
 */

public class Problem6 {

    public static void main(String[] args) {

        int sayi;
        String tip;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı: ");
        sayi = sc.nextInt();
        tip = sayi % 2 == 0 ? "Çift" : "Tek";

        System.out.println("Çift mi Tek mi? : " + tip);

    }

}
