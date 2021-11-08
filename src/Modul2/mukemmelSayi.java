package Modul2;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Sayıyı Giriniz:");
        int sayı = input.nextInt();

        for (int i = 1; i < sayı; i++) {

            if (sayı % i == 0) {
                toplam += i;
            }
        }
            if (sayı == toplam) {
                System.out.print(sayı + " Mükemmel Sayıdır");
            } else {
                System.out.print(sayı +" Mükemmel Sayı Değildir");
            }
    }
}
