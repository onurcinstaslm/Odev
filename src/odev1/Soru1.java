package odev1;

import java.util.Scanner;

/*
Bir kişinin öğrencilik süresini alıp hangi okul döneminde olduğunu söyleyen kodu yazınız.

<5. “Elemantary School”
5<= gradle <8 ”Junior School”
8<= gradle <10 “High School”
>=10 “College”
<0 “NONE”
 */


public class Soru1 {

    public static void main(String[] args) {

        int sure;
        Scanner sc = new Scanner(System.in);

        System.out.print("Süre: ");
        sure = sc.nextInt();

        if (sure <= 0) {
            System.out.println("None");
        } else if (sure >= 10) {
            System.out.println("College");
        } else if (sure >= 8) {
            System.out.println("High School");
        } else if (sure >= 5) {
            System.out.println("Junior School");
        } else {
            System.out.println("Elementary School");
        }

    }

}
