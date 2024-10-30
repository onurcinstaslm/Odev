package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan doğum yılını alın ve 18 yaşından büyük olup olmadığını kontrol edin.
    Büyükse "Reşit", değilse "Reşit değil" yazdırın.
 */

public class Problem8 {

    public static void main(String[] args) {

        int yas;
        String sonuc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yaş: ");
        yas = sc.nextInt();

        sonuc = yas >= 18 ? "Reşit" : "Reşit değil";

        System.out.println("Reşit mi? : " + sonuc);

    }

}
