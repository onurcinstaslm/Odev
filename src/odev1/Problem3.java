package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan yarıçapı alınan bir dairenin alanını ve çevresini hesaplayan bir program yazın
    (alan = π * r^2, çevre = 2 * π * r).
 */

public class Problem3 {

    public static void main(String[] args) {

        int r;
        double cevre, alan, pi = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yarıçap: ");
        r = sc.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r ;

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan " + alan);

    }

}
