package Modul2;

import java.util.Scanner;

public class girilenSayininMinimumveMaksimumDegeriniBulma {
    public static void main(String[] args) {
        int numberCounter, selectNumber;
        int enKucuk = 0, enBuyuk = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz ?:");
        numberCounter = input.nextInt();

        for (int i = 1; i <= numberCounter; i++) {
            System.out.print(i + ".Sayıyı Giriniz:");
            selectNumber = input.nextInt();

            if (selectNumber > enBuyuk) {
                if (enKucuk == 0) {
                    enKucuk = selectNumber;
                }
                enBuyuk = selectNumber;
            }
            if (selectNumber < enBuyuk) {
                if (enBuyuk == 0) {
                    enBuyuk = selectNumber;
                }
                enKucuk = selectNumber;
            }
        }
        System.out.println("Girilen sayılardan en büyüğü =" + enBuyuk);
        System.out.println("Girilen sayılardan en küçüğü =" + enKucuk);
    }
}
