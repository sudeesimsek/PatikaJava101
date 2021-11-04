package Modul2;

import java.util.Scanner;

public class girilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, i = 1;
        System.out.print("Sayı Giriniz:");
        k = input.nextInt();
        while ((i <= k)) {
            i++;
            while (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
