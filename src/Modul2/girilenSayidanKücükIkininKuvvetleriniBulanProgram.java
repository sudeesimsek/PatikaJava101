package Modul2;

import java.util.Scanner;

public class girilenSayidanKücükIkininKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int n, total, i = 1, k = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz:");
        n = input.nextInt();
        for (i = 1; i <= n; i *= 3) {
        }
        for (k = 1; k <= n; k *= 4) {
        }
        System.out.println("Total=" + (i+k));
    }
}
