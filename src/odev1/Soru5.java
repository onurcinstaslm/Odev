package odev1;

import java.util.Scanner;

/*
Elimizde şöyle bir liste var, bu listeden şehir seçildiğinde ilgili şehirin plaka numarasını veren kodu yazınız.

01- Adana
02- Adıyaman
03- Ayfon
10- Balıkesir
11- Bilecik
12- Bingöl
13- Bitlis
20- Denizli
 */

public class Soru5 {

    public static void main(String[] args) {

        String[] sehirler = {"Adana", "Adıyaman", "Afyon", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Denizli"};
        String[] plakalar = {"01", "02", "03", "10", "11", "12", "13", "20"};
        String sehirAdi;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Şehir adı: ");
        sehirAdi = sc.nextLine();

        for (int i = 0; i < sehirler.length; i++) {
            if (sehirAdi.equals(sehirler[i]))
                index = i;
        }

        System.out.println("Plaka: " + plakalar[index]);

    }

}
