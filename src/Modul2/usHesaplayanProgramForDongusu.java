package Modul2;

import java.util.Scanner;

public class usHesaplayanProgramForDongusu {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı:");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı:");
        k = input.nextInt();
        int total = 1;
        for (int i = 1; i <= k; i++) {
            total*=n;
        }
        System.out.println("Cevap:"+total);
    }
}
