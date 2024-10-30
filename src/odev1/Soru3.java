package odev1;

import java.util.Scanner;

/*
Kübik number ları yazdıracaksınız ancak ekranda çıktılandığı şekilde olması istenmektedir

Örn:
Bir sayı giriniz…: 5
Sayı 1:125
Sayi 2:64
Sayi 3:27
Sayi 4:8
Sayi 5:1

 */


public class Soru3 {

    public static void main(String[] args) {

        int sayi, index = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı: ");
        sayi = sc.nextInt();

        for (int i = sayi; i > 0 ; i--) {
            System.out.println("Sayı " + index + ": " + (i * i * i));
            index++;
        }

    }

}
