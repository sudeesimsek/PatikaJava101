package Modul2;

import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, mod;

        System.out.print("Yıl Giriniz:");
        year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.print(year +"\tArtık Bir Yıldır");
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.print(year + "\tArtık Bir Yıldır");
        }else {
            System.out.print(year+"\tArtık Bir Yıl Değildir");
        }
    }
}
