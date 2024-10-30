package odev1;

import java.util.Scanner;

/*
    Kullanıcıdan bir ay ismi alın ve o ayın kaç gün çektiğini ekrana yazdıran bir program yazın
    (şubat için 28 varsayılabilir).
 */

public class Problem10 {

    public static void main(String[] args) {

        String ay;
        int gunSayisi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ay ismi: ");
        ay = sc.nextLine().toLowerCase();

        gunSayisi = switch (ay) {
            case "ocak" -> 31;
            case "şubat" -> 28;
            case "mart" -> 31;
            case "nisan" -> 30;
            case "mayıs" -> 31;
            case "haziran" -> 30;
            case "temmuz" -> 31;
            case "ağustos" -> 31;
            case "eylül" -> 30;
            case "ekim" -> 31;
            case "kasım" -> 30;
            case "aralık" -> 31;
            default -> -1;
        };

        System.out.println(ay + " ayı " + gunSayisi + " gündür.");

    }

}
