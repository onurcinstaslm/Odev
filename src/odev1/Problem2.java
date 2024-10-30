package odev1;

import java.util.Scanner;

/*
    Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın, vize %40, final %60
    etkili olacak şekilde ortalamayı hesaplayın.
 */

public class Problem2 {

    public static void main(String[] args) {

        int vize, finall, ort;
        Scanner sc = new Scanner(System.in);

        System.out.print("Vize: ");
        vize = sc.nextInt();
        System.out.print("Final: ");
        finall = sc.nextInt();

        ort = (int) ((vize * 0.4) + (finall * 0.6));

        System.out.println("Ortalama: " + ort);

    }

}
